using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstDeclaration : AstStmt
    {
        public string Spelling { get; private set; }
        public AstDeclaration(DeclareStmtContext C) : base(C)
        {
            if (C.declarationBody() != null)
                Spelling = AstSupport.GetSpelling(C.declarationBody().identifier());
            else
                Spelling = AstSupport.GetSpelling(C.identifier());

        }

        public override string ToString()
        {
            return $"(dcl) {Spelling}";
        }

    }
}