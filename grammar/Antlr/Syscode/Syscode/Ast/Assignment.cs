using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Syscode
{
    public class Assignment : AstNode
    {
        public Assignment(ParserRuleContext context) : base(context)
        {
        }
    }
}
