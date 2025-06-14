using Antlr4.Runtime;

namespace Syscode
{
    public class StructMember : AstNode
    {
        public int Ordinal;
        public string Spelling;

        public StructMember(ParserRuleContext context) : base(context)
        {
            Ordinal = context.Start.StartIndex;
        }
    }
}