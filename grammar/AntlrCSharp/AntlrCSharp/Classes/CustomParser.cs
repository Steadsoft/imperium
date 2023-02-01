using Antlr4.Runtime;

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

