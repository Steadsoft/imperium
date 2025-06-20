using System.Text;
using static SyscodeParser;

namespace Syscode
{
    public class Reference : AstNode
    {
        public Reference reference = null; // only populated if this ref is the left of ref -> ref
        public List<Arguments> ArgSet= new();
        public BasicReference basic = null;

        public Reference(ReferenceContext context) : base(context)
        {
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder();

            if (reference != null)
            {
                builder.Append(reference.ToString());
                builder.Append(" -> ");
            }

           builder.Append(basic.ToString());
           return builder.ToString();
        }
    }
}