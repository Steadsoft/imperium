using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

    public  class CustomParser : ImperiumParser
    {
        public CustomParser(ITokenStream source) : base(source) 
        {
            ;
        }

    public override void ExitRule()
    {
        base.ExitRule();
    }
}

