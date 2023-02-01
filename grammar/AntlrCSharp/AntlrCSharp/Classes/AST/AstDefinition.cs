using static ImperiumParser;

namespace AntlrCSharp
{

    public class AstDefinition : AstStmt
    {
        public string Spelling { get; private set; }
        public AstDefinition(DefineStmtContext C) : base(C)
        {
            Spelling = AstSupport.GetSpelling(C.identifier());
        }

        public override string ToString()
        {
            return $"(def) {Spelling}";
        }

    }
}