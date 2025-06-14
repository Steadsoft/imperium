using static SyscodeParser;
using static Syscode.LexerHelper.TokenText;

namespace Syscode
{
    public class Field : StructureMember
    {

        public string TypeName;
        public int Length;
        public Field(StructFieldContext context) : base(context)
        {
            Spelling = context.Name.GetText();
            var type = context.Type.GetText();

            if (type.Contains(LexerHelper.TokenText.LP))
            {
                int lp = type.IndexOf(LexerHelper.TokenText.LP);
                int rp = type.IndexOf(RP);
                TypeName = type.Substring(0, lp);
                Length = Convert.ToInt32(type.Substring(lp + 1, rp - (lp + 1)));
            }
            else
            {
                if (type.StartsWith(INT))
                {
                    TypeName = INT;
                    Length = Convert.ToInt32(type.Substring(3));
                }
                if (type.StartsWith(STR))
                {
                    TypeName = STR;
                    Length = Convert.ToInt32(type.Substring(6));
                }
            }
        }

        public override string ToString()
        {
            return $"{nameof(Field)}: {Spelling}";
        }
    }
}