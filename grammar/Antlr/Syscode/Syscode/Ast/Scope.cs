using Antlr4.Runtime;

namespace Syscode
{
    public class Scope : AstNode
    {
        public string Spelling;

        public Scope(ParserRuleContext context) : base(context)
        {
        }
    }
}