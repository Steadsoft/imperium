using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
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

            //compiler.PrintConcreteSyntaxTree(cst);

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
                //typeof(IfKeywordContext),
                //typeof(ThenKeywordContext),
                //typeof(ElifKeywordContext),
                //typeof(ElseKeywordContext),
                //typeof(ScopeKeywordContext),
                //typeof(StructKeywordContext) ,
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
            return context switch
            {
                SourceContext source => CreateProgram(source),
                ProcedureContext procedure => CreateProcedure(procedure),
                ScopeContext scope => CreateScope(scope),
                StructContext structure => CreateStructure(structure),
                IfContext ifContext => CreateIf(ifContext),
                AssignmentContext assignment => CreateAssignment(assignment),
                DeclareContext declare => new Dcl(declare),
                _ => new AstNode(context)
            };
        }
        private Expression CreateExpression(ExpressionContext context)
        {
            Expression expr = new(context);


            switch (context)
            {
                case ExprPrimitiveContext primContext:
                    {
                        var prim = primContext.GetNode<PrimitiveExpressionContext>();

                        if (prim.TryGetNode<ReferenceContext>(out var refcontext))
                        {
                            expr.Reference = CreateRefererence(refcontext);
                        }

                        if (prim.TryGetNode<NumericLiteralContext>(out var numcontext))
                        {
                            var txt = numcontext.GetText();
                            expr.Literal = new Literal(numcontext) { Value = txt };
                        }

                        if (prim.TryGetNode<StringLiteralContext>(out var strcontext))
                        {
                            var txt = strcontext.GetText();
                            expr.Literal = new Literal(strcontext) { Value = txt };
                        }

                        return expr;
                    }
                case ExprParenthesizedContext paren:
                    {
                        var parenctxt = paren.GetNode<ParenthesizedExpressionContext>();
                        var expression = parenctxt.GetNode<ExpressionContext>();
                        return CreateExpression(expression);
                    }
                case ExprPrefixedContext prefixed:
                    {
                        break;
                    }
                case ExprBinaryContext binary:
                    {
                        expr.Left = CreateExpression(binary.Left);
                        expr.Right = CreateExpression(binary.Rite);

                        var op = binary.children.Where(c => c is not ExpressionContext).Cast<ParserRuleContext>().Single();

                        expr.Operator = GetOperator(op);

                        return expr; ;
                    }
                default:  // every other case always contains an operator and a left/right expression. 
                    {
                        throw new InvalidOperationException("Unexpected expression class encountered.");
                    }
            }

            return expr;

        }
        private Operator GetOperator(ParserRuleContext context)
        {
            var terminal = (TerminalNodeImpl)context.children.Where(c => c is TerminalNodeImpl).Single();

            var symbol = terminal.Symbol.Type;

            return symbol switch
            {
                PLUS => Operator.PLUS,
                MINUS => Operator.MINUS,
                TIMES => Operator.TIMES,
                DIVIDE => Operator.DIVIDE,
                _ => Operator.Undefined
            };

        }
        private Assignment CreateAssignment(AssignmentContext context)
        {
            var refContext = context.GetNode<ReferenceContext>();
            var reference = CreateRefererence(refContext);
            var exprContext = context.GetNode<ExpressionContext>();
            var expression = CreateExpression(exprContext);

            return new Assignment(context) {  Refrenece = reference, Expression = expression };
        }
        private Reference CreateRefererence(ReferenceContext context)
        {
            Reference reference = new(context);

            // A Reference might contain another Reference...

            if (context.TryGetNode<ReferenceContext>(out var inner))
            {
                reference.reference = CreateRefererence(inner);
            }

            // TODO: process the optional ArgList list..

            reference.basic = CreateBasicReference(context.GetNode<BasicReferenceContext>());

            return reference;
        }
        private BasicReference CreateBasicReference(BasicReferenceContext context)
        {
            BasicReference basic = new BasicReference(context);

            if (context.TryGetNode<StructureQualificationListContext>(out var qualification))
            {
                basic.qualifier = qualification.GetNodes<StructureQualificationContext>().Select(q => new Qualification(q)).ToList();
            }

            return basic;
        }
        private List<ParserRuleContext> GetUnderlyingStatemts(ParserRuleContext context)
        {
            return context.GetNodes<StatementContext>().SelectMany(s => s.GetNodes<RealStatementContext>().Select(n => n.GetNode<ParserRuleContext>())).ToList();
        }
        private  string RemoveContext(string input)
        {
            return input.Replace("Context", "");
        }
        private Program CreateProgram(SourceContext context)
        {

            return new Program(context) { Statements = GetUnderlyingStatemts(context).Select(s => GenerateAbstractSyntaxTree(s)).ToList() };
        }
        private Scope CreateScope(ScopeContext context)
        {
            if (context.TryGetNode<BlockScopeContext>(out var block))
            {
                return new Scope(block) { Spelling = block.GetNode<QualifiedNameContext>().GetText(), Statements = GetUnderlyingStatemts(block).Select(s => GenerateAbstractSyntaxTree(s)).ToList() };
            }
            else
            {
                var linescope = context.GetNode<LineScopeContext>();
                return new Scope(linescope) { Spelling = linescope.GetNode<QualifiedNameContext>().GetText() };
            }

        }
        private Structure CreateStructure(StructContext context)
        {
            return CreateStructure(context.GetNode<StructDefinitionContext>());
        }
        private Structure CreateStructure(StructDefinitionContext context)
        {
            var elements = new List<StructureMember>();
            var bounds = new List<BoundsPair>();
            var struct_name = context.GetNode<StructNameContext>();
            var spelling = struct_name.GetLabelText(nameof(StructNameContext.Spelling));

            if (context.TryGetNode<DimensionSuffixContext>(out var dimensions))
            {
                bounds = CreateBounds(dimensions);
            }

            var members = context.GetNode<StructMembersContext>();
            var fields = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructFieldContext>()).Select(d => CreateField(d)).ToList();
            var structs = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructDefinitionContext>()).Select(s => CreateStructure(s)).ToList();

            elements.AddRange(fields);
            elements.AddRange(structs);

            return new Structure(context) { Spelling = spelling, Bounds = bounds, Members = elements };
        }
        private Field CreateField(StructFieldContext context)
        {
            var bounds = new List<BoundsPair>();

            if (context.TryGetNode<SyscodeParser.DimensionSuffixContext>(out var dimensions))
            {
                bounds = CreateBounds(dimensions);
            }

            return new Field(context) { Bounds = bounds };
        }
        private List<BoundsPair> CreateBounds(DimensionSuffixContext context)
        {
            var bounds = new List<BoundsPair>();
            var commalist = context.GetNode<BoundPairCommalistContext>(); ;
            var pairs = commalist.GetNodes<BoundPairContext>();

            var lower = pairs.Select(p => p.GetNode<LowerBoundContext>().GetNode<ExpressionContext>());
            var upper = pairs.Select(p => p.GetNode<UpperBoundContext>().GetNode<ExpressionContext>());

            bounds = pairs.Select(p => new BoundsPair(p) { Lower = null /* lower */ , Upper = null /* upper */}).ToList();

            return bounds;
        }
        private Procedure CreateProcedure(ProcedureContext context)
        {
            var node = new Procedure(context);

            node.Spelling = context.GetLabelText(nameof(ProcedureContext.Spelling));

            if (context.TryGetNode<ParamListContext>(out var parameters))
            {
                node.Parameters = [.. parameters.GetNodes<IdentifierContext>().Select(i => i.GetText())];   
            }

            node.Statements = [.. GetUnderlyingStatemts(context).Select(s => GenerateAbstractSyntaxTree(s))];

            return node;
        }
        private Elif CreateElif(ExprThenBlockContext context)
        {
            return new Elif(context) { Expr = null, ThenStatements = GetUnderlyingStatemts(context.GetNode<ThenBlockContext>()).Select(s => GenerateAbstractSyntaxTree(s)).ToList() }; 
        }
        private If CreateIf(IfContext context)
        {
            List<AstNode> else_stmts = new();
            List<Elif> elifs = new();

            var if_then_block = context.GetNode<ExprThenBlockContext>().GetNode<ThenBlockContext>();
            var if_then_stmts = GetUnderlyingStatemts(if_then_block).Select(s => GenerateAbstractSyntaxTree(s)).ToList();

            if (context.TryGetNode<ElseBlockContext>(out var else_block))
            {
                var then_block = else_block.GetNode<ThenBlockContext>();
                else_stmts = GetUnderlyingStatemts(then_block).Select(s => GenerateAbstractSyntaxTree(s)).ToList();
            }
            
            if (context.TryGetNode<ElifBlockContext>(out var elif_block))
            {
                var then_blocks = elif_block.GetNodes<ExprThenBlockContext>();
                elifs = then_blocks.Select(etb => CreateElif(etb)).ToList();
            }

            return new If(context) { ThenStatements = if_then_stmts, ElseStatements = else_stmts, ElifStatements = elifs };
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

            var children = context.GetChildren(excludedTypes);

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
                case Reference reference:
                    {
                        Console.WriteLine($"{LineDepth(depth, node)} {reference.ToString()}");
                        break;
                    }
                case Assignment assign:
                    {
                        Console.WriteLine($"{LineDepth(depth, node)} {node.GetType().Name}");

                        depth++;
                        PrintAbstractSyntaxTree(assign.Refrenece, depth);
                        depth--;
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
                        Console.WriteLine($"{LineDepthEnd(depth, ifstmt)} End");
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

                        var children = ((IStatementContainer)(proc)).Statements;

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
                case Dcl dcl:
                    {
                        Console.WriteLine($"{LineDepth(depth, dcl)} {node.GetType().Name} '{dcl.Spelling}'");
                        break;
                    }

                case Scope scope:
                    {
                        Console.WriteLine($"{LineDepth(depth, scope)} {node.GetType().Name} '{scope.Spelling}'");
                        var children = ((IStatementContainer)(scope)).Statements;

                        if (children.Any())
                        {
                            foreach (var child in children)
                            {
                                depth++;
                                PrintAbstractSyntaxTree(child, depth);
                                depth--;
                            }
                        }
                        
                        if (scope.IsBlockScope)
                            Console.WriteLine($"{LineDepthEnd(depth, scope)} End");
                        break;
                    }
                case IStatementContainer statement:
                    {
                        Console.WriteLine(LineDepth(depth, node) + " " + node.GetType().Name);

                        var children = ((IStatementContainer)(node)).Statements;

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