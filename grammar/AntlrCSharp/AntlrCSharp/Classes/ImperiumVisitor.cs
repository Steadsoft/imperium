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

            ast_translation_unit_node.Children = tmp.Children;

            return ast_translation_unit_node;
        }
        public override AstNode VisitScope([NotNull] ScopeContext context)
        {
           var ast_stmt_block_node = new AstScope(context);

            var tmp = VisitChildren(context);

            ast_stmt_block_node.Children = tmp.Children;

            return ast_stmt_block_node;
        }

        public override AstNode VisitPassiveStmt([NotNull] PassiveStmtContext context)
        {
            var pas = VisitChildren(context);

            return pas;
        }

        public override AstNode VisitDeclareStmt([NotNull] DeclareStmtContext context)
        {

            var dcl_node = new AstDeclaration(context);

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
                        dcl_node.BINARY++;

                    if (Has(dataAttribute.BIT))
                        dcl_node.BIT++;

                    if (Has(dataAttribute.BUILTIN))
                        dcl_node.BUILTIN++;

                    if (Has(dataAttribute.CHARACTER))
                        dcl_node.CHARACTER++;

                    if (Has(dataAttribute.COFUNCTION))
                        dcl_node.COFUNCTION++;

                    if (Has(dataAttribute.COROUTINE))
                        dcl_node.COROUTINE++;

                    if (Has(dataAttribute.COFUNCTION))
                        dcl_node.COFUNCTION++;

                    if (Has(dataAttribute.DECIMAL))
                        dcl_node.DECIMAL++; ;

                    if (Has(dataAttribute.ENTRY))
                        dcl_node.ENTRY++; ;

                    if (dataAttribute.numericScale() != null)
                    {
                        if (Has(dataAttribute.numericScale().FIXED))
                            dcl_node.FIXED++; 

                        if (Has(dataAttribute.numericScale().FLOAT))
                            dcl_node.FLOAT++;
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
                                dcl_node.numberOfDigits = Convert.ToInt32(numdig.INTEGER().GetText());
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
                                    dcl_node.scaleFactor = Convert.ToInt32(scale.INTEGER().GetText());
                                }
                            }
                        }
                    }

                    if (Has(dataAttribute.INTRINSIC))
                        dcl_node.INTRINSIC++; ;

                    if (Has(dataAttribute.OFFSET))
                        dcl_node.OFFSET++; ;

                    if (Has(dataAttribute.POINTER))
                        dcl_node.POINTER++; ;

                    if (Has(dataAttribute.VARYING))
                        dcl_node.VARYING++; ;

                    if (Has(dataAttribute.STRING))
                    {
                        dcl_node.STRING++; ;

                        dcl_node.StringLength = new AstDeclaration.MaxStringLength();

                        if (dataAttribute.maxStringLength()?.identifier() != null)
                        {
                            dcl_node.StringLength.Identifier = dataAttribute.maxStringLength().identifier().GetText();    
                        }

                        if (dataAttribute?.maxStringLength()?.INTEGER() != null)
                        {
                            dcl_node.StringLength.INTEGER = Convert.ToInt32(dataAttribute.maxStringLength().INTEGER().GetText());
                        }

                        if (dataAttribute?.maxStringLength()?.TIMES() != null)
                        {
                            dcl_node.StringLength.Asterisk = true;
                        }
                    }
                }
            }

            return dcl_node;
        }
        public override AstNode VisitPtrRef([NotNull] PtrRefContext context)
        {
            return base.VisitPtrRef(context);
        }
        public override AstNode VisitBasicReference([NotNull] BasicReferenceContext context)
        {
            return base.VisitBasicReference(context);
        }

        protected override AstNode AggregateResult(AstNode aggregate, AstNode nextResult)
        {
            if (aggregate == null)
            {
                var results = new AstNode(1);
                results.Children.Add(nextResult);
                return results;
            }

            aggregate.Children.Add(nextResult);

            return aggregate;
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