using Antlr4.Runtime;

namespace Syscode
{
    public class Assignment : AstNode
    {
        public Reference Refrenece;
        public Expression Expression;
        public Assignment(ParserRuleContext context) : base(context)
        {

        }
    }
}
