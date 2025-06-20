using Antlr4.Runtime;

namespace Syscode
{
    public class Expression : AstNode
    {
        public Expression(ParserRuleContext context) : base(context)
        {
        }
    }
}