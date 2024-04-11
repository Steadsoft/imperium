using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstStmtBlock : AstNode
    {
        public List<AstStmt> Statements { get; private set; } = new List<AstStmt>();

        public AstStmtBlock(PassiveStmtContext[] context) : base(context.First().Start.Line)
        {

        }

        public void AddStatement(AstStmt stmt)
        { 
            Statements.Add(stmt);
        }
    }
}