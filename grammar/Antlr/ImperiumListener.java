// Generated from Imperium.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperiumParser}.
 */
public interface ImperiumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(ImperiumParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(ImperiumParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#uses}.
	 * @param ctx the parse tree
	 */
	void enterUses(ImperiumParser.UsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#uses}.
	 * @param ctx the parse tree
	 */
	void exitUses(ImperiumParser.UsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(ImperiumParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(ImperiumParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#scopeStart}.
	 * @param ctx the parse tree
	 */
	void enterScopeStart(ImperiumParser.ScopeStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#scopeStart}.
	 * @param ctx the parse tree
	 */
	void exitScopeStart(ImperiumParser.ScopeStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#scopeEnd}.
	 * @param ctx the parse tree
	 */
	void enterScopeEnd(ImperiumParser.ScopeEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#scopeEnd}.
	 * @param ctx the parse tree
	 */
	void exitScopeEnd(ImperiumParser.ScopeEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#assemblerToken}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerToken(ImperiumParser.AssemblerTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#assemblerToken}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerToken(ImperiumParser.AssemblerTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#traits}.
	 * @param ctx the parse tree
	 */
	void enterTraits(ImperiumParser.TraitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#traits}.
	 * @param ctx the parse tree
	 */
	void exitTraits(ImperiumParser.TraitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#traitsStart}.
	 * @param ctx the parse tree
	 */
	void enterTraitsStart(ImperiumParser.TraitsStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#traitsStart}.
	 * @param ctx the parse tree
	 */
	void exitTraitsStart(ImperiumParser.TraitsStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#traitsEnd}.
	 * @param ctx the parse tree
	 */
	void enterTraitsEnd(ImperiumParser.TraitsEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#traitsEnd}.
	 * @param ctx the parse tree
	 */
	void exitTraitsEnd(ImperiumParser.TraitsEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#declarationTraits}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationTraits(ImperiumParser.DeclarationTraitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#declarationTraits}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationTraits(ImperiumParser.DeclarationTraitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#declarationTrait}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationTrait(ImperiumParser.DeclarationTraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#declarationTrait}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationTrait(ImperiumParser.DeclarationTraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureTraits}.
	 * @param ctx the parse tree
	 */
	void enterProcedureTraits(ImperiumParser.ProcedureTraitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureTraits}.
	 * @param ctx the parse tree
	 */
	void exitProcedureTraits(ImperiumParser.ProcedureTraitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureTraitsList}.
	 * @param ctx the parse tree
	 */
	void enterProcedureTraitsList(ImperiumParser.ProcedureTraitsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureTraitsList}.
	 * @param ctx the parse tree
	 */
	void exitProcedureTraitsList(ImperiumParser.ProcedureTraitsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureTrait}.
	 * @param ctx the parse tree
	 */
	void enterProcedureTrait(ImperiumParser.ProcedureTraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureTrait}.
	 * @param ctx the parse tree
	 */
	void exitProcedureTrait(ImperiumParser.ProcedureTraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureRule}.
	 * @param ctx the parse tree
	 */
	void enterProcedureRule(ImperiumParser.ProcedureRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureRule}.
	 * @param ctx the parse tree
	 */
	void exitProcedureRule(ImperiumParser.ProcedureRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(ImperiumParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(ImperiumParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#asmBlock}.
	 * @param ctx the parse tree
	 */
	void enterAsmBlock(ImperiumParser.AsmBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#asmBlock}.
	 * @param ctx the parse tree
	 */
	void exitAsmBlock(ImperiumParser.AsmBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#asmOptions}.
	 * @param ctx the parse tree
	 */
	void enterAsmOptions(ImperiumParser.AsmOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#asmOptions}.
	 * @param ctx the parse tree
	 */
	void exitAsmOptions(ImperiumParser.AsmOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#functionRule}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRule(ImperiumParser.FunctionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#functionRule}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRule(ImperiumParser.FunctionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureStmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStmt(ImperiumParser.ProcedureStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureStmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStmt(ImperiumParser.ProcedureStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(ImperiumParser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(ImperiumParser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#targetSpec}.
	 * @param ctx the parse tree
	 */
	void enterTargetSpec(ImperiumParser.TargetSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#targetSpec}.
	 * @param ctx the parse tree
	 */
	void exitTargetSpec(ImperiumParser.TargetSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureAttributes}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAttributes(ImperiumParser.ProcedureAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureAttributes}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAttributes(ImperiumParser.ProcedureAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#functionAttributes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttributes(ImperiumParser.FunctionAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#functionAttributes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttributes(ImperiumParser.FunctionAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedureEnd}.
	 * @param ctx the parse tree
	 */
	void enterProcedureEnd(ImperiumParser.ProcedureEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedureEnd}.
	 * @param ctx the parse tree
	 */
	void exitProcedureEnd(ImperiumParser.ProcedureEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#functionEnd}.
	 * @param ctx the parse tree
	 */
	void enterFunctionEnd(ImperiumParser.FunctionEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#functionEnd}.
	 * @param ctx the parse tree
	 */
	void exitFunctionEnd(ImperiumParser.FunctionEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#returnsDescriptor}.
	 * @param ctx the parse tree
	 */
	void enterReturnsDescriptor(ImperiumParser.ReturnsDescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#returnsDescriptor}.
	 * @param ctx the parse tree
	 */
	void exitReturnsDescriptor(ImperiumParser.ReturnsDescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(ImperiumParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(ImperiumParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#labelStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabelStmt(ImperiumParser.LabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#labelStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabelStmt(ImperiumParser.LabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ImperiumParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ImperiumParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Definition}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ImperiumParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Definition}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ImperiumParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Procedure}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(ImperiumParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Procedure}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(ImperiumParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ImperiumParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ImperiumParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void enterNull(ImperiumParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ImperiumParser#passiveStmt}.
	 * @param ctx the parse tree
	 */
	void exitNull(ImperiumParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#assemblerStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerStmt(ImperiumParser.AssemblerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#assemblerStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerStmt(ImperiumParser.AssemblerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#assemblerInlineComment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerInlineComment(ImperiumParser.AssemblerInlineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#assemblerInlineComment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerInlineComment(ImperiumParser.AssemblerInlineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#activeStmt}.
	 * @param ctx the parse tree
	 */
	void enterActiveStmt(ImperiumParser.ActiveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#activeStmt}.
	 * @param ctx the parse tree
	 */
	void exitActiveStmt(ImperiumParser.ActiveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#nullStmt}.
	 * @param ctx the parse tree
	 */
	void enterNullStmt(ImperiumParser.NullStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#nullStmt}.
	 * @param ctx the parse tree
	 */
	void exitNullStmt(ImperiumParser.NullStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(ImperiumParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(ImperiumParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterBasicRef(ImperiumParser.BasicRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitBasicRef(ImperiumParser.BasicRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PtrRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterPtrRef(ImperiumParser.PtrRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PtrRef}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitPtrRef(ImperiumParser.PtrRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ImperiumParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ImperiumParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(ImperiumParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(ImperiumParser.ArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#basicReference}.
	 * @param ctx the parse tree
	 */
	void enterBasicReference(ImperiumParser.BasicReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#basicReference}.
	 * @param ctx the parse tree
	 */
	void exitBasicReference(ImperiumParser.BasicReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structureQualification}.
	 * @param ctx the parse tree
	 */
	void enterStructureQualification(ImperiumParser.StructureQualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structureQualification}.
	 * @param ctx the parse tree
	 */
	void exitStructureQualification(ImperiumParser.StructureQualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structureQualificationList}.
	 * @param ctx the parse tree
	 */
	void enterStructureQualificationList(ImperiumParser.StructureQualificationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structureQualificationList}.
	 * @param ctx the parse tree
	 */
	void exitStructureQualificationList(ImperiumParser.StructureQualificationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(ImperiumParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(ImperiumParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#subscriptCommalist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptCommalist(ImperiumParser.SubscriptCommalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#subscriptCommalist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptCommalist(ImperiumParser.SubscriptCommalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ImperiumParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ImperiumParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpression(ImperiumParser.PrimitiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpression(ImperiumParser.PrimitiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(ImperiumParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(ImperiumParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#bitAdjustOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitAdjustOperator(ImperiumParser.BitAdjustOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#bitAdjustOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitAdjustOperator(ImperiumParser.BitAdjustOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#additionOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOperator(ImperiumParser.AdditionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#additionOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOperator(ImperiumParser.AdditionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#multiplyOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOperator(ImperiumParser.MultiplyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#multiplyOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOperator(ImperiumParser.MultiplyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#boolAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolAndOperator(ImperiumParser.BoolAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#boolAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolAndOperator(ImperiumParser.BoolAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#boolXorOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolXorOperator(ImperiumParser.BoolXorOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#boolXorOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolXorOperator(ImperiumParser.BoolXorOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#boolOrOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolOrOperator(ImperiumParser.BoolOrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#boolOrOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolOrOperator(ImperiumParser.BoolOrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapExpression(ImperiumParser.MapExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExpression}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapExpression(ImperiumParser.MapExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolAnd(ImperiumParser.ExprBoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolAnd(ImperiumParser.ExprBoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(ImperiumParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(ImperiumParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRaise}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRaise(ImperiumParser.ExprRaiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRaise}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRaise(ImperiumParser.ExprRaiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolXor}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolXor(ImperiumParser.ExprBoolXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolXor}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolXor(ImperiumParser.ExprBoolXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapArguments}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapArguments(ImperiumParser.MapArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapArguments}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapArguments(ImperiumParser.MapArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogAnd(ImperiumParser.ExprLogAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogAnd}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogAnd(ImperiumParser.ExprLogAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBitAdjust}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBitAdjust(ImperiumParser.ExprBitAdjustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBitAdjust}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBitAdjust(ImperiumParser.ExprBitAdjustContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(ImperiumParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(ImperiumParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesized}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesized(ImperiumParser.ExprParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesized}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesized(ImperiumParser.ExprParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(ImperiumParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(ImperiumParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogOr(ImperiumParser.ExprLogOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogOr(ImperiumParser.ExprLogOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(ImperiumParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(ImperiumParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrefixed}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPrefixed(ImperiumParser.ExprPrefixedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrefixed}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPrefixed(ImperiumParser.ExprPrefixedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolOr(ImperiumParser.ExprBoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolOr}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolOr(ImperiumParser.ExprBoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrimitive}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPrimitive(ImperiumParser.ExprPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrimitive}
	 * labeled alternative in {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPrimitive(ImperiumParser.ExprPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#map_set}.
	 * @param ctx the parse tree
	 */
	void enterMap_set(ImperiumParser.Map_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#map_set}.
	 * @param ctx the parse tree
	 */
	void exitMap_set(ImperiumParser.Map_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#bool_set}.
	 * @param ctx the parse tree
	 */
	void enterBool_set(ImperiumParser.Bool_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#bool_set}.
	 * @param ctx the parse tree
	 */
	void exitBool_set(ImperiumParser.Bool_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(ImperiumParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(ImperiumParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ImperiumParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ImperiumParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(ImperiumParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(ImperiumParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(ImperiumParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(ImperiumParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(ImperiumParser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(ImperiumParser.GotoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#endloopStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndloopStmt(ImperiumParser.EndloopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#endloopStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndloopStmt(ImperiumParser.EndloopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#reloopStmt}.
	 * @param ctx the parse tree
	 */
	void enterReloopStmt(ImperiumParser.ReloopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#reloopStmt}.
	 * @param ctx the parse tree
	 */
	void exitReloopStmt(ImperiumParser.ReloopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareAs}
	 * labeled alternative in {@link ImperiumParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAs(ImperiumParser.DeclareAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareAs}
	 * labeled alternative in {@link ImperiumParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAs(ImperiumParser.DeclareAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareName}
	 * labeled alternative in {@link ImperiumParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareName(ImperiumParser.DeclareNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareName}
	 * labeled alternative in {@link ImperiumParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareName(ImperiumParser.DeclareNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#declareAsBody}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAsBody(ImperiumParser.DeclareAsBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#declareAsBody}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAsBody(ImperiumParser.DeclareAsBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#declarationBody}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBody(ImperiumParser.DeclarationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#declarationBody}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBody(ImperiumParser.DeclarationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#typeInfo}.
	 * @param ctx the parse tree
	 */
	void enterTypeInfo(ImperiumParser.TypeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#typeInfo}.
	 * @param ctx the parse tree
	 */
	void exitTypeInfo(ImperiumParser.TypeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#dimensionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDimensionSuffix(ImperiumParser.DimensionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#dimensionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDimensionSuffix(ImperiumParser.DimensionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#boundPair}.
	 * @param ctx the parse tree
	 */
	void enterBoundPair(ImperiumParser.BoundPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#boundPair}.
	 * @param ctx the parse tree
	 */
	void exitBoundPair(ImperiumParser.BoundPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#boundPairCommalist}.
	 * @param ctx the parse tree
	 */
	void enterBoundPairCommalist(ImperiumParser.BoundPairCommalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#boundPairCommalist}.
	 * @param ctx the parse tree
	 */
	void exitBoundPairCommalist(ImperiumParser.BoundPairCommalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#lowerBound}.
	 * @param ctx the parse tree
	 */
	void enterLowerBound(ImperiumParser.LowerBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#lowerBound}.
	 * @param ctx the parse tree
	 */
	void exitLowerBound(ImperiumParser.LowerBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#upperBound}.
	 * @param ctx the parse tree
	 */
	void enterUpperBound(ImperiumParser.UpperBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#upperBound}.
	 * @param ctx the parse tree
	 */
	void exitUpperBound(ImperiumParser.UpperBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ImperiumParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ImperiumParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#memoryAttribute}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAttribute(ImperiumParser.MemoryAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#memoryAttribute}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAttribute(ImperiumParser.MemoryAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#dataAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDataAttribute(ImperiumParser.DataAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#dataAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDataAttribute(ImperiumParser.DataAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#numericScale}.
	 * @param ctx the parse tree
	 */
	void enterNumericScale(ImperiumParser.NumericScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#numericScale}.
	 * @param ctx the parse tree
	 */
	void exitNumericScale(ImperiumParser.NumericScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#linkageOption}.
	 * @param ctx the parse tree
	 */
	void enterLinkageOption(ImperiumParser.LinkageOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#linkageOption}.
	 * @param ctx the parse tree
	 */
	void exitLinkageOption(ImperiumParser.LinkageOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#linkageSection}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSection(ImperiumParser.LinkageSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#linkageSection}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSection(ImperiumParser.LinkageSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(ImperiumParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(ImperiumParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#numberOfDigits}.
	 * @param ctx the parse tree
	 */
	void enterNumberOfDigits(ImperiumParser.NumberOfDigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#numberOfDigits}.
	 * @param ctx the parse tree
	 */
	void exitNumberOfDigits(ImperiumParser.NumberOfDigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void enterScale_factor(ImperiumParser.Scale_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void exitScale_factor(ImperiumParser.Scale_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#maxStringLength}.
	 * @param ctx the parse tree
	 */
	void enterMaxStringLength(ImperiumParser.MaxStringLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#maxStringLength}.
	 * @param ctx the parse tree
	 */
	void exitMaxStringLength(ImperiumParser.MaxStringLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#maxLength}.
	 * @param ctx the parse tree
	 */
	void enterMaxLength(ImperiumParser.MaxLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#maxLength}.
	 * @param ctx the parse tree
	 */
	void exitMaxLength(ImperiumParser.MaxLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#based}.
	 * @param ctx the parse tree
	 */
	void enterBased(ImperiumParser.BasedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#based}.
	 * @param ctx the parse tree
	 */
	void exitBased(ImperiumParser.BasedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#defined}.
	 * @param ctx the parse tree
	 */
	void enterDefined(ImperiumParser.DefinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#defined}.
	 * @param ctx the parse tree
	 */
	void exitDefined(ImperiumParser.DefinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#coprocedureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterCoprocedureSpecifier(ImperiumParser.CoprocedureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#coprocedureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitCoprocedureSpecifier(ImperiumParser.CoprocedureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#handlerSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSpecifier(ImperiumParser.HandlerSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#handlerSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSpecifier(ImperiumParser.HandlerSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#parameterNameCommalist}.
	 * @param ctx the parse tree
	 */
	void enterParameterNameCommalist(ImperiumParser.ParameterNameCommalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#parameterNameCommalist}.
	 * @param ctx the parse tree
	 */
	void exitParameterNameCommalist(ImperiumParser.ParameterNameCommalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(ImperiumParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(ImperiumParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ImperiumParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ImperiumParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfEnd(ImperiumParser.IfEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfEnd(ImperiumParser.IfEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#thenClause}.
	 * @param ctx the parse tree
	 */
	void enterThenClause(ImperiumParser.ThenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#thenClause}.
	 * @param ctx the parse tree
	 */
	void exitThenClause(ImperiumParser.ThenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(ImperiumParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(ImperiumParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#elifClause}.
	 * @param ctx the parse tree
	 */
	void enterElifClause(ImperiumParser.ElifClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#elifClause}.
	 * @param ctx the parse tree
	 */
	void exitElifClause(ImperiumParser.ElifClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(ImperiumParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(ImperiumParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ImperiumParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ImperiumParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void enterUntilLoop(ImperiumParser.UntilLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void exitUntilLoop(ImperiumParser.UntilLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#loopEnd}.
	 * @param ctx the parse tree
	 */
	void enterLoopEnd(ImperiumParser.LoopEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#loopEnd}.
	 * @param ctx the parse tree
	 */
	void exitLoopEnd(ImperiumParser.LoopEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#whileOption}.
	 * @param ctx the parse tree
	 */
	void enterWhileOption(ImperiumParser.WhileOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#whileOption}.
	 * @param ctx the parse tree
	 */
	void exitWhileOption(ImperiumParser.WhileOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterUntilOption(ImperiumParser.UntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitUntilOption(ImperiumParser.UntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(ImperiumParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(ImperiumParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#selectEnd}.
	 * @param ctx the parse tree
	 */
	void enterSelectEnd(ImperiumParser.SelectEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#selectEnd}.
	 * @param ctx the parse tree
	 */
	void exitSelectEnd(ImperiumParser.SelectEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(ImperiumParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(ImperiumParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(ImperiumParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(ImperiumParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#otherwiseClause}.
	 * @param ctx the parse tree
	 */
	void enterOtherwiseClause(ImperiumParser.OtherwiseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#otherwiseClause}.
	 * @param ctx the parse tree
	 */
	void exitOtherwiseClause(ImperiumParser.OtherwiseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefineStmt(ImperiumParser.DefineStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefineStmt(ImperiumParser.DefineStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(ImperiumParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(ImperiumParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#aliasType}.
	 * @param ctx the parse tree
	 */
	void enterAliasType(ImperiumParser.AliasTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#aliasType}.
	 * @param ctx the parse tree
	 */
	void exitAliasType(ImperiumParser.AliasTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#binaryEnum}.
	 * @param ctx the parse tree
	 */
	void enterBinaryEnum(ImperiumParser.BinaryEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#binaryEnum}.
	 * @param ctx the parse tree
	 */
	void exitBinaryEnum(ImperiumParser.BinaryEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#decimalEnum}.
	 * @param ctx the parse tree
	 */
	void enterDecimalEnum(ImperiumParser.DecimalEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#decimalEnum}.
	 * @param ctx the parse tree
	 */
	void exitDecimalEnum(ImperiumParser.DecimalEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#stringEnum}.
	 * @param ctx the parse tree
	 */
	void enterStringEnum(ImperiumParser.StringEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#stringEnum}.
	 * @param ctx the parse tree
	 */
	void exitStringEnum(ImperiumParser.StringEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#bitEnum}.
	 * @param ctx the parse tree
	 */
	void enterBitEnum(ImperiumParser.BitEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#bitEnum}.
	 * @param ctx the parse tree
	 */
	void exitBitEnum(ImperiumParser.BitEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ImperiumParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ImperiumParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteral(ImperiumParser.EnumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#enumLiteral}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteral(ImperiumParser.EnumLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(ImperiumParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(ImperiumParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(ImperiumParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(ImperiumParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structMemberList}.
	 * @param ctx the parse tree
	 */
	void enterStructMemberList(ImperiumParser.StructMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structMemberList}.
	 * @param ctx the parse tree
	 */
	void exitStructMemberList(ImperiumParser.StructMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structSubstruct}.
	 * @param ctx the parse tree
	 */
	void enterStructSubstruct(ImperiumParser.StructSubstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structSubstruct}.
	 * @param ctx the parse tree
	 */
	void exitStructSubstruct(ImperiumParser.StructSubstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(ImperiumParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(ImperiumParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ImperiumParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ImperiumParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ImperiumParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ImperiumParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexLiteral(ImperiumParser.HexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexLiteral(ImperiumParser.HexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOctalLiteral(ImperiumParser.OctalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#octalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOctalLiteral(ImperiumParser.OctalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ImperiumParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ImperiumParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(ImperiumParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#binaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(ImperiumParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ImperiumParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ImperiumParser.IdentifierContext ctx);
}