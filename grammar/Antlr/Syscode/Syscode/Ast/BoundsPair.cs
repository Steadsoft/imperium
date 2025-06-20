using Antlr4.Runtime;

namespace Syscode
{
    public class BoundsPair : AstNode
    {
        public Expression Upper;
        public Expression Lower;

        public BoundsPair(ParserRuleContext context) : base(context)
        {
        }
    }
}