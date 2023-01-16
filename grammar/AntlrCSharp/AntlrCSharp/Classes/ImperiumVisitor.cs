using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static ImperiumParser;

namespace AntlrCSharp
{
    public class ImperiumVisitor : ImperiumBaseVisitor<object>
    {
        public ImperiumVisitor() : base()
        {
            ;
        }

        public override object VisitLOOP([NotNull] ImperiumParser.LOOPContext context)
        {
            if (context.children.First() is WHILE_UNTILContext wc)
            {
                if (wc.children.Where(c => c is While_optionContext woc).Any())
                {
                    var woc = wc.children.Where(c => c is While_optionContext).First();
                }
            }

            return base.VisitLOOP(context);
        }
    }
}
