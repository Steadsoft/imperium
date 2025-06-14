using Antlr4.Runtime;

namespace Syscode
{
    public class If : AstNode
    {
        public AstNode Expr;
        public AstNode ThenStatements;
        public AstNode ElseStatement;

        public If(ParserRuleContext context) : base(context)
        {
            var children = SyscodeCompiler.GetChildren(context); ;
        }

        public override string ToString()
        {
            return $"{nameof(If)}: ";
        }
    }
}