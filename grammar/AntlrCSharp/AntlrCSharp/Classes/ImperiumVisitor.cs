using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
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

            var ti = context.children.Where(c => c is Type_infoContext).Cast<Type_infoContext>().Single();

            foreach (var x in ti.children.Where(z => z is Dimension_suffixContext).Cast<Dimension_suffixContext>())
            {
                foreach (var bp in x.children.Where(w => w is Bound_pair_commalistContext).Cast<Bound_pair_commalistContext>())
                {
                    ;
                }
            }




            return base.VisitDeclaration_body(context);
        }

        public override object VisitBound_pair([NotNull] Bound_pairContext context)
        {
            Int32 UpBound;
            Int32 LoBound;

            var upper = context.upper_bound()?.expression() as Expr_Primitive_Context;
            var lower = context.lower_bound()?.expression() as Expr_Primitive_Context;

            if (Int32.TryParse(upper?.primitive_expression()?.numeric_literal()?.decimal_literal()?.DECIMAL_PATTERN()?.ToString(), out UpBound))
                if (Int32.TryParse(lower?.primitive_expression()?.numeric_literal()?.decimal_literal()?.DECIMAL_PATTERN()?.ToString(), out LoBound))
                {
                    if (LoBound >= UpBound)
                        Console.WriteLine($"The lower bound ({LoBound}) must be less than the upper bound ({UpBound}).");
                }




             return base.VisitBound_pair(context);
        }
    }

}
