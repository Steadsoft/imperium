using Antlr4.Runtime;
using System.Text;
using System.Text.RegularExpressions;
using static SyscodeParser;

namespace Syscode
{
    public class Syscode
    {
        public static void Main()
        {
            var compiler = new SyscodeCompiler();

            var cst = compiler.CompileSourceFile(@"..\..\..\..\test1.sys");

            compiler.PrintConcreteSyntaxTree(cst);

            var ast = compiler.GenerateAbstractSyntaxTree(cst);

            compiler.PrintAbstractSyntaxTree(ast);

            var types = compiler.GetLLVMStructTypes(ast);

            Console.WriteLine();
            Console.WriteLine("LLVM TYPES");
            Console.WriteLine();

            foreach (var type in types)
            {
                Console.WriteLine($"{type.Item1} = type {type.Item2}");
            }
        }
    }

    public class SyscodeCompiler
    {
        private static HashSet<Type> excludedTypes;

        static SyscodeCompiler()
        {
            excludedTypes = new HashSet<Type>
            {
                typeof(EmptyLinesContext),
                typeof(StatementSeparatorContext),
                typeof(MemberSeparatorContext) ,
                typeof(IfKeywordContext),
                typeof(ThenKeywordContext),
                typeof(ElifKeywordContext),
                typeof(ElseKeywordContext),
                typeof(ScopeKeywordContext),
                typeof(StructKeywordContext) ,
                typeof(EndOfFileContext)
            };
        }

        private SyscodeLexer lexer;
        private SourceContext cst;
        private IVocabulary vocabulary;
        public SyscodeCompiler()
        {
        }
        public SourceContext CompileSourceFile(string File)
        {
            var source = new StreamReader(File);
            var stream = new AntlrInputStream(source);
            lexer = new SyscodeLexer(stream);
            vocabulary = SyscodeLexer.DefaultVocabulary;
            var tokens = new CommonTokenStream(lexer);
            var parser = new SyscodeParser(tokens);

            return parser.source();
        }
        public AstNode GenerateAbstractSyntaxTree(ParserRuleContext context)
        {
                switch (context)
                {
                case SourceContext source:
                    {
                        return CreateProgram(source);
                    }
                case ProcedureContext procedure:
                    {
                        return CreateProcedure(procedure);
                    }
                case ScopeContext scope:
                    {
                        return CreateScope(scope);
                    }
                case StructContext structure:
                    {
                        return CreateStructure(structure);
                    }
                case IfContext ifContext:
                    {
                        return CreateIf(ifContext);
                    }
                case AssignmentContext assignment:
                    {
                        return new Assignment(assignment);
                    }
                default:
                        return new AstNode(context);
                }
        }
       
        private List<ParserRuleContext> GetUnderlyingStatemts(ParserRuleContext context)
        {
            return context.GetNodes<StatementContext>().SelectMany(s => s.GetNodes<RealStatementContext>().Select(n => n.GetNode<ParserRuleContext>(RuleType.Required))).ToList();
        }
        private  string RemoveContext(string input)
        {
            return input.Replace("Context", "");
        }
        internal static List<ParserRuleContext> GetChildren(ParserRuleContext context)
        {
            if (context.children == null)
                return new List<ParserRuleContext>();

            return context.children.Where(c => (c is ParserRuleContext) && !excludedTypes.Contains(c.GetType())).Cast<ParserRuleContext>().ToList();
        }
        private Program CreateProgram(SourceContext context)
        {
            return new Program(context) { Statements = GetUnderlyingStatemts(context).Select(s => GenerateAbstractSyntaxTree(s)).ToList() };
        }
        private Scope CreateScope(ScopeContext context)
        {
            return new Scope(context) { Spelling = context.Name.GetText() };
        }
        private Structure CreateStructure(StructContext context)
        {
            return CreateStructure(context.GetNode<StructDefinitionContext>(RuleType.Required));
        }
        private Structure CreateStructure(StructDefinitionContext context)
        {
            var elements = new List<StructureMember>();
            var name = context.GetNode<StructNameContext>(RuleType.Required);
            var spelling = name.GetLabelText("Spelling");
            var bounds = name.GetNode<ConstArrayListContext>(RuleType.Required).GetNodes<NumericConstantContext>().Select(x => Convert.ToInt32(x.GetText())).ToList();
            var members = context.GetNode<StructMembersContext>(RuleType.Required);
            var fields = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructFieldContext>()).Select(d => new Field(d)).ToList();
            var structs = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructDefinitionContext>()).Select(s => CreateStructure(s)).ToList();

