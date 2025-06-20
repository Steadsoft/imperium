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
        public Reference reference = null; // only populated if this ref is the left of ref -> ref
        public List<Arguments> ArgSet= new();
        public BasicReference basic = null;

        public Reference(SyscodeParser.ReferenceContext context) : base(context)
        {
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder();

            if (reference != null)
            {
                builder.Append(reference.ToString());
                builder.Append(" -> ");
            }

           builder.Append(basic.ToString());
           return builder.ToString();
        }
    }

    public class BasicReference : AstNode
    {
        public string Spelling;
        public List<Qualification> qualifier;
        public BasicReference(ParserRuleContext context) : base(context)
        {
            Spelling = context.GetLabelText(nameof(SyscodeParser.BasicReferenceContext.Spelling));
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder();

            foreach (var qual in qualifier)
            {
                builder.Append($"{qual.Spelling}.");
            }

            builder.Append(Spelling);

            return builder.ToString();
        }
    }

    public class Qualification : AstNode
    {
        public string Spelling;
        public List<Expression> arguments = new();
        public Qualification(ParserRuleContext context) : base(context)
        {
            Spelling = context.GetLabelText(nameof(SyscodeParser.StructureQualificationContext.Spelling));
        }
    }

    /// <summary>
    /// Represents a paranthesized commalist of expression which might be array subscripts or func/proc arguments.
    /// </summary>
    public class Arguments : AstNode
    {
        public List<Expression> ExpressionList = new();

        public Arguments(ParserRuleContext context) : base(context)
        {
        }
    }
}