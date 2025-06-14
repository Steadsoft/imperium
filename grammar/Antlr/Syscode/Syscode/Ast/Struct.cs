using Antlr4.Runtime;

namespace Syscode
{
    public class Struct : StructMember
    {
        //public string Spelling;
        public List<int> Bounds = new List<int>();
        public List<StructMember> Members = new List<StructMember>();
        public Struct(ParserRuleContext context) : base(context)
        {
        }

        public override string ToString()
        {
            return $"{nameof(Struct)}: {Spelling}";
        }

    }
}