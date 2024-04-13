using static ImperiumParser;

namespace AntlrCSharp
{

    public class AstDefinition : AstStmt
    {
        public readonly bool IsKeyword;
        public readonly bool Structure;
        public string Spelling { get; private set; }
        public AstDefinition(DefineStmtContext C) : base(C)
        {
            Spelling = AstSupport.GetSpelling(C.identifier(), out IsKeyword);

            if (C.structType() != null)
                Structure = true;
        }

        public override string ToString()
        {
            return $"(def) {Spelling}";
        }

    }
}