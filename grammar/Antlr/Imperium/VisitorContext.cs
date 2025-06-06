using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// SEE: https://stackoverflow.com/questions/29971097/how-to-create-ast-with-antlr4

public class VisitorContext : ParserRuleContext
{
    public AstNode Node { get; set; }
    public VisitorContext(ParserRuleContext P, int S) : base(P, S)
    {

    }

    public VisitorContext() : base()
    {

    }
}

public class AstNode
{
    public List<AstNode> Children { get; set; }
    public int Line { get; private set; }
    public AstNode(int Line)
    {
        this.Line = Line;
        this.Children = new List<AstNode>();
    }
}


public partial class ImperiumLexer
{
    public string getText()
    {
        return this.Text;
    }

    public void setText(string text)
    {
        Text = text;
    }
}



