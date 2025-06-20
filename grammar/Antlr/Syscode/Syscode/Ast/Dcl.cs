using Antlr4.Runtime;
using static SyscodeParser;

namespace Syscode
{
    public class Dcl : AstNode
    {
        public string TypeName;
        public List<BoundsPair> Bounds = new();
        public int Length;
        public string Spelling;
        public Dcl(ParserRuleContext context) : base(context)
        {
            if (context.TryGetNode<DimensionSuffixContext>(out var dimensions))
            {
                var commalist = dimensions.GetNode<BoundPairCommalistContext>(); ;
                var pairs = commalist.GetNodes<BoundPairContext>();

                var lower = pairs.Select(p => p.GetNode<LowerBoundContext>().GetNode<ExpressionContext>());
                var upper = pairs.Select(p => p.GetNode<UpperBoundContext>().GetNode<ExpressionContext>());

                pairs.Select(p => new BoundsPair(p) { Lower = null /* lower */ , Upper = null /* upper */});
            }

            Spelling = context.GetLabelText(nameof(DeclareContext.Spelling));
        }
    }

    public class BoundsPair : AstNode
    {
        public Expression Upper;
        public Expression Lower;

        public BoundsPair(ParserRuleContext context) : base(context)
        {
        }
    }

    public class Expression : AstNode
    {
        public Expression(ParserRuleContext context) : base(context)
        {
        }
    }
}