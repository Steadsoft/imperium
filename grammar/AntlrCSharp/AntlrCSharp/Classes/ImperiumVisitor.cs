using Antlr4.Runtime.Misc;
using static ImperiumParser;

namespace AntlrCSharp
{


    public class ImperiumVisitor : ImperiumBaseVisitor<AstNode>
    {
        public ImperiumVisitor() : base()
        {
            ;
        }


        public override AstNode VisitTranslationUnit([NotNull] TranslationUnitContext context)
        {
            var ast_translation_unit = new AstTranslationUnit(context);
            
            foreach (ScopeContext scope in context.scope())
            {
                var astScope = AstScope.Create(scope);

                ast_translation_unit.AddScope(astScope);

                var blck = Visit(scope);

                if (blck != null)
                    astScope.AddStmtBlock(blck);

            }

            return ast_translation_unit;
        }

        public override AstNode VisitScope([NotNull] ScopeContext context)
        {
            var block = context.stmtBlock();

            if (block == null)
                return null;

            var stmt_block = new AstStmtBlock(context.stmtBlock());

            foreach (DeclareStmtContext stc in context.stmtBlock().nonexecutableStmt().Select(s => s.declareStmt()).Where(s => s != null))
            {
                var nes = new AstDeclaration(stc);

                stmt_block.AddStatement(nes);

                Visit(stc);
            }

            foreach (DefineStmtContext stc in context.stmtBlock().nonexecutableStmt().Select(s => s.defineStmt()).Where(s => s != null))
            {
                var nes = new AstDefinition(stc);

                stmt_block.AddStatement(new AstDefinition(stc));
            }

            return stmt_block;
        }

        private void ValidateBound_pair([NotNull] BoundPairContext context, string Name, int Line, int Dim)
        {

            if (context.upperBound()?.expression() is ExprPrimitiveContext upper && context.lowerBound()?.expression() is ExprPrimitiveContext lower)
            {
                if (int.TryParse(upper?.primitiveExpression()?.numericLiteral()?.decimalLiteral()?.DECIMAL_PATTERN()?.ToString(), out int UpBound))
                    if (int.TryParse(lower?.primitiveExpression()?.numericLiteral()?.decimalLiteral()?.DECIMAL_PATTERN()?.ToString(), out int LoBound))
                    {
                        if (LoBound >= UpBound)
                            Console.WriteLine($"E: Line {Line.ToString().PadRight(3)} - Declaration of array '{Name}' - The lower bound ({LoBound}) must be less than the upper bound ({UpBound}) in dimension {Dim}.");
                    }
            }
        }
    }
}