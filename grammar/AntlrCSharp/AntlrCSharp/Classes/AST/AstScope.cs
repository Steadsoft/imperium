using static ImperiumParser;

namespace AntlrCSharp
{
    //public class AstScope : AstNode
    //{
    //    public string[] NameElements { get; private set; }
    //    public static AstScope Create(ScopeContext C)
    //    {
    //        return new AstScope(C);
    //    }
    //    private AstScope(ScopeContext C):base(C.Start.Line)
    //    {
    //        NameElements = C.scopeStart().identifier().Cast<IdentifierContext>().Select(id => AstSupport.GetSpelling(id, out var kw)).ToArray();
    //    }

    //    public override string ToString()
    //    {
    //        return String.Join('.',NameElements);
    //    }

    //    public void AddStmtBlock (AstNode astStmtBlock)
    //    {
    //        Children.Add((AstScope)astStmtBlock);
    //    }
    //}
}