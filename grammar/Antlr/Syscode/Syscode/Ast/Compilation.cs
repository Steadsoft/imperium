using Antlr4.Runtime;

namespace Syscode
{
    public class Compilation : AstNode , IStatementContainer
    {
        private List<AstNode> statements = new();
        public Compilation(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }
    }
}