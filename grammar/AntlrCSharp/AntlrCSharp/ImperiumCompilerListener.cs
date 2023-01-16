using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
    internal class ImperiumCompilerListener : ImperiumBaseListener
    {
        public override void ExitLOOP([NotNull] ImperiumParser.LOOPContext context)
        {
            base.ExitLOOP(context);
        }
    }
}
