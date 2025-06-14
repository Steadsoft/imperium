using static SyscodeParser;

namespace Syscode
{
    public static class LexerHelper
    {
        public static class TokenText
        {
            public static readonly string BIT = SyscodeLexer.DefaultVocabulary.GetLiteralName(SyscodeParser.BIT).Replace("'", "");
            public static readonly string INT = SyscodeLexer.DefaultVocabulary.GetLiteralName(BIN).Replace("'", "");
            public static readonly string LP = SyscodeLexer.DefaultVocabulary.GetLiteralName(LPAR).Replace("'", "");
            public static readonly string RP = SyscodeLexer.DefaultVocabulary.GetLiteralName(RPAR).Replace("'", "");
            public static readonly string STR = SyscodeLexer.DefaultVocabulary.GetLiteralName(STRING).Replace("'", "");

            static TokenText()
            {

            }
        }
    }
}