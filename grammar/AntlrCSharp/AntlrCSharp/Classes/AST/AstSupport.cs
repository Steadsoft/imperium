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
