using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstDeclaration : AstStmt
    {
        // These attributes are integers and we count them
        // this is how we detect illegal repetitions.
        public readonly bool IsKeyword;
        public string Spelling { get; set; }
        public int BINARY { get; set; }
        public int DECIMAL { get; set; }
        public int POINTER { get; set; }
        public int BIT { get; set; }
        public int CHARACTER { get; set; }
        public int STRING { get; set; }
        public int ENTRY { get; set; }
        public int FIXED { get; set; }
        public int FLOAT { get; set; }
        public int OFFSET { get; set; }
        public int VARYING { get; set; }
        public int COROUTINE { get; set; }
        public int COFUNCTION { get; set; }
        public int BUILTIN { get; set; }
        public int INTRINSIC { get; set; }
        public int? numberOfDigits { get; set; }
        public int? scaleFactor { get; set; }
        public MaxStringLength StringLength { get; set; }
        public AstDeclaration(DeclareStmtContext C) : base(C)
        {
            //if (C.declarationBody() != null)
            //    Spelling = AstSupport.GetSpelling(C.declarationBody().identifier(), out IsKeyword);
            //else
            //    Spelling = AstSupport.GetSpelling(C.identifier(), out IsKeyword);

        }

        public override string ToString()
        {
            return $"(dcl) {Spelling}";
        }

        public class MaxStringLength
        {
            public bool Asterisk = false;
            public string? Identifier;
            public int INTEGER;
            public MaxStringLength() { }
        }

    }

    

   
}