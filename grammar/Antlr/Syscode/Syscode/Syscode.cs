using Antlr4.Runtime;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using static SyscodeParser;

namespace Syscode
{
    public class Syscode
    {
        public static void Main()
        {
            //var source = new StreamReader(@"..\..\..\..\test1.sys");
            //var stream = new AntlrInputStream(source);
            //var lexer = new SyscodeLexer(stream);
            //var tokens = new CommonTokenStream(lexer);
            //var parser = new SyscodeParser(tokens);

            //var vocab = SyscodeLexer.DefaultVocabulary;

            //var txt = vocab.GetLiteralName(BIN);

            //var cst = parser.source();

            //var comments = tokens.GetTokens().Where(t => t.Channel == Lexer.Hidden).ToList();

            //var compiler = new SyscodeCompiler(lexer,parser);

            //compiler.PrintConcreteSyntaxTree(cst);

            //var ast = compiler.GenerateAbstractSyntaxTree(cst);

            var compiler = new SyscodeCompiler();

            var cst = compiler.CompileSourceFile(@"..\..\..\..\test1.sys");

            compiler.PrintConcreteSyntaxTree(cst);

            var ast = compiler.GenerateAbstractSyntaxTree(cst);

            //var types = compiler.GetLLVMStructTypes((StatementsNode)ast);
        }
    }

    public class SyscodeCompiler
    {
        public static HashSet<Type> excludedTypes;

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

        public ProgramNode GenerateAbstractSyntaxTree(SourceContext context)
        {
            return new ProgramNode(context) { Statements = GenerateAbstractSyntaxTree(context.GetNode<StatementsContext>()) };
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
                            ConditionalContext match => CreateConditional(match),

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
        private Struct CreateStruct(StructDefinitionContext context)
        {
            var name = context.GetNode<StructNameContext>();
            var spelling = name.GetLabelText("Spelling");
            var bounds = name.GetNode<ConstArrayListContext>().GetNodes<NumericConstantContext>().Select(x => Convert.ToInt32(x.GetText())).ToList();
            var members = context.GetNode<StructMembersContext>();
            var fields = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructFieldContext>()).Select(d => new StructField(d)).ToList();
            var structs = members.GetNodes<StructMemberContext>().SelectMany(m => m.GetNodes<StructDefinitionContext>()).Select(s => CreateStruct(s)).ToList();

            var elements = new List<StructMember>();

            elements.AddRange(fields);
            elements.AddRange(structs);

            var s = new Struct(context) { Spelling = spelling, Bounds = bounds, Members = elements };

            Console.WriteLine($"{s.Spelling} -> {s.IRType}");

            return s;


        }
        private AstNode CreateProcedure(ProcedureContext context)
        {
            var node = new Procedure(context);

            node.Spelling = context.Name.GetText(); //.GetChild(0).ToString();

            node.Parameters = [.. GetChildren(context.Params).Select(p => p.GetChild(0).ToString())];

            node.Statements = GenerateAbstractSyntaxTree(context.Statements);

            return node;
        }
        private AstNode CreateConditional(ConditionalContext context)
        {
            return new Conditional(context);
        }
        public string GetText(Antlr4.Runtime.Tree.ITerminalNode Node)
        {
            return Node.GetText();
        }

        //public List<(string, string)> GetLLVMStructTypes(ProgramNode program)
        //{
        //    List<(string,string)> types = new List<(string, string)>();

        //    foreach (AstNode Node in program.Statements)
        //    {
        //        switch (Node)

        //        {
        //            case Struct structure:
        //                {
        //                    var txt = GetLLVMStructType(structure);
        //                    types.Add((structure.Spelling,txt));

        //                    foreach (var m in structure.Members)
        //                    {
        //                        if (m is Struct)
        //                        {
        //                            //var mmm = GetLLVMStructTypes((Struct)m);
        //                            //types.AddRange(mmm);
        //                        }
        //                    }

        //                    break;
        //                }
        //            case Procedure procedure:
        //                {
        //                    var txt = GetLLVMStructTypes(procedure.Statements as StatementsNode);
        //                    types.AddRange(txt);
        //                    break;
        //                }
        //        }
        //    }

        //    return types;
        //}

