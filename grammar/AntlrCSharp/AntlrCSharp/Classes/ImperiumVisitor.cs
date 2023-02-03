using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using static ImperiumParser;
using static AntlrCSharp.AstSupport;
using System.Data;

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
            var ast_translation_unit_node = new AstTranslationUnit(context);

            foreach (ScopeContext scope in context.scope())
            {
                var astScope = AstScope.Create(scope);

                ast_translation_unit_node.AddScope(astScope);

                var blck = VisitScope(scope);

                if (blck != null)
                    astScope.AddStmtBlock(blck);

            }

            return ast_translation_unit_node;
        }

        public override AstNode VisitScope([NotNull] ScopeContext context)
        {
            if (Has(context.stmtBlock, out var block))
            {
                var ast_stmt_block_node = new AstStmtBlock(context.stmtBlock());

                foreach (DeclareStmtContext dcl_ctxt in context.stmtBlock().nonexecutableStmt().Select(s => s.declareStmt()).Where(s => s != null))
                {
                    var ast_declaration_node = new AstDeclaration(dcl_ctxt);

                    ast_stmt_block_node.AddStatement(ast_declaration_node);

                    dcl_ctxt.Node = ast_declaration_node;

                    VisitDeclareStmt(dcl_ctxt);
                }

                foreach (DefineStmtContext def_ctxt in context.stmtBlock().nonexecutableStmt().Select(s => s.defineStmt()).Where(s => s != null))
                {
                    var ast_definition_node = new AstDefinition(def_ctxt);

                    ast_stmt_block_node.AddStatement(new AstDefinition(def_ctxt));

                    def_ctxt.Node = ast_definition_node;

                    VisitDefineStmt(def_ctxt);
                }

                return ast_stmt_block_node;
            }

            return null;
        }

        public override AstNode VisitDeclareStmt([NotNull] DeclareStmtContext context)
        {

            var dcl = context.Node as AstDeclaration;

            if (dcl == null)
                return null;

            var attributes = context.declarationBody()?.typeInfo()?.attribute();

            if (exists(attributes))
            {
                foreach (var attribute in attributes)
                {
                    if (Has(attribute.dataAttribute, out var dataAttribute))
                    {
                        if (Has(dataAttribute.BINARY))
                            dcl.BINARY++;

                        if (Has(dataAttribute.BIT))
                            dcl.BIT++;

                        if (Has(dataAttribute.BUILTIN))
                            dcl.BUILTIN++;

                        if (Has(dataAttribute.CHARACTER))
                            dcl.CHARACTER++;

                        if (Has(dataAttribute.COFUNCTION))
                            dcl.COFUNCTION++;

                        if (Has(dataAttribute.COROUTINE))
                            dcl.COROUTINE++;

                        if (Has(dataAttribute.COFUNCTION))
                            dcl.COFUNCTION++;

                        if (Has(dataAttribute.DECIMAL))
                            dcl.DECIMAL++; ;

                        if (Has(dataAttribute.ENTRY))
                            dcl.ENTRY++; ;

                        if (Has(dataAttribute.FIXED))
                            dcl.FIXED++; ;

                        if (Has(dataAttribute.FLOAT))
                            dcl.FLOAT++; ;

                        if (Has(dataAttribute.INTRINSIC))
                            dcl.INTRINSIC++; ;

                        if (Has(dataAttribute.OFFSET))
                            dcl.OFFSET++; ;

                        if (Has(dataAttribute.POINTER))
                            dcl.POINTER++; ;

                        if (Has(dataAttribute.VARYING))
                            dcl.VARYING++; ;

                        if (Has(dataAttribute.STRING))
                            dcl.STRING++; ;
                    }
                }
            }

            return base.VisitDeclareStmt(context);
        }

        public override AstNode VisitPtrRef([NotNull] PtrRefContext context)
        {
            return base.VisitPtrRef(context);
        }

        public override AstNode VisitBasicReference([NotNull] BasicReferenceContext context)
        {
            return base.VisitBasicReference(context);
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