using Antlr4.Runtime;

namespace Syscode
{
    public class StructureMember : AstNode
    {
        public int Ordinal;
        public string Spelling;

        public StructureMember(ParserRuleContext context) : base(context)
        {
            Ordinal = context.Start.StartIndex;
        }
    }
}