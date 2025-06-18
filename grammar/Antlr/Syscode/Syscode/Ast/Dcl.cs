using Antlr4.Runtime;

namespace Syscode
{
    public class Dcl : AstNode
    {
        public string TypeName;
        public List<int> Bounds = new List<int>();
        public int Length;
        public string Spelling;
        public Dcl(ParserRuleContext context) : base(context)
        {
            if (context.TryGetNode<SyscodeParser.ConstArrayListContext>(out var constList))
            {
                Bounds = constList.GetNodes<SyscodeParser.NumericConstantContext>().Select(x => Convert.ToInt32(x.GetText())).ToList();
            }

            Spelling = context.GetLabelText(nameof(SyscodeParser.DeclareContext.Spelling));
        }
    }
}