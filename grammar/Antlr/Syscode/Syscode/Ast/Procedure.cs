using Antlr4.Runtime;

namespace Syscode
{
    public class Procedure : AstNode, IStatements
    {
        public string Spelling;
        public List<string> Parameters = new List<string>();
        private List<AstNode> statements;

        public Procedure(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }

        public override string ToString()
        {
            return Spelling;
        }
    }
}