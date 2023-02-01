using Antlr4.Runtime;
using AntlrCSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


    public class VisitorContext : ParserRuleContext
    {
        public AstNode Node { get; set; }
        public VisitorContext(ParserRuleContext P, int S) :base(P,S)
        {

        }

        public VisitorContext():base()
        {

        }
    }

