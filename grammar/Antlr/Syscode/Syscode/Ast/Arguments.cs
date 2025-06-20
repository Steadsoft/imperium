using Antlr4.Runtime;

namespace Syscode
{
    /// <summary>
    /// Represents a paranthesized commalist of expression which might be array subscripts or func/proc arguments.
    /// </summary>
    public class Arguments : AstNode
    {
        public List<Expression> ExpressionList = new();

        public Arguments(ParserRuleContext context) : base(context)
        {
        }
    }
}