// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImperiumParser}.
 */
public interface ImperiumParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(ImperiumParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(ImperiumParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_stmt(ImperiumParser.Procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_stmt(ImperiumParser.Procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(ImperiumParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(ImperiumParser.Stmt_blockContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stmt(ImperiumParser.Label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stmt(ImperiumParser.Label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPRE(ImperiumParser.PREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPRE(ImperiumParser.PREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDCL(ImperiumParser.DCLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDCL(ImperiumParser.DCLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDEF(ImperiumParser.DEFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDEF(ImperiumParser.DEFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN(ImperiumParser.ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN(ImperiumParser.ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCALL(ImperiumParser.CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCALL(ImperiumParser.CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGOTO(ImperiumParser.GOTOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGOTO(ImperiumParser.GOTOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPROC(ImperiumParser.PROCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPROC(ImperiumParser.PROCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RET}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRET(ImperiumParser.RETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RET}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRET(ImperiumParser.RETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIF(ImperiumParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIF(ImperiumParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLOOP(ImperiumParser.LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLOOP(ImperiumParser.LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLEAVE(ImperiumParser.LEAVEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLEAVE(ImperiumParser.LEAVEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAGAIN(ImperiumParser.AGAINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAGAIN(ImperiumParser.AGAINContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_stmt(ImperiumParser.Preprocessor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_stmt(ImperiumParser.Preprocessor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(ImperiumParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(ImperiumParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterBASIC_REF(ImperiumParser.BASIC_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitBASIC_REF(ImperiumParser.BASIC_REFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterPTR_REF(ImperiumParser.PTR_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitPTR_REF(ImperiumParser.PTR_REFContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(ImperiumParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(ImperiumParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#basic_reference}.
	 * @param ctx the parse tree
	 */
	void enterBasic_reference(ImperiumParser.Basic_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#basic_reference}.
	 * @param ctx the parse tree
	 */
	void exitBasic_reference(ImperiumParser.Basic_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structure_qualification}.
	 * @param ctx the parse tree
	 */
	void enterStructure_qualification(ImperiumParser.Structure_qualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structure_qualification}.
	 * @param ctx the parse tree
	 */
	void exitStructure_qualification(ImperiumParser.Structure_qualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 */
	void enterStructure_qualification_list(ImperiumParser.Structure_qualification_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 */
	void exitStructure_qualification_list(ImperiumParser.Structure_qualification_listContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#subscript_commalist}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_commalist(ImperiumParser.Subscript_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#subscript_commalist}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_commalist(ImperiumParser.Subscript_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ImperiumParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ImperiumParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_9}.
	 * @param ctx the parse tree
	 */
	void enterExpression_9(ImperiumParser.Expression_9Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_9}.
	 * @param ctx the parse tree
	 */
	void exitExpression_9(ImperiumParser.Expression_9Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_8}.
	 * @param ctx the parse tree
	 */
	void enterExpression_8(ImperiumParser.Expression_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_8}.
	 * @param ctx the parse tree
	 */
	void exitExpression_8(ImperiumParser.Expression_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_7}.
	 * @param ctx the parse tree
	 */
	void enterExpression_7(ImperiumParser.Expression_7Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_7}.
	 * @param ctx the parse tree
	 */
	void exitExpression_7(ImperiumParser.Expression_7Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_6}.
	 * @param ctx the parse tree
	 */
	void enterExpression_6(ImperiumParser.Expression_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_6}.
	 * @param ctx the parse tree
	 */
	void exitExpression_6(ImperiumParser.Expression_6Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_5}.
	 * @param ctx the parse tree
	 */
	void enterExpression_5(ImperiumParser.Expression_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_5}.
	 * @param ctx the parse tree
	 */
	void exitExpression_5(ImperiumParser.Expression_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_4}.
	 * @param ctx the parse tree
	 */
	void enterExpression_4(ImperiumParser.Expression_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_4}.
	 * @param ctx the parse tree
	 */
	void exitExpression_4(ImperiumParser.Expression_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_3}.
	 * @param ctx the parse tree
	 */
	void enterExpression_3(ImperiumParser.Expression_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_3}.
	 * @param ctx the parse tree
	 */
	void exitExpression_3(ImperiumParser.Expression_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_2}.
	 * @param ctx the parse tree
	 */
	void enterExpression_2(ImperiumParser.Expression_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_2}.
	 * @param ctx the parse tree
	 */
	void exitExpression_2(ImperiumParser.Expression_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#expression_1}.
	 * @param ctx the parse tree
	 */
	void enterExpression_1(ImperiumParser.Expression_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#expression_1}.
	 * @param ctx the parse tree
	 */
	void exitExpression_1(ImperiumParser.Expression_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(ImperiumParser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(ImperiumParser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(ImperiumParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(ImperiumParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(ImperiumParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(ImperiumParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(ImperiumParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(ImperiumParser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(ImperiumParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(ImperiumParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(ImperiumParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(ImperiumParser.Shift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterKEYWD(ImperiumParser.KEYWDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitKEYWD(ImperiumParser.KEYWDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_IDENTIFIER(ImperiumParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_IDENTIFIER(ImperiumParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ImperiumParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ImperiumParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(ImperiumParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(ImperiumParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGoto_stmt(ImperiumParser.Goto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGoto_stmt(ImperiumParser.Goto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#end_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_stmt(ImperiumParser.End_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#end_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_stmt(ImperiumParser.End_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#endloop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEndloop_stmt(ImperiumParser.Endloop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#endloop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEndloop_stmt(ImperiumParser.Endloop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#reloop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReloop_stmt(ImperiumParser.Reloop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#reloop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReloop_stmt(ImperiumParser.Reloop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(ImperiumParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(ImperiumParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#type_info}.
	 * @param ctx the parse tree
	 */
	void enterType_info(ImperiumParser.Type_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#type_info}.
	 * @param ctx the parse tree
	 */
	void exitType_info(ImperiumParser.Type_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#dimension_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDimension_suffix(ImperiumParser.Dimension_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#dimension_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDimension_suffix(ImperiumParser.Dimension_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#bound_pair}.
	 * @param ctx the parse tree
	 */
	void enterBound_pair(ImperiumParser.Bound_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#bound_pair}.
	 * @param ctx the parse tree
	 */
	void exitBound_pair(ImperiumParser.Bound_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 */
	void enterBound_pair_commalist(ImperiumParser.Bound_pair_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 */
	void exitBound_pair_commalist(ImperiumParser.Bound_pair_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(ImperiumParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(ImperiumParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(ImperiumParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(ImperiumParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ImperiumParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ImperiumParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBIN(ImperiumParser.BINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBIN(ImperiumParser.BINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDEC(ImperiumParser.DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDEC(ImperiumParser.DECContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPTR(ImperiumParser.PTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPTR(ImperiumParser.PTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBIT(ImperiumParser.BITContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBIT(ImperiumParser.BITContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCHAR(ImperiumParser.CHARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCHAR(ImperiumParser.CHARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterSTR(ImperiumParser.STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitSTR(ImperiumParser.STRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterENT(ImperiumParser.ENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitENT(ImperiumParser.ENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFIX(ImperiumParser.FIXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFIX(ImperiumParser.FIXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFLT(ImperiumParser.FLTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFLT(ImperiumParser.FLTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOFF(ImperiumParser.OFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOFF(ImperiumParser.OFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterVNG(ImperiumParser.VNGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitVNG(ImperiumParser.VNGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCOR(ImperiumParser.CORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCOR(ImperiumParser.CORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCOF(ImperiumParser.COFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCOF(ImperiumParser.COFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBLTN(ImperiumParser.BLTNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBLTN(ImperiumParser.BLTNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterINTR(ImperiumParser.INTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitINTR(ImperiumParser.INTRContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#number_of_digits}.
	 * @param ctx the parse tree
	 */
	void enterNumber_of_digits(ImperiumParser.Number_of_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#number_of_digits}.
	 * @param ctx the parse tree
	 */
	void exitNumber_of_digits(ImperiumParser.Number_of_digitsContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#max_length}.
	 * @param ctx the parse tree
	 */
	void enterMax_length(ImperiumParser.Max_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#max_length}.
	 * @param ctx the parse tree
	 */
	void exitMax_length(ImperiumParser.Max_lengthContext ctx);
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
	 * Enter a parse tree produced by {@link ImperiumParser#entry_information}.
	 * @param ctx the parse tree
	 */
	void enterEntry_information(ImperiumParser.Entry_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#entry_information}.
	 * @param ctx the parse tree
	 */
	void exitEntry_information(ImperiumParser.Entry_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCoprocedure_specifier(ImperiumParser.Coprocedure_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCoprocedure_specifier(ImperiumParser.Coprocedure_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name_commalist(ImperiumParser.Parameter_name_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name_commalist(ImperiumParser.Parameter_name_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#returns_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterReturns_descriptor(ImperiumParser.Returns_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#returns_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitReturns_descriptor(ImperiumParser.Returns_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(ImperiumParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(ImperiumParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(ImperiumParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(ImperiumParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#then_clause}.
	 * @param ctx the parse tree
	 */
	void enterThen_clause(ImperiumParser.Then_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#then_clause}.
	 * @param ctx the parse tree
	 */
	void exitThen_clause(ImperiumParser.Then_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(ImperiumParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(ImperiumParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(ImperiumParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(ImperiumParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBASIC_LOOP(ImperiumParser.BASIC_LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBASIC_LOOP(ImperiumParser.BASIC_LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWHILE_UNTIL(ImperiumParser.WHILE_UNTILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWHILE_UNTIL(ImperiumParser.WHILE_UNTILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUNTIL_WHILE(ImperiumParser.UNTIL_WHILEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUNTIL_WHILE(ImperiumParser.UNTIL_WHILEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#while_option}.
	 * @param ctx the parse tree
	 */
	void enterWhile_option(ImperiumParser.While_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#while_option}.
	 * @param ctx the parse tree
	 */
	void exitWhile_option(ImperiumParser.While_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#until_option}.
	 * @param ctx the parse tree
	 */
	void enterUntil_option(ImperiumParser.Until_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#until_option}.
	 * @param ctx the parse tree
	 */
	void exitUntil_option(ImperiumParser.Until_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefine_stmt(ImperiumParser.Define_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefine_stmt(ImperiumParser.Define_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(ImperiumParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(ImperiumParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_literal(ImperiumParser.Hexadecimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_literal(ImperiumParser.Hexadecimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#octal_literal}.
	 * @param ctx the parse tree
	 */
	void enterOctal_literal(ImperiumParser.Octal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#octal_literal}.
	 * @param ctx the parse tree
	 */
	void exitOctal_literal(ImperiumParser.Octal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(ImperiumParser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(ImperiumParser.Decimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImperiumParser#binary_literal}.
	 * @param ctx the parse tree
	 */
	void enterBinary_literal(ImperiumParser.Binary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImperiumParser#binary_literal}.
	 * @param ctx the parse tree
	 */
	void exitBinary_literal(ImperiumParser.Binary_literalContext ctx);
}