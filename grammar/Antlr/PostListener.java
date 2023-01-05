// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostParser}.
 */
public interface PostListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(PostParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(PostParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_stmt(PostParser.Procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_stmt(PostParser.Procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(PostParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(PostParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(PostParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(PostParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stmt(PostParser.Label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stmt(PostParser.Label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPRE(PostParser.PREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPRE(PostParser.PREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDCL(PostParser.DCLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDCL(PostParser.DCLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDEF(PostParser.DEFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDEF(PostParser.DEFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN(PostParser.ASSIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN(PostParser.ASSIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCALL(PostParser.CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCALL(PostParser.CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGOTO(PostParser.GOTOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGOTO(PostParser.GOTOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPROC(PostParser.PROCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPROC(PostParser.PROCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RET}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRET(PostParser.RETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RET}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRET(PostParser.RETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIF(PostParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIF(PostParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLOOP(PostParser.LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLOOP(PostParser.LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLEAVE(PostParser.LEAVEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLEAVE(PostParser.LEAVEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAGAIN(PostParser.AGAINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAGAIN(PostParser.AGAINContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_stmt(PostParser.Preprocessor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_stmt(PostParser.Preprocessor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PostParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PostParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterBASIC_REF(PostParser.BASIC_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitBASIC_REF(PostParser.BASIC_REFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterPTR_REF(PostParser.PTR_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitPTR_REF(PostParser.PTR_REFContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PostParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PostParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(PostParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(PostParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#basic_reference}.
	 * @param ctx the parse tree
	 */
	void enterBasic_reference(PostParser.Basic_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#basic_reference}.
	 * @param ctx the parse tree
	 */
	void exitBasic_reference(PostParser.Basic_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#structure_qualification}.
	 * @param ctx the parse tree
	 */
	void enterStructure_qualification(PostParser.Structure_qualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#structure_qualification}.
	 * @param ctx the parse tree
	 */
	void exitStructure_qualification(PostParser.Structure_qualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 */
	void enterStructure_qualification_list(PostParser.Structure_qualification_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 */
	void exitStructure_qualification_list(PostParser.Structure_qualification_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PostParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PostParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#subscript_commalist}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_commalist(PostParser.Subscript_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#subscript_commalist}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_commalist(PostParser.Subscript_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PostParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PostParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_9}.
	 * @param ctx the parse tree
	 */
	void enterExpression_9(PostParser.Expression_9Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_9}.
	 * @param ctx the parse tree
	 */
	void exitExpression_9(PostParser.Expression_9Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_8}.
	 * @param ctx the parse tree
	 */
	void enterExpression_8(PostParser.Expression_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_8}.
	 * @param ctx the parse tree
	 */
	void exitExpression_8(PostParser.Expression_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_7}.
	 * @param ctx the parse tree
	 */
	void enterExpression_7(PostParser.Expression_7Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_7}.
	 * @param ctx the parse tree
	 */
	void exitExpression_7(PostParser.Expression_7Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_6}.
	 * @param ctx the parse tree
	 */
	void enterExpression_6(PostParser.Expression_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_6}.
	 * @param ctx the parse tree
	 */
	void exitExpression_6(PostParser.Expression_6Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_5}.
	 * @param ctx the parse tree
	 */
	void enterExpression_5(PostParser.Expression_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_5}.
	 * @param ctx the parse tree
	 */
	void exitExpression_5(PostParser.Expression_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_4}.
	 * @param ctx the parse tree
	 */
	void enterExpression_4(PostParser.Expression_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_4}.
	 * @param ctx the parse tree
	 */
	void exitExpression_4(PostParser.Expression_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_3}.
	 * @param ctx the parse tree
	 */
	void enterExpression_3(PostParser.Expression_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_3}.
	 * @param ctx the parse tree
	 */
	void exitExpression_3(PostParser.Expression_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_2}.
	 * @param ctx the parse tree
	 */
	void enterExpression_2(PostParser.Expression_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_2}.
	 * @param ctx the parse tree
	 */
	void exitExpression_2(PostParser.Expression_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#expression_1}.
	 * @param ctx the parse tree
	 */
	void enterExpression_1(PostParser.Expression_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#expression_1}.
	 * @param ctx the parse tree
	 */
	void exitExpression_1(PostParser.Expression_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(PostParser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(PostParser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(PostParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(PostParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(PostParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(PostParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(PostParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(PostParser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(PostParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(PostParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(PostParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(PostParser.Shift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterKEYWD(PostParser.KEYWDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitKEYWD(PostParser.KEYWDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_IDENTIFIER(PostParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_IDENTIFIER(PostParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(PostParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(PostParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(PostParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(PostParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGoto_stmt(PostParser.Goto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#goto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGoto_stmt(PostParser.Goto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#end_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_stmt(PostParser.End_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#end_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_stmt(PostParser.End_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#endloop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEndloop_stmt(PostParser.Endloop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#endloop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEndloop_stmt(PostParser.Endloop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#reloop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReloop_stmt(PostParser.Reloop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#reloop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReloop_stmt(PostParser.Reloop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(PostParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(PostParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#type_info}.
	 * @param ctx the parse tree
	 */
	void enterType_info(PostParser.Type_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#type_info}.
	 * @param ctx the parse tree
	 */
	void exitType_info(PostParser.Type_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#dimension_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDimension_suffix(PostParser.Dimension_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#dimension_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDimension_suffix(PostParser.Dimension_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#bound_pair}.
	 * @param ctx the parse tree
	 */
	void enterBound_pair(PostParser.Bound_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#bound_pair}.
	 * @param ctx the parse tree
	 */
	void exitBound_pair(PostParser.Bound_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 */
	void enterBound_pair_commalist(PostParser.Bound_pair_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 */
	void exitBound_pair_commalist(PostParser.Bound_pair_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PostParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PostParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PostParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PostParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PostParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PostParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBIN(PostParser.BINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBIN(PostParser.BINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDEC(PostParser.DECContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDEC(PostParser.DECContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPTR(PostParser.PTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPTR(PostParser.PTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBIT(PostParser.BITContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBIT(PostParser.BITContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCHAR(PostParser.CHARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCHAR(PostParser.CHARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterSTR(PostParser.STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitSTR(PostParser.STRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterENT(PostParser.ENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitENT(PostParser.ENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFIX(PostParser.FIXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFIX(PostParser.FIXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFLT(PostParser.FLTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFLT(PostParser.FLTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOFF(PostParser.OFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOFF(PostParser.OFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterVNG(PostParser.VNGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitVNG(PostParser.VNGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCOR(PostParser.CORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCOR(PostParser.CORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCOF(PostParser.COFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCOF(PostParser.COFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBLTN(PostParser.BLTNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBLTN(PostParser.BLTNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterINTR(PostParser.INTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitINTR(PostParser.INTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void enterIDENT(PostParser.IDENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 */
	void exitIDENT(PostParser.IDENTContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(PostParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(PostParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#number_of_digits}.
	 * @param ctx the parse tree
	 */
	void enterNumber_of_digits(PostParser.Number_of_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#number_of_digits}.
	 * @param ctx the parse tree
	 */
	void exitNumber_of_digits(PostParser.Number_of_digitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void enterScale_factor(PostParser.Scale_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#scale_factor}.
	 * @param ctx the parse tree
	 */
	void exitScale_factor(PostParser.Scale_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#max_length}.
	 * @param ctx the parse tree
	 */
	void enterMax_length(PostParser.Max_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#max_length}.
	 * @param ctx the parse tree
	 */
	void exitMax_length(PostParser.Max_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#based}.
	 * @param ctx the parse tree
	 */
	void enterBased(PostParser.BasedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#based}.
	 * @param ctx the parse tree
	 */
	void exitBased(PostParser.BasedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#defined}.
	 * @param ctx the parse tree
	 */
	void enterDefined(PostParser.DefinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#defined}.
	 * @param ctx the parse tree
	 */
	void exitDefined(PostParser.DefinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#entry_information}.
	 * @param ctx the parse tree
	 */
	void enterEntry_information(PostParser.Entry_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#entry_information}.
	 * @param ctx the parse tree
	 */
	void exitEntry_information(PostParser.Entry_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCoprocedure_specifier(PostParser.Coprocedure_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCoprocedure_specifier(PostParser.Coprocedure_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name_commalist(PostParser.Parameter_name_commalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name_commalist(PostParser.Parameter_name_commalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#returns_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterReturns_descriptor(PostParser.Returns_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#returns_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitReturns_descriptor(PostParser.Returns_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PostParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PostParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PostParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PostParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#then_clause}.
	 * @param ctx the parse tree
	 */
	void enterThen_clause(PostParser.Then_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#then_clause}.
	 * @param ctx the parse tree
	 */
	void exitThen_clause(PostParser.Then_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(PostParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(PostParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(PostParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(PostParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBASIC_LOOP(PostParser.BASIC_LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBASIC_LOOP(PostParser.BASIC_LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWHILE_UNTIL(PostParser.WHILE_UNTILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWHILE_UNTIL(PostParser.WHILE_UNTILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUNTIL_WHILE(PostParser.UNTIL_WHILEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUNTIL_WHILE(PostParser.UNTIL_WHILEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#while_option}.
	 * @param ctx the parse tree
	 */
	void enterWhile_option(PostParser.While_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#while_option}.
	 * @param ctx the parse tree
	 */
	void exitWhile_option(PostParser.While_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#until_option}.
	 * @param ctx the parse tree
	 */
	void enterUntil_option(PostParser.Until_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#until_option}.
	 * @param ctx the parse tree
	 */
	void exitUntil_option(PostParser.Until_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefine_stmt(PostParser.Define_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#define_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefine_stmt(PostParser.Define_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(PostParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(PostParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_literal(PostParser.Hexadecimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_literal(PostParser.Hexadecimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#octal_literal}.
	 * @param ctx the parse tree
	 */
	void enterOctal_literal(PostParser.Octal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#octal_literal}.
	 * @param ctx the parse tree
	 */
	void exitOctal_literal(PostParser.Octal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(PostParser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(PostParser.Decimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostParser#binary_literal}.
	 * @param ctx the parse tree
	 */
	void enterBinary_literal(PostParser.Binary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostParser#binary_literal}.
	 * @param ctx the parse tree
	 */
	void exitBinary_literal(PostParser.Binary_literalContext ctx);
}