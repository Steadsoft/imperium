using static SyscodeParser;

namespace Syscode
{
    public class Field : StructMember
    {
        //public string Spelling;
        public string TypeName;
        public int Length;
        public Field(StructFieldContext context) : base(context)
        {
            Spelling = context.Name.GetText();
            var type = context.Type.GetText();

            if (type.Contains("("))
            {
                int lp = type.IndexOf("(");
                int rp = type.IndexOf(")");
                TypeName = type.Substring(0, lp);
                Length = Convert.ToInt32(type.Substring(lp+1,rp-(lp+1)));
            }
            else
            {
                if (type.StartsWith("int"))
                {
                    TypeName = "int";
                    Length = Convert.ToInt32(type.Substring(3));
                }
                if (type.StartsWith("string"))
                {
                    TypeName = "string";
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