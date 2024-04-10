// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImperiumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImperiumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(ImperiumParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUses(ImperiumParser.UsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(ImperiumParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#scopeStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeStart(ImperiumParser.ScopeStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#scopeEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeEnd(ImperiumParser.ScopeEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#assemblerToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerToken(ImperiumParser.AssemblerTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#traits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraits(ImperiumParser.TraitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#traitsStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitsStart(ImperiumParser.TraitsStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#traitsEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitsEnd(ImperiumParser.TraitsEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declarationTraits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationTraits(ImperiumParser.DeclarationTraitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declarationTrait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationTrait(ImperiumParser.DeclarationTraitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureTraits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureTraits(ImperiumParser.ProcedureTraitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureTraitsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureTraitsList(ImperiumParser.ProcedureTraitsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureTrait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureTrait(ImperiumParser.ProcedureTraitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureRule(ImperiumParser.ProcedureRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(ImperiumParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#asmBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmBlock(ImperiumParser.AsmBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#asmOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmOptions(ImperiumParser.AsmOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#functionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRule(ImperiumParser.FunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStmt(ImperiumParser.ProcedureStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#functionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStmt(ImperiumParser.FunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#targetSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetSpec(ImperiumParser.TargetSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAttributes(ImperiumParser.ProcedureAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#functionAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAttributes(ImperiumParser.FunctionAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedureEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureEnd(ImperiumParser.ProcedureEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#functionEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionEnd(ImperiumParser.FunctionEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#returnsDescriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsDescriptor(ImperiumParser.ReturnsDescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(ImperiumParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#labelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStmt(ImperiumParser.LabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ImperiumParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Definiion}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniion(ImperiumParser.DefiniionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Procedure}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(ImperiumParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ImperiumParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ImperiumParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#assemblerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerStmt(ImperiumParser.AssemblerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#assemblerInlineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerInlineComment(ImperiumParser.AssemblerInlineCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#activeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActiveStmt(ImperiumParser.ActiveStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#nullStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullStmt(ImperiumParser.NullStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(ImperiumParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicRef(ImperiumParser.BasicRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PtrRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrRef(ImperiumParser.PtrRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ImperiumParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#argumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsList(ImperiumParser.ArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#basicReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicReference(ImperiumParser.BasicReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structureQualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureQualification(ImperiumParser.StructureQualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structureQualificationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureQualificationList(ImperiumParser.StructureQualificationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(ImperiumParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#subscriptCommalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptCommalist(ImperiumParser.SubscriptCommalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ImperiumParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression(ImperiumParser.PrimitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#prefixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(ImperiumParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#bitAdjustOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAdjustOperator(ImperiumParser.BitAdjustOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#additionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOperator(ImperiumParser.AdditionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#multiplyOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOperator(ImperiumParser.MultiplyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#boolAndOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAndOperator(ImperiumParser.BoolAndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#boolXorOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolXorOperator(ImperiumParser.BoolXorOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#boolOrOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOrOperator(ImperiumParser.BoolOrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpression(ImperiumParser.MapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolAnd(ImperiumParser.ExprBoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcat(ImperiumParser.ExprConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRaise}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRaise(ImperiumParser.ExprRaiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolXor}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolXor(ImperiumParser.ExprBoolXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapArguments}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapArguments(ImperiumParser.MapArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogAnd(ImperiumParser.ExprLogAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBitAdjust}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBitAdjust(ImperiumParser.ExprBitAdjustContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(ImperiumParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesized}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesized(ImperiumParser.ExprParenthesizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(ImperiumParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogOr(ImperiumParser.ExprLogOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(ImperiumParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrefixed}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrefixed(ImperiumParser.ExprPrefixedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolOr(ImperiumParser.ExprBoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrimitive}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimitive(ImperiumParser.ExprPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#map_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_set(ImperiumParser.Map_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#bool_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_set(ImperiumParser.Bool_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(ImperiumParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(ImperiumParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(ImperiumParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(ImperiumParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(ImperiumParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#endloopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndloopStmt(ImperiumParser.EndloopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#reloopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloopStmt(ImperiumParser.ReloopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(ImperiumParser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declareAsBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAsBody(ImperiumParser.DeclareAsBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declarationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBody(ImperiumParser.DeclarationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#typeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInfo(ImperiumParser.TypeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#dimensionSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionSuffix(ImperiumParser.DimensionSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#boundPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundPair(ImperiumParser.BoundPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#boundPairCommalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundPairCommalist(ImperiumParser.BoundPairCommalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#lowerBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerBound(ImperiumParser.LowerBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#upperBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperBound(ImperiumParser.UpperBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ImperiumParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#memoryAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAttribute(ImperiumParser.MemoryAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#dataAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAttribute(ImperiumParser.DataAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#numericScale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScale(ImperiumParser.NumericScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#linkageOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageOption(ImperiumParser.LinkageOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#linkageSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSection(ImperiumParser.LinkageSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(ImperiumParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#numberOfDigits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOfDigits(ImperiumParser.NumberOfDigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#scale_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_factor(ImperiumParser.Scale_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#maxStringLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxStringLength(ImperiumParser.MaxStringLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#maxLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxLength(ImperiumParser.MaxLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#based}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBased(ImperiumParser.BasedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#defined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefined(ImperiumParser.DefinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#coprocedureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoprocedureSpecifier(ImperiumParser.CoprocedureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#handlerSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSpecifier(ImperiumParser.HandlerSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#parameterNameCommalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterNameCommalist(ImperiumParser.ParameterNameCommalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(ImperiumParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ImperiumParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#ifEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfEnd(ImperiumParser.IfEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#thenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenClause(ImperiumParser.ThenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(ImperiumParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#elifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifClause(ImperiumParser.ElifClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(ImperiumParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ImperiumParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#untilLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilLoop(ImperiumParser.UntilLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#loopEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopEnd(ImperiumParser.LoopEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#whileOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileOption(ImperiumParser.WhileOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilOption(ImperiumParser.UntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(ImperiumParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#selectEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectEnd(ImperiumParser.SelectEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(ImperiumParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(ImperiumParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#otherwiseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherwiseClause(ImperiumParser.OtherwiseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#defineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(ImperiumParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(ImperiumParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#aliasType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasType(ImperiumParser.AliasTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#binaryEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryEnum(ImperiumParser.BinaryEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#decimalEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalEnum(ImperiumParser.DecimalEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#stringEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEnum(ImperiumParser.StringEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#bitEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitEnum(ImperiumParser.BitEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(ImperiumParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#enumLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumLiteral(ImperiumParser.EnumLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(ImperiumParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(ImperiumParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMemberList(ImperiumParser.StructMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structSubstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSubstruct(ImperiumParser.StructSubstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMember(ImperiumParser.StructMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ImperiumParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ImperiumParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#hexLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexLiteral(ImperiumParser.HexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#octalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalLiteral(ImperiumParser.OctalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(ImperiumParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#binaryLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(ImperiumParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ImperiumParser.IdentifierContext ctx);
}