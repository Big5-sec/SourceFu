// Generated from Powershell.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PowershellParser}.
 */
public interface PowershellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PowershellParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(PowershellParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(PowershellParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(PowershellParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(PowershellParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PowershellParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PowershellParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#pipelineTail}.
	 * @param ctx the parse tree
	 */
	void enterPipelineTail(PowershellParser.PipelineTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#pipelineTail}.
	 * @param ctx the parse tree
	 */
	void exitPipelineTail(PowershellParser.PipelineTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#redirections}.
	 * @param ctx the parse tree
	 */
	void enterRedirections(PowershellParser.RedirectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#redirections}.
	 * @param ctx the parse tree
	 */
	void exitRedirections(PowershellParser.RedirectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(PowershellParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(PowershellParser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#redirectedFileName}.
	 * @param ctx the parse tree
	 */
	void enterRedirectedFileName(PowershellParser.RedirectedFileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#redirectedFileName}.
	 * @param ctx the parse tree
	 */
	void exitRedirectedFileName(PowershellParser.RedirectedFileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PowershellParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PowershellParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandInvocationOperator}.
	 * @param ctx the parse tree
	 */
	void enterCommandInvocationOperator(PowershellParser.CommandInvocationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandInvocationOperator}.
	 * @param ctx the parse tree
	 */
	void exitCommandInvocationOperator(PowershellParser.CommandInvocationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandModule}.
	 * @param ctx the parse tree
	 */
	void enterCommandModule(PowershellParser.CommandModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandModule}.
	 * @param ctx the parse tree
	 */
	void exitCommandModule(PowershellParser.CommandModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandName}.
	 * @param ctx the parse tree
	 */
	void enterCommandName(PowershellParser.CommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandName}.
	 * @param ctx the parse tree
	 */
	void exitCommandName(PowershellParser.CommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#genericToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericToken(PowershellParser.GenericTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#genericToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericToken(PowershellParser.GenericTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommandNameExpr(PowershellParser.CommandNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommandNameExpr(PowershellParser.CommandNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandElement}.
	 * @param ctx the parse tree
	 */
	void enterCommandElement(PowershellParser.CommandElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandElement}.
	 * @param ctx the parse tree
	 */
	void exitCommandElement(PowershellParser.CommandElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#commandArgument}.
	 * @param ctx the parse tree
	 */
	void enterCommandArgument(PowershellParser.CommandArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#commandArgument}.
	 * @param ctx the parse tree
	 */
	void exitCommandArgument(PowershellParser.CommandArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessExpre}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessExpre(PowershellParser.ElementAccessExpreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessExpre}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessExpre(PowershellParser.ElementAccessExpreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(PowershellParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(PowershellParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFormatExpression(PowershellParser.FormatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFormatExpression(PowershellParser.FormatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(PowershellParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(PowershellParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PowershellParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PowershellParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(PowershellParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(PowershellParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBorExpression(PowershellParser.BorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBorExpression(PowershellParser.BorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bandExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBandExpression(PowershellParser.BandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bandExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBandExpression(PowershellParser.BandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(PowershellParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(PowershellParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(PowershellParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(PowershellParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecrementExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(PowershellParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecrementExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(PowershellParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PowershellParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PowershellParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bxorExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBxorExpression(PowershellParser.BxorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bxorExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBxorExpression(PowershellParser.BxorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexclamExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotexclamExpression(PowershellParser.NotexclamExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexclamExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotexclamExpression(PowershellParser.NotexclamExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(PowershellParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(PowershellParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(PowershellParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(PowershellParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(PowershellParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(PowershellParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PowershellParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PowershellParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberClassAccessExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberClassAccessExpression(PowershellParser.MemberClassAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberClassAccessExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberClassAccessExpression(PowershellParser.MemberClassAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpression(PowershellParser.JoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpression(PowershellParser.JoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code splitExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSplitExpression(PowershellParser.SplitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code splitExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSplitExpression(PowershellParser.SplitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(PowershellParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(PowershellParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(PowershellParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(PowershellParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncrementExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(PowershellParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncrementExpression}
	 * labeled alternative in {@link PowershellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(PowershellParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PowershellParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PowershellParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#statementTerminators}.
	 * @param ctx the parse tree
	 */
	void enterStatementTerminators(PowershellParser.StatementTerminatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#statementTerminators}.
	 * @param ctx the parse tree
	 */
	void exitStatementTerminators(PowershellParser.StatementTerminatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#memberName}.
	 * @param ctx the parse tree
	 */
	void enterMemberName(PowershellParser.MemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#memberName}.
	 * @param ctx the parse tree
	 */
	void exitMemberName(PowershellParser.MemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PowershellParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PowershellParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(PowershellParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(PowershellParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(PowershellParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(PowershellParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#blockName}.
	 * @param ctx the parse tree
	 */
	void enterBlockName(PowershellParser.BlockNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#blockName}.
	 * @param ctx the parse tree
	 */
	void exitBlockName(PowershellParser.BlockNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PowershellParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PowershellParser.ComparisonOperatorContext ctx);
}