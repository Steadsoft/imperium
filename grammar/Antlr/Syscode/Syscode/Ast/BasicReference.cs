using Antlr4.Runtime;
using System.Text;
using static SyscodeParser;

namespace Syscode
{
    public class BasicReference : AstNode
    {
        public string Spelling;
        public List<Qualification> qualifier = new();
        public BasicReference(ParserRuleContext context) : base(context)
        {
            Spelling = context.GetLabelText(nameof(BasicReferenceContext.Spelling));
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder();

            foreach (var qual in qualifier)
            {
                builder.Append($"{qual.Spelling}.");
            }

            builder.Append(Spelling);

            return builder.ToString();
        }
    }
}