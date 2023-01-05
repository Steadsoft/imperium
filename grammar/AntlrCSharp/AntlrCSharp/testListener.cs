using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
    public class TestListener : PostBaseListener
    {
        public override void EnterIf_stmt([NotNull] PostParser.If_stmtContext context)
        {
            base.EnterIf_stmt(context);
        }

        public override void EnterDeclare_stmt([NotNull] PostParser.Declare_stmtContext context)
        {
            base.EnterDeclare_stmt(context);
        }
        public override void EnterProcedure_stmt([NotNull] PostParser.Procedure_stmtContext context)
        {
            Console.WriteLine(context.GetType().Name);
            base.EnterProcedure_stmt(context);
        }

        public override void EnterBasic_reference([NotNull] PostParser.Basic_referenceContext context)
        {
            base.EnterBasic_reference(context);
        }

        public override void EnterPreprocessor_stmt([NotNull] PostParser.Preprocessor_stmtContext context)
        {
            base.EnterPreprocessor_stmt(context);
        }
    }
}
