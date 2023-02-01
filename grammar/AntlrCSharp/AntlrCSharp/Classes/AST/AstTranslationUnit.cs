using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstTranslationUnit : AstNode
    {
        public List<AstScope> Scopes { get; private set; } = new List<AstScope>();

        public AstTranslationUnit(TranslationUnitContext C) : base(C.Start.Line)
        {
            ;
        }

        public void AddScope(AstScope scope)
        {
            Scopes.Add(scope);
        }
    }
}