// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(PostParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_stmt(PostParser.Procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(PostParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(PostParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#label_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stmt(PostParser.Label_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE(PostParser.PREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL(PostParser.DCLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link PostParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEF(PostParser.DEFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN(PostParser.ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCALL(PostParser.CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGOTO(PostParser.GOTOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROC(PostParser.PROCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RET}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRET(PostParser.RETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(PostParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP(PostParser.LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLEAVE(PostParser.LEAVEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link PostParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGAIN(PostParser.AGAINContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_stmt(PostParser.Preprocessor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PostParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASIC_REF(PostParser.BASIC_REFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link PostParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTR_REF(PostParser.PTR_REFContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PostParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(PostParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#basic_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_reference(PostParser.Basic_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#structure_qualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_qualification(PostParser.Structure_qualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_qualification_list(PostParser.Structure_qualification_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(PostParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#subscript_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_commalist(PostParser.Subscript_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PostParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_9(PostParser.Expression_9Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_8(PostParser.Expression_8Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_7(PostParser.Expression_7Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_6(PostParser.Expression_6Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_5(PostParser.Expression_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_4(PostParser.Expression_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_3(PostParser.Expression_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_2(PostParser.Expression_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#expression_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_1(PostParser.Expression_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(PostParser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(PostParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(PostParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(PostParser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(PostParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(PostParser.Shift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKEYWD(PostParser.KEYWDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link PostParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_IDENTIFIER(PostParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(PostParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(PostParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(PostParser.Goto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#end_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_stmt(PostParser.End_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#endloop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndloop_stmt(PostParser.Endloop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#reloop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloop_stmt(PostParser.Reloop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(PostParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#type_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_info(PostParser.Type_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#dimension_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension_suffix(PostParser.Dimension_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#bound_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_pair(PostParser.Bound_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_pair_commalist(PostParser.Bound_pair_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(PostParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(PostParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(PostParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBIN(PostParser.BINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEC(PostParser.DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTR(PostParser.PTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBIT(PostParser.BITContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHAR(PostParser.CHARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTR(PostParser.STRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENT(PostParser.ENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIX(PostParser.FIXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLT(PostParser.FLTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOFF(PostParser.OFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVNG(PostParser.VNGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOR(PostParser.CORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COF}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOF(PostParser.COFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBLTN(PostParser.BLTNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTR(PostParser.INTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENT}
	 * labeled alternative in {@link PostParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENT(PostParser.IDENTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(PostParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#number_of_digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_of_digits(PostParser.Number_of_digitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#scale_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_factor(PostParser.Scale_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#max_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_length(PostParser.Max_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#based}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBased(PostParser.BasedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#defined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefined(PostParser.DefinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#entry_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_information(PostParser.Entry_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoprocedure_specifier(PostParser.Coprocedure_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name_commalist(PostParser.Parameter_name_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#returns_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_descriptor(PostParser.Returns_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PostParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PostParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#then_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_clause(PostParser.Then_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(PostParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#elif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_clause(PostParser.Elif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASIC_LOOP(PostParser.BASIC_LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILE_UNTIL(PostParser.WHILE_UNTILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link PostParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNTIL_WHILE(PostParser.UNTIL_WHILEContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#while_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_option(PostParser.While_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#until_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_option(PostParser.Until_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#define_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_stmt(PostParser.Define_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(PostParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimal_literal(PostParser.Hexadecimal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#octal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_literal(PostParser.Octal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#decimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_literal(PostParser.Decimal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostParser#binary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_literal(PostParser.Binary_literalContext ctx);
}