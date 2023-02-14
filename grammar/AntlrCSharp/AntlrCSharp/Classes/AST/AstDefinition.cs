using static ImperiumParser;

namespace AntlrCSharp
{

    public class AstDefinition : AstStmt
    {
        public readonly bool IsKeyword;

        public string Spelling { get; private set; }
        public AstDefinition(DefineStmtContext C) : base(C)
        {
            Spelling = AstSupport.GetSpelling(C.identifier(), out IsKeyword);
        }

        public override string ToString()
        {
            return $"(def) {Spelling}";
        }

    }
}