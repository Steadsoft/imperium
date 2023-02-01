using static ImperiumParser;

namespace AntlrCSharp
{
    public class AstNode
    {
        public int Line { get; private set; }
        public AstNode(int Line)
        {
            this.Line = Line;
        }
    }

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

    public class AstStmtBlock : AstNode
    {
        public List<AstStmt> Statements { get; private set; } = new List<AstStmt>();

        public AstStmtBlock(StmtBlockContext context) : base(context.Start.Line)
        {

        }

        public void AddStatement(AstStmt stmt)
        { 
            Statements.Add(stmt);
        }
    }

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

    public class AstExecutableStmt : AstStmt
    {
        public AstExecutableStmt(ExecutableStmtContext C) : base(C)
        {
            ;
        }
    }

    public class AstDeclaration : AstStmt
    {
        public AstDeclaration(DeclareStmtContext C) : base(C)
        {
            ;
        }
    }

    public class AstDefinition : AstStmt
    {
        public AstDefinition(DefineStmtContext C) : base(C)
        {
            ;
        }
    }
}