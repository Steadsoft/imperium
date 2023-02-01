using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstStmt : AstNode
    {
        public AstStmt(DeclareStmtContext C) : base(C.Start.Line)
        {
            ;
        }

        public AstStmt(DefineStmtContext C) : base(C.Start.Line)
        {
            ;
        }

        public AstStmt(ExecutableStmtContext C) : base(C.Start.Line)
        {
            ;
        }
    }
}