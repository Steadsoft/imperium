using Antlr4.Runtime;
using System.Text;
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

            foreach ( var type in types )
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
        public void PrintConcreteSyntaxTree(ParserRuleContext context, int depth=0)
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
            switch (node)
            {
                case Structure structure:
                    {
                        Console.WriteLine($"{depth.ToString().PadRight(depth)} {node.GetType().Name} {((Structure)(node)).Spelling}");

                        var children = ((Structure)(node)).Members;

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
                case Field field:
                    {
                        Console.WriteLine($"{depth.ToString().PadRight(depth)} {node.GetType().Name} ({((Field)(node)).Spelling} {((Field)(node)).TypeName} {((Field)(node)).Length})");
                        break;
                    }
                case IStatements statement:
                    {
                        Console.WriteLine(depth.ToString().PadRight(depth) + " " + node.GetType().Name);

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
        public Program GenerateAbstractSyntaxTree(SourceContext context)
        {
            return new Program(context) { Statements = GenerateAbstractSyntaxTree(context.GetNode<StatementsContext>()) };
        }
        public List<AstNode> GenerateAbstractSyntaxTree(ParserRuleContext context)
        {

            if (context is StatementsContext)
            {
                var children = GetChildren(context);
                var node = new List<AstNode>(); //new StatementsNode(context);

                foreach (var child in children)
                {
                    var statements = GetChildren(child);

                    foreach (var statement in statements)
                    {
                        var newnode = statement switch
                        {
                            ScopeContext match => CreateScope(match),
                            StructContext match => CreateStruct(match.GetNode<StructDefinitionContext>()),
                            ProcedureContext match => CreateProcedure(match),
                            ConditionalContext match => CreateIf(match),
                            _ => new AstNode(statement)
                        };

                        node.Add(newnode);
                    }
                }

                return node;
            }

            return null;
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
        private  AstNode CreateScope(ScopeContext context)
        {
            return new Scope(context) { Spelling = context.Name.GetText() };
        }
        private Structure CreateStruct(StructDefinitionContext context)
        {
            var elements = new List<StructureMember>();
            var name = context.GetNode<StructNameContext>();
            var spelling = name.GetLabelText("Spelling");
            var bounds = name.GetNode<ConstArrayListContext>().GetNodes<NumericConstantContext>().Select(x => Convert.ToInt32(x.GetText())).ToList();
            var members = context.GetNode<StructMembersContext>();
            var fields = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructFieldContext>()).Select(d => new Field(d)).ToList();
            var structs = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructDefinitionContext>()).Select(s => CreateStruct(s)).ToList();

            elements.AddRange(fields);
            elements.AddRange(structs);

            return new Structure(context) { Spelling = spelling, Bounds = bounds, Members = elements };
        }
        private AstNode CreateProcedure(ProcedureContext context)
        {
            var node = new Procedure(context);

            node.Spelling = context.Name.GetText(); //.GetChild(0).ToString();

            node.Parameters = [.. GetChildren(context.Params).Select(p => p.GetChild(0).ToString())];

            node.Statements = GenerateAbstractSyntaxTree(context.Statements);

            return node;
        }
        private AstNode CreateIf(ConditionalContext context)
        {
            var then_stmts = context.GetNode<ExprThenBlockContext>().GetNode<ThenBlockContext>().GetNode<StatementsContext>();
            var elif_stmts = context.GetNode<ElifBlockContext>().GetNodes<ExprThenBlockContext>();
            var else_stmts = context.GetNode<ElseBlockContext>().GetNode<StatementsContext>(); ; ;

            List<AstNode> thens = new List<AstNode>();
            List<AstNode> elses = new List<AstNode>();

            thens = GenerateAbstractSyntaxTree(then_stmts);
            elses  = GenerateAbstractSyntaxTree(else_stmts);

            return new If(context) { ThenStatements = thens, ElseStatements = elses };
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
            int count = 0;

            if (type.Length > 64)
            {
                // here count = ceil(Length / 64)
                count = (type.Length + 63) / 64;   // bit strings will be stored as arrays of bytes, words or whatever...
            }


            return type.TypeName switch
            {
                "int" => $"i{type.Length}",
                "bit" => $"i{type.Length}",
                "string" => $"[{type.Length} x i8]",
                _ => "notyet" //throw new NotImplementedException()
            };
        }
    }
}