using Antlr4.Runtime;

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
            if (context.TryGetNode<SyscodeParser.DimensionSuffixContext>(out var dimensions))
            {
                var commalist = dimensions.GetNode<SyscodeParser.BoundPairCommalistContext>(); ;
                var pairs = commalist.GetNodes<SyscodeParser.BoundPairContext>();

                var lower = pairs.Select(p => p.GetNode<SyscodeParser.LowerBoundContext>().GetNode<SyscodeParser.ExpressionContext>());
                var upper = pairs.Select(p => p.GetNode<SyscodeParser.UpperBoundContext>().GetNode<SyscodeParser.ExpressionContext>());

                pairs.Select(p => new BoundsPair(p) { Lower = null /* lower */ , Upper = null /* upper */});
            }

            Spelling = context.GetLabelText(nameof(SyscodeParser.DeclareContext.Spelling));
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