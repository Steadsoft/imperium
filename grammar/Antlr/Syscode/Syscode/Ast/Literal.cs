using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Syscode
{
    public class Literal : AstNode
    {
        public string Value = String.Empty;

        public Literal(ParserRuleContext context) : base(context)
        {
        }
    }
}
