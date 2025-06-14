using Antlr4.Runtime;

namespace Syscode
{
    public class If : AstNode
    {
        public AstNode Expr;
        public List<AstNode> ThenStatements = new List<AstNode>();
        public List<AstNode> ElseStatements = new List<AstNode>();   

        public If(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }

        public override string ToString()
        {
            return $"{nameof(If)}: ";
        }
    }
}