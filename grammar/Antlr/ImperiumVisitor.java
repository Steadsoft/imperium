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
	 * Visit a parse tree produced by {@link ImperiumParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(ImperiumParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_stmt(ImperiumParser.Procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(ImperiumParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(ImperiumParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#label_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stmt(ImperiumParser.Label_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRE}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRE(ImperiumParser.PREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DCL}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDCL(ImperiumParser.DCLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEF}
	 * labeled alternative in {@link ImperiumParser#nonexecutable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEF(ImperiumParser.DEFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN(ImperiumParser.ASSIGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCALL(ImperiumParser.CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GOTO}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGOTO(ImperiumParser.GOTOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROC}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROC(ImperiumParser.PROCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RET}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRET(ImperiumParser.RETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(ImperiumParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP(ImperiumParser.LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LEAVE}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLEAVE(ImperiumParser.LEAVEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGAIN}
	 * labeled alternative in {@link ImperiumParser#executable_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGAIN(ImperiumParser.AGAINContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#preprocessor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_stmt(ImperiumParser.Preprocessor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(ImperiumParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASIC_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASIC_REF(ImperiumParser.BASIC_REFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PTR_REF}
	 * labeled alternative in {@link ImperiumParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTR_REF(ImperiumParser.PTR_REFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ImperiumParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(ImperiumParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#basic_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_reference(ImperiumParser.Basic_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structure_qualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_qualification(ImperiumParser.Structure_qualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#structure_qualification_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_qualification_list(ImperiumParser.Structure_qualification_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(ImperiumParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#subscript_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_commalist(ImperiumParser.Subscript_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ImperiumParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_9(ImperiumParser.Expression_9Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_8(ImperiumParser.Expression_8Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_7(ImperiumParser.Expression_7Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_6(ImperiumParser.Expression_6Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_5(ImperiumParser.Expression_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_4(ImperiumParser.Expression_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_3(ImperiumParser.Expression_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_2(ImperiumParser.Expression_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#expression_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_1(ImperiumParser.Expression_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(ImperiumParser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(ImperiumParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(ImperiumParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(ImperiumParser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(ImperiumParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(ImperiumParser.Shift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KEYWD}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKEYWD(ImperiumParser.KEYWDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier_IDENTIFIER}
	 * labeled alternative in {@link ImperiumParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_IDENTIFIER(ImperiumParser.Identifier_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ImperiumParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(ImperiumParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#goto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stmt(ImperiumParser.Goto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#end_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_stmt(ImperiumParser.End_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#endloop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndloop_stmt(ImperiumParser.Endloop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#reloop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloop_stmt(ImperiumParser.Reloop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(ImperiumParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#type_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_info(ImperiumParser.Type_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#dimension_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension_suffix(ImperiumParser.Dimension_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#bound_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_pair(ImperiumParser.Bound_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#bound_pair_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_pair_commalist(ImperiumParser.Bound_pair_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(ImperiumParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(ImperiumParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ImperiumParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BIN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBIN(ImperiumParser.BINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEC(ImperiumParser.DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTR(ImperiumParser.PTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BIT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBIT(ImperiumParser.BITContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHAR(ImperiumParser.CHARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTR(ImperiumParser.STRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ENT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENT(ImperiumParser.ENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FIX}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIX(ImperiumParser.FIXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLT(ImperiumParser.FLTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OFF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOFF(ImperiumParser.OFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VNG}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVNG(ImperiumParser.VNGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOR(ImperiumParser.CORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COF}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOF(ImperiumParser.COFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BLTN}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBLTN(ImperiumParser.BLTNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTR}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTR(ImperiumParser.INTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENT}
	 * labeled alternative in {@link ImperiumParser#data_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENT(ImperiumParser.IDENTContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(ImperiumParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#number_of_digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_of_digits(ImperiumParser.Number_of_digitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#scale_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_factor(ImperiumParser.Scale_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#max_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_length(ImperiumParser.Max_lengthContext ctx);
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
	 * Visit a parse tree produced by {@link ImperiumParser#entry_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_information(ImperiumParser.Entry_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#coprocedure_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoprocedure_specifier(ImperiumParser.Coprocedure_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#parameter_name_commalist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name_commalist(ImperiumParser.Parameter_name_commalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#returns_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_descriptor(ImperiumParser.Returns_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(ImperiumParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(ImperiumParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#then_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_clause(ImperiumParser.Then_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(ImperiumParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#elif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_clause(ImperiumParser.Elif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASIC_LOOP}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASIC_LOOP(ImperiumParser.BASIC_LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILE_UNTIL}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILE_UNTIL(ImperiumParser.WHILE_UNTILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNTIL_WHILE}
	 * labeled alternative in {@link ImperiumParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNTIL_WHILE(ImperiumParser.UNTIL_WHILEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#while_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_option(ImperiumParser.While_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#until_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_option(ImperiumParser.Until_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#define_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_stmt(ImperiumParser.Define_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(ImperiumParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimal_literal(ImperiumParser.Hexadecimal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#octal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_literal(ImperiumParser.Octal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#decimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_literal(ImperiumParser.Decimal_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImperiumParser#binary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_literal(ImperiumParser.Binary_literalContext ctx);
}