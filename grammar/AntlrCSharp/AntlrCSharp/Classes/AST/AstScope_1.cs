using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstScope : AstNode
    {
        public AstScope(ScopeContext context) : base(context.Start.Line)
        {

        }

        public void AddStatement(AstStmt stmt)
        { 
            Children.Add(stmt);
        }
    }
}