// Generated from Powershell2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Powershell2Parser}.
 */
public interface Powershell2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(Powershell2Parser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(Powershell2Parser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(Powershell2Parser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(Powershell2Parser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Powershell2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Powershell2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Powershell2Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Powershell2Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(Powershell2Parser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(Powershell2Parser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Powershell2Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Powershell2Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#lvalueExpression}.
	 * @param ctx the parse tree
	 */
	void enterLvalueExpression(Powershell2Parser.LvalueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#lvalueExpression}.
	 * @param ctx the parse tree
	 */
	void exitLvalueExpression(Powershell2Parser.LvalueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(Powershell2Parser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(Powershell2Parser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#simplelvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimplelvalue(Powershell2Parser.SimplelvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#simplelvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimplelvalue(Powershell2Parser.SimplelvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#firstPipelineElement}.
	 * @param ctx the parse tree
	 */
	void enterFirstPipelineElement(Powershell2Parser.FirstPipelineElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#firstPipelineElement}.
	 * @param ctx the parse tree
	 */
	void exitFirstPipelineElement(Powershell2Parser.FirstPipelineElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#cmdletCall}.
	 * @param ctx the parse tree
	 */
	void enterCmdletCall(Powershell2Parser.CmdletCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#cmdletCall}.
	 * @param ctx the parse tree
	 */
	void exitCmdletCall(Powershell2Parser.CmdletCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#commandInvocationOperator}.
	 * @param ctx the parse tree
	 */
	void enterCommandInvocationOperator(Powershell2Parser.CommandInvocationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#commandInvocationOperator}.
	 * @param ctx the parse tree
	 */
	void exitCommandInvocationOperator(Powershell2Parser.CommandInvocationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#commandElement}.
	 * @param ctx the parse tree
	 */
	void enterCommandElement(Powershell2Parser.CommandElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#commandElement}.
	 * @param ctx the parse tree
	 */
	void exitCommandElement(Powershell2Parser.CommandElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(Powershell2Parser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(Powershell2Parser.RedirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(Powershell2Parser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(Powershell2Parser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Powershell2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Powershell2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#elseifClause}.
	 * @param ctx the parse tree
	 */
	void enterElseifClause(Powershell2Parser.ElseifClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#elseifClause}.
	 * @param ctx the parse tree
	 */
	void exitElseifClause(Powershell2Parser.ElseifClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(Powershell2Parser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(Powershell2Parser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Powershell2Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Powershell2Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchParameter}.
	 * @param ctx the parse tree
	 */
	void enterSwitchParameter(Powershell2Parser.SwitchParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchParameter}.
	 * @param ctx the parse tree
	 */
	void exitSwitchParameter(Powershell2Parser.SwitchParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCondition(Powershell2Parser.SwitchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCondition(Powershell2Parser.SwitchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchFilename}.
	 * @param ctx the parse tree
	 */
	void enterSwitchFilename(Powershell2Parser.SwitchFilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchFilename}.
	 * @param ctx the parse tree
	 */
	void exitSwitchFilename(Powershell2Parser.SwitchFilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(Powershell2Parser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(Powershell2Parser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchClause}.
	 * @param ctx the parse tree
	 */
	void enterSwitchClause(Powershell2Parser.SwitchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchClause}.
	 * @param ctx the parse tree
	 */
	void exitSwitchClause(Powershell2Parser.SwitchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#switchClauseCondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchClauseCondition(Powershell2Parser.SwitchClauseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#switchClauseCondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchClauseCondition(Powershell2Parser.SwitchClauseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#propertyorarrayreference}.
	 * @param ctx the parse tree
	 */
	void enterPropertyorarrayreference(Powershell2Parser.PropertyorarrayreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#propertyorarrayreference}.
	 * @param ctx the parse tree
	 */
	void exitPropertyorarrayreference(Powershell2Parser.PropertyorarrayreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#propertyorarrayreferenceoperator}.
	 * @param ctx the parse tree
	 */
	void enterPropertyorarrayreferenceoperator(Powershell2Parser.PropertyorarrayreferenceoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#propertyorarrayreferenceoperator}.
	 * @param ctx the parse tree
	 */
	void exitPropertyorarrayreferenceoperator(Powershell2Parser.PropertyorarrayreferenceoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#trapStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrapStatement(Powershell2Parser.TrapStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#trapStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrapStatement(Powershell2Parser.TrapStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlowControlStatement(Powershell2Parser.FlowControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlowControlStatement(Powershell2Parser.FlowControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpression(Powershell2Parser.LabelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpression(Powershell2Parser.LabelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessExpre}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessExpre(Powershell2Parser.ElementAccessExpreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessExpre}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessExpre(Powershell2Parser.ElementAccessExpreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(Powershell2Parser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(Powershell2Parser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFormatExpression(Powershell2Parser.FormatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFormatExpression(Powershell2Parser.FormatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(Powershell2Parser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlusExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(Powershell2Parser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Powershell2Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Powershell2Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(Powershell2Parser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(Powershell2Parser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code borExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBorExpression(Powershell2Parser.BorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code borExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBorExpression(Powershell2Parser.BorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bandExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBandExpression(Powershell2Parser.BandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bandExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBandExpression(Powershell2Parser.BandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(Powershell2Parser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(Powershell2Parser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(Powershell2Parser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(Powershell2Parser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecrementExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(Powershell2Parser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecrementExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(Powershell2Parser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Powershell2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Powershell2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bxorExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBxorExpression(Powershell2Parser.BxorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bxorExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBxorExpression(Powershell2Parser.BxorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexclamExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotexclamExpression(Powershell2Parser.NotexclamExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexclamExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotexclamExpression(Powershell2Parser.NotexclamExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(Powershell2Parser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(Powershell2Parser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Powershell2Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Powershell2Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(Powershell2Parser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(Powershell2Parser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Powershell2Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Powershell2Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberClassAccessExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberClassAccessExpression(Powershell2Parser.MemberClassAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberClassAccessExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberClassAccessExpression(Powershell2Parser.MemberClassAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJoinExpression(Powershell2Parser.JoinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJoinExpression(Powershell2Parser.JoinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code splitExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSplitExpression(Powershell2Parser.SplitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code splitExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSplitExpression(Powershell2Parser.SplitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(Powershell2Parser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(Powershell2Parser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(Powershell2Parser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(Powershell2Parser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncrementExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(Powershell2Parser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncrementExpression}
	 * labeled alternative in {@link Powershell2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(Powershell2Parser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Powershell2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Powershell2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(Powershell2Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(Powershell2Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Powershell2Parser#redirectionOperator}.
	 * @param ctx the parse tree
	 */
	void enterRedirectionOperator(Powershell2Parser.RedirectionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Powershell2Parser#redirectionOperator}.
	 * @param ctx the parse tree
	 */
	void exitRedirectionOperator(Powershell2Parser.RedirectionOperatorContext ctx);
}