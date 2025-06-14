using Antlr4.Runtime;

namespace Syscode
{
    public class Structure : StructureMember
    {
        //public string Spelling;
        public List<int> Bounds = new List<int>();
        public List<StructureMember> Members = new List<StructureMember>();
        public Structure(ParserRuleContext context) : base(context)
        {
        }

        public override string ToString()
        {
            return $"{nameof(Structure)}: {Spelling}";
        }

    }
}