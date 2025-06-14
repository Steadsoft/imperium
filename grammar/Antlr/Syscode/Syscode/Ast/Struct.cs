using Antlr4.Runtime;
using System.Text;

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
            return Spelling;
        }

        public string IRType
        {
            get
            {
                StringBuilder sb = new StringBuilder();

                foreach (var member in Members.OrderBy(m => m.Ordinal))
                {
                    switch (member)
                    {
                        case StructField f:
                            {
                                sb.Append($"{f.IRType}, ");
                                break;
                            }
                        case Struct s:
                            {
                                sb.Append($"%{s.Spelling}, ");
                                break;
                            }
                        default:
                            throw new NotImplementedException();
                    }
                }
                return $"{{ {sb.ToString().TrimEnd(' ',',')} }}";
            }

        }

    }
}