        public string GetLLVMStructType(Struct structure)
        {
            StringBuilder sb = new StringBuilder();

            foreach (var member in structure.Members.OrderBy(m => m.Ordinal))
            {
                switch (member)
                {
                    case StructField f:
                        {
                            sb.Append($"{f.IRType}, ");
                            break;
                        }
                    case Struct s:
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
    }

    public static class SyscodeExtensions
    {
        public static R4 GetNode<R, R1, R2, R3, R4>(this ParserRuleContext context)
             where R : ParserRuleContext
             where R1 : ParserRuleContext
             where R2 : ParserRuleContext
             where R3 : ParserRuleContext
             where R4 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>().GetNode<R3>().GetNode<R4>();
        }
        public static R3 GetNode<R, R1, R2, R3>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext where R2 : ParserRuleContext where R3 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>().GetNode<R3>();
        }
        public static R2 GetNode<R, R1, R2>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext where R2 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>();
        }
        public static R1 GetNode<R, R1>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>();
        }
        public static T GetNode<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return null;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

            if (matches.Any() == false)
                return null;

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child.");

            return (T)matches.Single();
        }
        public static bool HasNode<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return false;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

            if (matches.Any() == false)
                return false;

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child.");

            return true;
        }
        public static List<T> GetNodes<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return new List<T>(); ;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).Cast<T>().ToList();

            if (matches.Any() == false)
                return new List<T>();

            return matches;
        }
        public static string GetLabelText(this ParserRuleContext context, string Label)
        {
            return ((ParserRuleContext)(context.GetType().GetField(Label).GetValue(context))).GetText();
        }

    }
    public class AstNode
    {
        public readonly int StartLine;
        public readonly int StartColumn;
        public readonly int StopLine;
        public readonly int StopColumn;

        public AstNode(ParserRuleContext context)
        {
            StartLine = context.Start.Line;
            StartColumn = context.Start.Column;
            StopLine = context.Stop.Line;
            StopColumn = context.Stop.Column;
        }
    }
    public class Scope : AstNode
    {
        public string Spelling;

        public Scope(ParserRuleContext context) : base(context)
        {
        }
    }
    public class ProgramNode : AstNode
    {
        public List<AstNode> Statements;
        public ProgramNode(ParserRuleContext context) : base(context)
        {
        }
    }
    public class Struct : StructMember
    {
        //public string Spelling;
        public List<int> Bounds = new List<int>();
        public List<StructMember> Members = new List<StructMember>();
        public Struct(ParserRuleContext context) : base(context)
        {
        }

        public override string ToString()
        {
            return Spelling;
        }

        public string IRType
        {
            get
            {
                StringBuilder sb = new StringBuilder();

                foreach (var member in Members.OrderBy(m => m.Ordinal))
                {
                    switch (member)
                    {
                        case StructField f:
                            {
                                sb.Append($"{f.IRType}, ");
                                break;
                            }
                        case Struct s:
                            {
                                sb.Append($"%{s.Spelling}, ");
                                break;
                            }
                        default:
                            throw new NotImplementedException();
                    }
                }
                return $"{{ {sb.ToString().TrimEnd(' ',',')} }}";
            }

        }

    }
    public class StructMember : AstNode
    {
        public int Ordinal;
        public string Spelling;

        public StructMember(ParserRuleContext context) : base(context)
        {
            Ordinal = context.Start.StartIndex;
        }
    }
    public class StructField : StructMember
    {
        //public string Spelling;
        public string TypeName;
        public int Length;
        public StructField(StructFieldContext context) : base(context)
        {
            Spelling = context.Name.GetText();
            var type = context.Type.GetText();

            if (type.Contains("("))
            {
                int lp = type.IndexOf("(");
                int rp = type.IndexOf(")");
                TypeName = type.Substring(0, lp);
                Length = Convert.ToInt32(type.Substring(lp+1,rp-(lp+1)));
            }
            else
            {
                if (type.StartsWith("int"))
                {
                    TypeName = "int";
                    Length = Convert.ToInt32(type.Substring(3));
                }
                if (type.StartsWith("string"))
                {
                    TypeName = "string";
                    Length = Convert.ToInt32(type.Substring(6));
                }
            }
        }

        public override string ToString()
        {
            return Spelling;
        }

        public string IRType
        {
            get
            {
                return TypeName switch
                {
                    "int" => $"i{Length}",
                    "string" => $"[{Length} x i8]",
                    _ => "notyet" //throw new NotImplementedException()
                }; 

            }
        }
    }
    public class Procedure : AstNode
    {
        public string Spelling;
        public List<string> Parameters = new List<string>();
        public List<AstNode> Statements;

        public Procedure(ParserRuleContext context) : base(context)
        {
        }
        public override string ToString()
        {
            return Spelling;
        }
    }
    public class Conditional : AstNode
    {
        public AstNode Expr;
        public AstNode ThenStatements;
        public AstNode ElseStatement;

        public Conditional(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }
    }
}