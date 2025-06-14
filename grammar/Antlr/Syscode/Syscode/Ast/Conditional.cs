using Antlr4.Runtime;

namespace Syscode
{
    public class Conditional : AstNode
    {
        public AstNode Expr;
        public AstNode ThenStatements;
        public AstNode ElseStatement;

        public Conditional(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }
    }
}