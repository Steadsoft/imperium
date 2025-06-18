using Antlr4.Runtime;
using static SyscodeParser;

namespace Syscode
{
    public class Scope : AstNode
    {
        public string Spelling;
        public bool IsBlockScope = false;
        public Scope(ParserRuleContext context) : base(context)
        {
            if (context is BlockScopeContext)
                IsBlockScope = true;
            else
                IsBlockScope = false;
        }
    }
}