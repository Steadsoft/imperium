using Antlr4.Runtime;

namespace Syscode
{
    public class Program : AstNode , IStatementContainer
    {
        private List<AstNode> statements = new();
        public Program(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }
    }
}