using Antlr4.Runtime;

namespace Syscode
{
    public class Elif : AstNode
    {
        public AstNode Expr;
        public List<AstNode> ThenStatements = new List<AstNode>();

        public Elif(ParserRuleContext context) : base(context)
        {
        }

        public override string ToString()
        {
            return $"{nameof(If)}: ";
        }
    }
}