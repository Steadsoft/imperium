using Antlr4.Runtime;

namespace Syscode
{
    public class Procedure : AstNode, IStatementContainer
    {
        public string Spelling;
        public List<string> Parameters = new List<string>();
        private List<AstNode> statements = new List<AstNode>();

        public Procedure(ParserRuleContext context) : base(context)
        {
        }

        public List<AstNode> Statements { get => statements; set => statements = value; }

        public override string ToString()
        {
            return $"{nameof(Procedure)}: {Spelling}";
        }
    }
}