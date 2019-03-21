package sourcefu.VBA.antlr;

// Generated from VBAParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VBAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VBAParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VBAParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(VBAParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(VBAParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleHeader(VBAParser.ModuleHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleConfigReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigReferences(VBAParser.ModuleConfigReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleConfigReferenceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigReferenceElement(VBAParser.ModuleConfigReferenceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfig(VBAParser.ModuleConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleConfigProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigProperty(VBAParser.ModuleConfigPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigElement(VBAParser.ModuleConfigElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#shortcut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcut(VBAParser.ShortcutContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(VBAParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleAttributes(VBAParser.ModuleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#attributeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeStmt(VBAParser.AttributeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(VBAParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(VBAParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclarations(VBAParser.ModuleDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionBaseStmt(VBAParser.OptionBaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionCompareStmt(VBAParser.OptionCompareStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionExplicitStmt(VBAParser.OptionExplicitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionPrivateModuleStmt(VBAParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclarationsElement(VBAParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(VBAParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBodyElement(VBAParser.ModuleBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(VBAParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#unterminatedBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnterminatedBlock(VBAParser.UnterminatedBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(VBAParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#mainBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlockStmt(VBAParser.MainBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#fileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileStmt(VBAParser.FileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#openStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStmt(VBAParser.OpenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#pathName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathName(VBAParser.PathNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#modeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeClause(VBAParser.ModeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#fileMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileMode(VBAParser.FileModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#accessClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessClause(VBAParser.AccessClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(VBAParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock(VBAParser.LockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenClause(VBAParser.LenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#recLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecLength(VBAParser.RecLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#fileNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileNumber(VBAParser.FileNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#markedFileNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkedFileNumber(VBAParser.MarkedFileNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#unmarkedFileNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmarkedFileNumber(VBAParser.UnmarkedFileNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#closeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStmt(VBAParser.CloseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#resetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStmt(VBAParser.ResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#fileNumberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileNumberList(VBAParser.FileNumberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#seekStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeekStmt(VBAParser.SeekStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(VBAParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(VBAParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#recordRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordRange(VBAParser.RecordRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#startRecordNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRecordNumber(VBAParser.StartRecordNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#endRecordNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndRecordNumber(VBAParser.EndRecordNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#unlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStmt(VBAParser.UnlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lineInputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineInputStmt(VBAParser.LineInputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(VBAParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#widthStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthStmt(VBAParser.WidthStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lineWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWidth(VBAParser.LineWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#debugPrintStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugPrintStmt(VBAParser.DebugPrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#debugPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugPrint(VBAParser.DebugPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#debugModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugModule(VBAParser.DebugModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#debugPrintSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugPrintSub(VBAParser.DebugPrintSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(VBAParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#outputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputList(VBAParser.OutputListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#outputItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputItem(VBAParser.OutputItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#outputClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputClause(VBAParser.OutputClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#charPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPosition(VBAParser.CharPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#outputExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputExpression(VBAParser.OutputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#spcClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpcClause(VBAParser.SpcClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#spcNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpcNumber(VBAParser.SpcNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#tabClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabClause(VBAParser.TabClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#tabNumberClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabNumberClause(VBAParser.TabNumberClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#tabNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabNumber(VBAParser.TabNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(VBAParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(VBAParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#inputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputList(VBAParser.InputListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#inputVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVariable(VBAParser.InputVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#putStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStmt(VBAParser.PutStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#recordNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordNumber(VBAParser.RecordNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(VBAParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#getStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetStmt(VBAParser.GetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(VBAParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#constStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStmt(VBAParser.ConstStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#constSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSubStmt(VBAParser.ConstSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(VBAParser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(VBAParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(VBAParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#argDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDefaultValue(VBAParser.ArgDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#defDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDirective(VBAParser.DefDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#defType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefType(VBAParser.DefTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#letterSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetterSpec(VBAParser.LetterSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#singleLetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLetter(VBAParser.SingleLetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#universalLetterRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalLetterRange(VBAParser.UniversalLetterRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#letterRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetterRange(VBAParser.LetterRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#doLoopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoopStmt(VBAParser.DoLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#enumerationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt(VBAParser.EnumerationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt_Constant(VBAParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#endStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStmt(VBAParser.EndStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#eraseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEraseStmt(VBAParser.EraseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#errorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStmt(VBAParser.ErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#eventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventStmt(VBAParser.EventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#exitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(VBAParser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#forEachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStmt(VBAParser.ForEachStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#forNextStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForNextStmt(VBAParser.ForNextStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#stepStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepStmt(VBAParser.StepStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#functionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStmt(VBAParser.FunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(VBAParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#goSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoSubStmt(VBAParser.GoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#goToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStmt(VBAParser.GoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(VBAParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlock(VBAParser.ElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(VBAParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#singleLineIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineIfStmt(VBAParser.SingleLineIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#ifWithNonEmptyThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfWithNonEmptyThen(VBAParser.IfWithNonEmptyThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#ifWithEmptyThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfWithEmptyThen(VBAParser.IfWithEmptyThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#singleLineElseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineElseClause(VBAParser.SingleLineElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#listOrLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOrLabel(VBAParser.ListOrLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#sameLineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameLineStatement(VBAParser.SameLineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(VBAParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#implementsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStmt(VBAParser.ImplementsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(VBAParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsetStmt(VBAParser.LsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#onErrorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnErrorStmt(VBAParser.OnErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#onGoToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoToStmt(VBAParser.OnGoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoSubStmt(VBAParser.OnGoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetStmt(VBAParser.PropertyGetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#propertySetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetStmt(VBAParser.PropertySetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyLetStmt(VBAParser.PropertyLetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseEventStmt(VBAParser.RaiseEventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#eventArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventArgumentList(VBAParser.EventArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#eventArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventArgument(VBAParser.EventArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#redimStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimStmt(VBAParser.RedimStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#redimDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimDeclarationList(VBAParser.RedimDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#redimVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimVariableDeclaration(VBAParser.RedimVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#midStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidStatement(VBAParser.MidStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#modeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSpecifier(VBAParser.ModeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#integerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(VBAParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(VBAParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#resumeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeStmt(VBAParser.ResumeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(VBAParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#rsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsetStmt(VBAParser.RsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#stopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStmt(VBAParser.StopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#nameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStmt(VBAParser.NameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseStmt(VBAParser.SelectCaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#selectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpression(VBAParser.SelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(VBAParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#caseElseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElseClause(VBAParser.CaseElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(VBAParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#selectStartValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStartValue(VBAParser.SelectStartValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#selectEndValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectEndValue(VBAParser.SelectEndValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(VBAParser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#subStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubStmt(VBAParser.SubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#subroutineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineName(VBAParser.SubroutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#udtDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdtDeclaration(VBAParser.UdtDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#udtMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdtMemberList(VBAParser.UdtMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#udtMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdtMember(VBAParser.UdtMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#untypedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntypedNameMemberDeclaration(VBAParser.UntypedNameMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#reservedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedNameMemberDeclaration(VBAParser.ReservedNameMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#optionalArrayClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalArrayClause(VBAParser.OptionalArrayClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#arrayDim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDim(VBAParser.ArrayDimContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#boundsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundsList(VBAParser.BoundsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#dimSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimSpec(VBAParser.DimSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lowerBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerBound(VBAParser.LowerBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#upperBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperBound(VBAParser.UpperBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(VBAParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStmt(VBAParser.VariableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variableListStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableListStmt(VBAParser.VariableListStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variableSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSubStmt(VBAParser.VariableSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#whileWendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileWendStmt(VBAParser.WhileWendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(VBAParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lineSpecialForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineSpecialForm(VBAParser.LineSpecialFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#circleSpecialForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleSpecialForm(VBAParser.CircleSpecialFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#scaleSpecialForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleSpecialForm(VBAParser.ScaleSpecialFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#pSetSpecialForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPSetSpecialForm(VBAParser.PSetSpecialFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(VBAParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lineSpecialFormOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineSpecialFormOption(VBAParser.LineSpecialFormOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(VBAParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(VBAParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#unrestrictedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnrestrictedIdentifier(VBAParser.UnrestrictedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#legalLabelIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegalLabelIdentifier(VBAParser.LegalLabelIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VBAParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#untypedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntypedIdentifier(VBAParser.UntypedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#typedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedIdentifier(VBAParser.TypedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#identifierValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(VBAParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#foreignName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignName(VBAParser.ForeignNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#foreignIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignIdentifier(VBAParser.ForeignIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#asTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeClause(VBAParser.AsTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(VBAParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(VBAParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctLiteralExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtLiteralExpr(VBAParser.CtLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctLExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtLExpr(VBAParser.CtLExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctBuiltInTypeExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtBuiltInTypeExpr(VBAParser.CtBuiltInTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctParenthesizedExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtParenthesizedExpr(VBAParser.CtParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctTypeofexpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtTypeofexpr(VBAParser.CtTypeofexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctNewExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtNewExpr(VBAParser.CtNewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctMarkedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtMarkedFileNumberExpr(VBAParser.CtMarkedFileNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(VBAParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#statementLabelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLabelDefinition(VBAParser.StatementLabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#identifierStatementLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierStatementLabel(VBAParser.IdentifierStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#standaloneLineNumberLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneLineNumberLabel(VBAParser.StandaloneLineNumberLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#combinedLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedLabels(VBAParser.CombinedLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lineNumberLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineNumberLabel(VBAParser.LineNumberLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(VBAParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(VBAParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#typeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHint(VBAParser.TypeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(VBAParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(VBAParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusOp(VBAParser.UnaryMinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOp(VBAParser.PowOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(VBAParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeofexpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofexpr(VBAParser.TypeofexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDivOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDivOp(VBAParser.IntDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalImpOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalImpOp(VBAParser.LogicalImpOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOp(VBAParser.ConcatOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code markedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkedFileNumberExpr(VBAParser.MarkedFileNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(VBAParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLExpr(VBAParser.LExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(VBAParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalXorOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalXorOp(VBAParser.LogicalXorOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndOp(VBAParser.LogicalAndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrOp(VBAParser.LogicalOrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(VBAParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalEqvOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEqvOp(VBAParser.LogicalEqvOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(VBAParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(VBAParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code builtInTypeExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInTypeExpr(VBAParser.BuiltInTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNotOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNotOp(VBAParser.LogicalNotOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(VBAParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#literalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralIdentifier(VBAParser.LiteralIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#booleanLiteralIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralIdentifier(VBAParser.BooleanLiteralIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#objectLiteralIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralIdentifier(VBAParser.ObjectLiteralIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#variantLiteralIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantLiteralIdentifier(VBAParser.VariantLiteralIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(VBAParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withMemberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithMemberAccessExpr(VBAParser.WithMemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withDictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithDictionaryAccessExpr(VBAParser.WithDictionaryAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardExpr(VBAParser.StandardExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleNameExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleNameExpr(VBAParser.SimpleNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpr(VBAParser.MemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceExpr(VBAParser.InstanceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryAccessExpr(VBAParser.DictionaryAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whitespaceIndexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespaceIndexExpr(VBAParser.WhitespaceIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(VBAParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(VBAParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#requiredArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredArgument(VBAParser.RequiredArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(VBAParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#positionalArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(VBAParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(VBAParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#missingArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingArgument(VBAParser.MissingArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(VBAParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#lowerBoundArgumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerBoundArgumentExpression(VBAParser.LowerBoundArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#upperBoundArgumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperBoundArgumentExpression(VBAParser.UpperBoundArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#addressOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressOfExpression(VBAParser.AddressOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(VBAParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#markerKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerKeyword(VBAParser.MarkerKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#statementKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementKeyword(VBAParser.StatementKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#standardFunctionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardFunctionKeyword(VBAParser.StandardFunctionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#endOfLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfLine(VBAParser.EndOfLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#endOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfStatement(VBAParser.EndOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#individualNonEOFEndOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualNonEOFEndOfStatement(VBAParser.IndividualNonEOFEndOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#commentOrAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentOrAnnotation(VBAParser.CommentOrAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#remComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemComment(VBAParser.RemCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(VBAParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#commentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentBody(VBAParser.CommentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(VBAParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(VBAParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(VBAParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#annotationArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArgList(VBAParser.AnnotationArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#annotationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationArg(VBAParser.AnnotationArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#mandatoryLineContinuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatoryLineContinuation(VBAParser.MandatoryLineContinuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBAParser#whiteSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiteSpace(VBAParser.WhiteSpaceContext ctx);
}