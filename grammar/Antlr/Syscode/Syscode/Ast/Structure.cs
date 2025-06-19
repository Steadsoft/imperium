using Antlr4.Runtime;

namespace Syscode
{
    public class Structure : StructureMember
    {
        //public string Spelling;
        public List<BoundsPair> Bounds = new();
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