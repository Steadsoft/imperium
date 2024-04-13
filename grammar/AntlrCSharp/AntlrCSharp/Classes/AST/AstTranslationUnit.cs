using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstTranslationUnit : AstNode
    {

        public AstTranslationUnit(TranslationUnitContext C) : base(C.Start.Line)
        {
            ;
        }

        public void AddScope(AstScope scope)
        {
            Children.Add(scope);
        }
    }
}