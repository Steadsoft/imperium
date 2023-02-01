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
}