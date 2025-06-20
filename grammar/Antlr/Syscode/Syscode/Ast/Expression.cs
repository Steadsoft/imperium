using Antlr4.Runtime;

namespace Syscode
{
    public class Expression : AstNode
    {
        public Literal Literal;
        public Reference Reference; 
        public Expression Left;
        public Expression Right;
        public Operator Operator;

        public Expression(ParserRuleContext context) : base(context)
        {
            Literal = null;
            Reference = null;
            Left = null;
            Right = null;
            Operator = Operator.UNDEFINED;
        }
    }
}