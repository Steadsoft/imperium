using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static ImperiumParser;

namespace AntlrCSharp
{
    public static class AstSupport
    {
        public static string GetSpelling(IdentifierContext C)
        {
            var i = C.IDENTIFIER();

            var k = C.keyword();

            if (i != null)
                return i.ToString();

            return k.GetText();
        }
    }
}
