using Antlr4.Runtime;

namespace Syscode
{
    public class ProgramNode : AstNode , IStatements
    {
        private List<AstNode> statements;
        public ProgramNode(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }
    }
}