            elements.AddRange(fields);
            elements.AddRange(structs);

            return new Structure(context) { Spelling = spelling, Bounds = bounds, Members = elements };
        }
        private Procedure CreateProcedure(ProcedureContext context)
        {
            var node = new Procedure(context);

            node.Spelling = context.Name.GetText(); 
            node.Parameters = [.. GetChildren(context.Params).Select(p => p.GetChild(0).ToString())];
            node.Statements = GetUnderlyingStatemts(context).Select(s => GenerateAbstractSyntaxTree(s)).ToList();

            return node;
        }
        private Elif CreateElif(ExprThenBlockContext context)
        {
            return new Elif(context) { Expr = null, ThenStatements = GetUnderlyingStatemts(context.GetNode<ThenBlockContext>(RuleType.Required)).Select(s => GenerateAbstractSyntaxTree(s)).ToList() }; 
        }
        private If CreateIf(IfContext context)
        {
            List<AstNode> else_stmts = new();
            List<Elif> elifs = new();

            var then_block = context.GetNode<ExprThenBlockContext>(RuleType.Required).GetNode<ThenBlockContext>(RuleType.Required);
            var then_stmts = GetUnderlyingStatemts(then_block).Select(s => GenerateAbstractSyntaxTree(s)).ToList();
            var else_block = context.GetNode<ElseBlockContext>(RuleType.Optional)?.GetNode<ThenBlockContext>(RuleType.Required);
            
            if (else_block != null) 
                else_stmts = GetUnderlyingStatemts(else_block).Select(s => GenerateAbstractSyntaxTree(s)).ToList();

            var elif_blocks = context.GetNode<ElifBlockContext>(RuleType.Optional)?.GetNodes<ExprThenBlockContext>();

            if (elif_blocks != null)
                elifs = elif_blocks.Select(etb => CreateElif(etb)).ToList(); ;
            
            return new If(context) { ThenStatements = then_stmts, ElseStatements = else_stmts, ElifStatements = elifs };
        }
        public string GetText(Antlr4.Runtime.Tree.ITerminalNode Node)
        {
            return Node.GetText();
        }
        public List<(string, string)> GetLLVMStructTypes(AstNode node)
        {
            List<(string, string)> types = new List<(string, string)>();

            switch (node)
            {
                case Procedure proc:
                    {
                        foreach (var n in proc.Statements)
                        {
                            types.AddRange(GetLLVMStructTypes(n));
                        }
                        break;
                    }
                case Program prog:
                    {
                        foreach (var n in prog.Statements)
                        {
                            types.AddRange(GetLLVMStructTypes(n));
                        }
                        break;
                    }

                case Structure structure:
                    {
                        var txt = GetLLVMStructType(structure);
                        types.Add(($"%{structure.Spelling}", txt));

                        foreach (var m in structure.Members)
                        {
                            if (m is Structure)
                            {
                                var mmm = GetLLVMStructTypes((Structure)m);
                                types.AddRange(mmm);
                            }
                        }

                        break;
                    }
                default:
                    break;
            }

            return types;
        }
        public string GetLLVMStructType(Structure structure)
        {
            StringBuilder sb = new StringBuilder();

            foreach (var member in structure.Members.OrderBy(m => m.Ordinal))
            {
                switch (member)
                {
                    case Field f:
                        {
                            sb.Append($"{GetLLVMFieldType(f)}, ");
                            break;
                        }
                    case Structure s:
                        {
                            sb.Append($"%{s.Spelling}, ");
                            break;
                        }
                    default:
                        throw new NotImplementedException();
                }
            }

            var txt = $"{{ {sb.ToString().TrimEnd(' ', ',')} }}";

            return txt;

        }
        public string GetLLVMFieldType(Field type)
        {
            int bytes = 0;


            if (type.TypeName == "bit")
            {
                bytes = (type.Length + 7) / 8;

                return $"[{bytes} x i8]";

            }


            return type.TypeName switch
            {
                "bin" => $"i{type.Length}",
                //"bit" => $"i{type.Length}",
                "string" => $"[{type.Length} x i8]",
                _ => "notyet" //throw new NotImplementedException()
            };
        }
        public void PrintConcreteSyntaxTree(ParserRuleContext context, int depth = 0)
        {
            Console.WriteLine(depth.ToString().PadRight(depth) + " " + RemoveContext(context.GetType().Name));

            var children = GetChildren(context);

            if (children.Any())
            {
                foreach (var child in children)
                {
                    depth++;
                    PrintConcreteSyntaxTree(child, depth);
                    depth--;
                }
            }
        }
        public void PrintAbstractSyntaxTree(AstNode node, int depth = 0)
        {
            if (depth == 0)
            {
                Console.WriteLine("AST DUMP");
                Console.WriteLine();
                Console.WriteLine("LINE NEST STATEMENT");
                Console.WriteLine();
            }

            switch (node)
            {
                case Assignment assign:
                    {
                        Console.WriteLine($"{LineDepth(depth, node)} {node.GetType().Name}");
                        break;
                    }
                case If ifstmt:
                    {
                        Console.WriteLine($"{LineDepth(depth, node)} {node.GetType().Name}");

                        foreach (var child in ifstmt.ThenStatements)
                        {
                            depth++;
                            PrintAbstractSyntaxTree(child, depth);
                            depth--;
                        }
                        if (ifstmt.ElifStatements.Any())
                        {

                            foreach (var child in ifstmt.ElifStatements)
                            {
                                Console.WriteLine($"{LineDepth(depth, node)} Elif");

                                foreach (var elif in child.ThenStatements)
                                {
                                    depth++;
                                    PrintAbstractSyntaxTree(elif, depth);
                                    depth--;
                                }
                            }
                        }
                        if (ifstmt.ElseStatements.Any())
                        {
                            Console.WriteLine($"{LineDepth(depth, node)} Else");

                            foreach (var child in ifstmt.ElseStatements)
                            {
                                depth++;
                                PrintAbstractSyntaxTree(child, depth);
                                depth--;
                            }
                        }

                        break;
                    }
                case Structure structure:
                    {
                        Console.WriteLine($"{LineDepth(depth, structure)} {node.GetType().Name} '{structure.Spelling}'");
                        var children = structure.Members;

                        if (children.Any())
                        {
                            foreach (var child in children)
                            {
                                depth++;
                                PrintAbstractSyntaxTree(child, depth);
                                depth--;
                            }
                        }
                        Console.WriteLine($"{LineDepthEnd(depth, structure)} End");
                        break;
                    }
                case Field field:
                    {
                        Console.WriteLine($"{LineDepth(depth, node)} {node.GetType().Name} '{((Field)(node)).Spelling}' {((Field)(node)).TypeName} {((Field)(node)).Length}");
                        break;
                    }

                case Procedure proc:
                    {
                        Console.WriteLine($"{LineDepth(depth, proc)} {proc.GetType().Name} '{proc.Spelling}'");

                        var children = ((IStatements)(proc)).Statements;

                        if (children.Any())
                        {
                            foreach (var child in children)
                            {
                                depth++;
                                PrintAbstractSyntaxTree(child, depth);
                                depth--;
                            }
                        }
                        Console.WriteLine($"{LineDepthEnd(depth, proc)} End");
                        break;

                    }
                case IStatements statement:
                    {
                        Console.WriteLine(LineDepth(depth, node) + " " + node.GetType().Name);

                        var children = ((IStatements)(node)).Statements;

                        if (children.Any())
                        {
                            foreach (var child in children)
                            {
                                depth++;
                                PrintAbstractSyntaxTree(child, depth);
                                depth--;
                            }
                        }
                        break;
                    }
            }
        }
        public string LineDepth(int depth, AstNode node)
        {
            return $"{node.StartLine.ToString().PadRight(4)} {depth.ToString().PadRight(4 + depth)}";
        }
        public string LineDepthEnd(int depth, AstNode node)
        {
            return $"{node.StopLine.ToString().PadRight(4)} {depth.ToString().PadRight(4 + depth)}";
        }
    }
}