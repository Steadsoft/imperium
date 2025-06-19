using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Syscode.Ast
{
    public class Reference : AstNode
    {
        public string Identifer;
        public List<BoundsPair> Bound = new();
        public Reference Ptr;
        public Reference Dot;

        public Reference(SyscodeParser.ReferenceContext context) : base(context)
        {
        }
    }
}