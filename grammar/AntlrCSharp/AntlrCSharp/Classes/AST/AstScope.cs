using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstScope : AstNode
    {
        public string[] NameElements { get; private set; }
        public List<AstStmtBlock> StmtBlock { get; private set; } = new List<AstStmtBlock>(); // this is singular should not be a List...
        public static AstScope Create(ScopeContext C)
        {
            return new AstScope(C);
        }
        private AstScope(ScopeContext C):base(C.Start.Line)
        {
            NameElements = C.scopeStmt().identifier().Cast<IdentifierContext>().Select(id => AstSupport.GetSpelling(id)).ToArray();
        }

        public override string ToString()
        {
            return String.Join('.',NameElements);
        }

        public void AddStmtBlock (AstNode astStmtBlock)
        {
            StmtBlock.Add((AstStmtBlock)astStmtBlock);
        }
    }
}