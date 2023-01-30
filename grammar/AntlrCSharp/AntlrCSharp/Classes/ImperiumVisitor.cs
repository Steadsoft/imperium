using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static ImperiumParser;

namespace AntlrCSharp
{
    public class ImperiumVisitor : ImperiumBaseVisitor<object>
    {
        public ImperiumVisitor() : base()
        {
            ;
        }

        public override object VisitDeclare_stmt([NotNull] Declare_stmtContext context)
        {
            return base.VisitDeclare_stmt(context);
        }

        public override object VisitDeclaration_body([NotNull] Declaration_bodyContext context)
        {
            string spelling = string.Empty;

            if (context.identifier() is Identifier_Context)
            {
                spelling = (context.identifier() as Identifier_Context)?.IDENTIFIER()?.ToString();
            }
            else
            if (context.identifier() is Keyword_Context)
                {
                var xx = (context.identifier() as Keyword_Context);
                var zz = xx.keyword()?.children[0].ToString();
                Console.WriteLine($"I: Line {context.Start.Line.ToString().PadRight(3)} - Declaration of '{zz}' - A language keyword has been used as an identifier.");
                }



            var dims = context.type_info()?.dimension_suffix()?.bound_pair_commalist();

            if (dims != null)
            {
                int dim = 1;

                foreach (var bp in dims.bound_pair())
                {
                    ValidateBound_pair(bp, spelling, context.Start.Line, dim);
                    dim++;
                }
            }

            return base.VisitDeclaration_body(context);
        }

        public override object VisitBound_pair([NotNull] Bound_pairContext context)
        {
            //ValidateBound_pair(context);

            return base.VisitBound_pair(context);
        }

        private void ValidateBound_pair([NotNull] Bound_pairContext context, string Name, int Line, int Dim)
        {
            Int32 UpBound;
            Int32 LoBound;

            var upper = context.upper_bound()?.expression() as Expr_Primitive_Context;
            var lower = context.lower_bound()?.expression() as Expr_Primitive_Context;

            if (Int32.TryParse(upper?.primitive_expression()?.numeric_literal()?.decimal_literal()?.DECIMAL_PATTERN()?.ToString(), out UpBound))
                if (Int32.TryParse(lower?.primitive_expression()?.numeric_literal()?.decimal_literal()?.DECIMAL_PATTERN()?.ToString(), out LoBound))
                {
                    if (LoBound >= UpBound)
                        Console.WriteLine($"E: Line {Line.ToString().PadRight(3)} - Declaration of array '{Name}' - The lower bound ({LoBound}) must be less than the upper bound ({UpBound}) in dimension {Dim}.");
                }
        }
    }

}
