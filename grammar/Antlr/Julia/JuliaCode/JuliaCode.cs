using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using System.Threading.Tasks;
using SourceContext = JuliaParser.SourceContext;

namespace JuliaCode
{
    public class JuliaCode
    {
        public static void Main()
        {
            var source = new StreamReader(@"..\..\..\..\test1.julia");
            var stream = new AntlrInputStream(source);
            var lexer = new JuliaLexer(stream);
            var tokens = new CommonTokenStream(lexer);
            var parser = new JuliaParser(tokens);

            var cst = parser.source();

            var ast = TreeWalker.TransformTree(cst);
        }
    }


    public static class TreeWalker
    {
        public static int depth = 0;
        public static HashSet<Type> excludedTypes;
        static TreeWalker()
        {
            excludedTypes = new HashSet<Type>
            {
                typeof(JuliaParser.NewlinesContext),
                typeof(JuliaParser.StatementSeparatorContext),
                typeof(JuliaParser.MemberSeparatorContext) ,
                typeof(JuliaParser.IfKeywordContext),
                typeof(JuliaParser.ThenKeywordContext),
                typeof(JuliaParser.ElifKeywordContext),
                typeof(JuliaParser.ElseKeywordContext),
                typeof(JuliaParser.ScopeKeywordContext),
                typeof(JuliaParser.StructKeywordContext) ,
                typeof(JuliaParser.EndOfFileContext)
            };
        }

        public static void PrintTree(ParserRuleContext context)
        {
            Console.WriteLine(depth.ToString().PadRight(depth) + " " + RemoveContext(context.GetType().Name));

            var children = GetChildren(context);

            if (children.Any())
            {
                foreach (var child in children)
                {
                    depth++;
                    PrintTree(child);
                    depth--;
                }
            }
        }

        public static AstNode TransformTree(ParserRuleContext context)
        {
            var children = GetChildren(context); 

            if (context is SourceContext)
            {
                return TransformTree(children.Single());
            }

            if (context is JuliaParser.StatementsContext)
            {
                var node = new StatementsNode();

                foreach(var child in children)
                {
                    var statements = GetChildren(child); 

                    foreach (var statement in statements)
                    {
                        var newnode = statement switch
                        {
                            JuliaParser.ScopeContext => CreateScopeStatement((JuliaParser.ScopeContext)statement),
                            JuliaParser.StructContext => CreateStructStatement((JuliaParser.StructContext)statement),
                            JuliaParser.ProcedureContext => CreateProcedureStatement((JuliaParser.ProcedureContext)statement),
                            _ => new AstNode()
                        };

                        node.Statements.Add(newnode);
                    }
                }

                return node;
            }

            return null;
        }

        static string RemoveContext(string input)
        {
            return input.Replace("Context","");
        }

        public static List<ParserRuleContext> GetChildren(ParserRuleContext context)
        {
            return context.children.Where(c => (c is ParserRuleContext) && !excludedTypes.Contains(c.GetType())).Cast<ParserRuleContext>().ToList();
        }

        public static AstNode CreateScopeStatement(JuliaParser.ScopeContext context)
        {
            return new ScopeStatemetNode() { ScopeName = "" };
        }

        public static AstNode CreateStatementsNode()
        {
            return new StatementsNode();
        }

        public static AstNode CreateStructStatement(JuliaParser.StructContext context)
        {
            var node = new StructStatementNode();

            node.Name = context.Name.GetChild(0).ToString();

            foreach (var c in context.Members.children)
            {
                var member = new StructMemberNode();

                member.Name = ((JuliaParser.StructMemberContext)(c)).Name.GetChild(0).ToString();
                member.Type = ((JuliaParser.StructMemberContext)c).Type.GetChild(0).GetChild(0).ToString();

                node.Members.Add(member);
            }

            return node;
        }

        public static AstNode CreateProcedureStatement(JuliaParser.ProcedureContext context)
        {
            var node = new ProcedureNode();

            node.Name = context.Name.GetChild(0).ToString();

            node.Parameters = GetChildren(context.Params).Select(p => p.GetChild(0).ToString()).ToList();

            node.Statements = TransformTree(context.Statements);

            return node;
        }

        public static AstNode CreateConditionalStatement()
        {
            return new AstNode();
        }
    }

    public class AstNode
    {

    }

    public class ScopeStatemetNode : AstNode
    {
        public string ScopeName;
    }

    public class StatementsNode : AstNode
    {
        public List<AstNode> Statements = new List<AstNode>();
    }

    public class ProgramNode : AstNode
    {

    }

    public class StructStatementNode : AstNode
    {
        public string Name; 
        public List<StructMemberNode>  Members = new List<StructMemberNode>();

    }

    public class StructMemberNode : AstNode
    {
        public string Name;
        public string Type;
    }

    public class ProcedureNode : AstNode
    {
        public string Name;
        public List<string> Parameters = new List<string>();
        public AstNode Statements;
    }

}
