using Antlr4.Runtime;

namespace Syscode
{
    public class Program : AstNode , IStatements
    {
        private List<AstNode> statements;
        public Program(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }
    }
}