using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using static ImperiumParser;
using static AntlrCSharp.AstSupport;
using System.Data;
using System.Net.WebSockets;

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

            var tmp = VisitChildren(context);
            
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
            if (Has(context.passiveStmt, out var block))
            {
                var ast_stmt_block_node = new AstStmtBlock(context.passiveStmt());


                foreach (DeclareStmtContext dcl_ctxt in context.passiveStmt().Select(s => s.declareStmt()).Where(s => s != null))
                {
                    var ast_declaration_node = new AstDeclaration(dcl_ctxt);

                    ast_stmt_block_node.AddStatement(ast_declaration_node);

                    dcl_ctxt.Node = ast_declaration_node;

                    VisitDeclareStmt(dcl_ctxt);
                }

                foreach (DefineStmtContext def_ctxt in context.passiveStmt().Select(s => s.defineStmt()).Where(s => s != null))
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

        protected override AstNode AggregateResult(AstNode aggregate, AstNode nextResult)
        {
            if (aggregate == null)
            {
                var results = new List<AstNode>();
                results.Add(nextResult);

            }
        }
        public override AstNode VisitDeclareStmt([NotNull] DeclareStmtContext context)
        {

            var dcl = context.Node as AstDeclaration;

            if (dcl == null)
                return null;

            if (context.declarationBody()?.typeInfo()?.dimensionSuffix() != null)
            {
                ;
            }

            var attributes = context.declarationBody()?.typeInfo()?.attributes();

            if (exists(attributes))
            {
                if (Has(attributes.dataAttribute, out var dataAttribute))
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

                    if (dataAttribute.numericScale() != null)
                    {
                        if (Has(dataAttribute.numericScale().FIXED))
                            dcl.FIXED++; 

                        if (Has(dataAttribute.numericScale().FLOAT))
                            dcl.FLOAT++;
                    }

                    if (dataAttribute.precision() != null)
                    {
                        var numdig = dataAttribute.precision().numberOfDigits();

                        if (numdig.identifier() != null)
                        {
                            var id = numdig.identifier().GetText();
                        }
                        else
                        {
                            if (numdig.INTEGER() != null)
                            {
                                dcl.numberOfDigits = Convert.ToInt32(numdig.INTEGER().GetText());
                            }
                        }

                        if (dataAttribute.precision().scale_factor != null)
                        {
                            var scale = dataAttribute.precision().scale_factor();

                            if (scale?.identifier() != null)
                            {
                                var id = scale.identifier().GetText();
                            }
                            else
                            {
                                if (scale?.INTEGER() != null)
                                {
                                    dcl.scaleFactor = Convert.ToInt32(scale.INTEGER().GetText());
                                }
                            }
                        }
                    }

                    if (Has(dataAttribute.INTRINSIC))
                        dcl.INTRINSIC++; ;

                    if (Has(dataAttribute.OFFSET))
                        dcl.OFFSET++; ;

                    if (Has(dataAttribute.POINTER))
                        dcl.POINTER++; ;

                    if (Has(dataAttribute.VARYING))
                        dcl.VARYING++; ;

                    if (Has(dataAttribute.STRING))
                    {
                        dcl.STRING++; ;

                        dcl.StringLength = new AstDeclaration.MaxStringLength();

                        if (dataAttribute.maxStringLength()?.identifier() != null)
                        {
                            dcl.StringLength.Identifier = dataAttribute.maxStringLength().identifier().GetText();    
                        }

                        if (dataAttribute?.maxStringLength()?.INTEGER() != null)
                        {
                            dcl.StringLength.INTEGER = Convert.ToInt32(dataAttribute.maxStringLength().INTEGER().GetText());
                        }

                        if (dataAttribute?.maxStringLength()?.TIMES() != null)
                        {
                            dcl.StringLength.Asterisk = true;
                        }
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