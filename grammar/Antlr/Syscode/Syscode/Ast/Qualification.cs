using Antlr4.Runtime;
using static SyscodeParser;

namespace Syscode
{
    public class Qualification : AstNode
    {
        public string Spelling;
        public List<Expression> arguments = new();
        public Qualification(ParserRuleContext context) : base(context)
        {
            Spelling = context.GetLabelText(nameof(StructureQualificationContext.Spelling));
        }

        public override string ToString()
        {
            return Spelling;
        }
    }
}