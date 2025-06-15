using Antlr4.Runtime;

namespace Syscode
{
    public class If : AstNode
    {
        public AstNode Expr;
        public List<AstNode> ThenStatements = new List<AstNode>();
        public List<AstNode> ElseStatements = new List<AstNode>();   
        public List<Elif> ElifStatements = new List<Elif>();

        public If(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }

        public override string ToString()
        {
            return $"{nameof(If)}: ";
        }
    }

    public class Elif : AstNode
    {
        public AstNode Expr;
        public List<AstNode> ThenStatements = new List<AstNode>();

        public Elif(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }

        public override string ToString()
        {
            return $"{nameof(If)}: ";
        }
    }
}