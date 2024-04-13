namespace AntlrCSharp
{
    public class AstNode
    {
        public List<AstNode> Children {get;set; }
        public int Line { get; private set; }
        public AstNode(int Line)
        {
            this.Line = Line;
            this.Children = new List<AstNode>();
        }
    }
}