using Antlr4.Runtime;

namespace Syscode
{
    public class AstNode
    {
        public readonly int StartLine;
        public readonly int StartColumn;
        public readonly int StopLine;
        public readonly int StopColumn;

        public AstNode(ParserRuleContext context)
        {
            StartLine = context.Start.Line;
            StartColumn = context.Start.Column;
            StopLine = context.Stop.Line;
            StopColumn = context.Stop.Column;
        }
    }
}