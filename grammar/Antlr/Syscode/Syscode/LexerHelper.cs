using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;
using static SyscodeParser;

namespace Syscode
{
    public static class LexerHelper
    {
        public static class TokenText
        {
            public static readonly string INT = SyscodeLexer.DefaultVocabulary.GetLiteralName(BIN).Replace("'", "");
            public static readonly string LP = SyscodeLexer.DefaultVocabulary.GetLiteralName(LPAR).Replace("'", "");
            public static readonly string RP = SyscodeLexer.DefaultVocabulary.GetLiteralName(RPAR).Replace("'", "");
            public static readonly string STR = SyscodeLexer.DefaultVocabulary.GetLiteralName(STRING).Replace("'", "");
        }
    }
}