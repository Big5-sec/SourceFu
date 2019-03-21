// Generated from VBAParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VBAParser}.
 */
public interface VBAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VBAParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(VBAParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(VBAParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(VBAParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(VBAParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void enterModuleHeader(VBAParser.ModuleHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void exitModuleHeader(VBAParser.ModuleHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleConfigReferences}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigReferences(VBAParser.ModuleConfigReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleConfigReferences}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigReferences(VBAParser.ModuleConfigReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleConfigReferenceElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigReferenceElement(VBAParser.ModuleConfigReferenceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleConfigReferenceElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigReferenceElement(VBAParser.ModuleConfigReferenceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfig(VBAParser.ModuleConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfig(VBAParser.ModuleConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleConfigProperty}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigProperty(VBAParser.ModuleConfigPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleConfigProperty}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigProperty(VBAParser.ModuleConfigPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigElement(VBAParser.ModuleConfigElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigElement(VBAParser.ModuleConfigElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#shortcut}.
	 * @param ctx the parse tree
	 */
	void enterShortcut(VBAParser.ShortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#shortcut}.
	 * @param ctx the parse tree
	 */
	void exitShortcut(VBAParser.ShortcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(VBAParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(VBAParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterModuleAttributes(VBAParser.ModuleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitModuleAttributes(VBAParser.ModuleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStmt(VBAParser.AttributeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStmt(VBAParser.AttributeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(VBAParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(VBAParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(VBAParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(VBAParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarations(VBAParser.ModuleDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarations(VBAParser.ModuleDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionBaseStmt(VBAParser.OptionBaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionBaseStmt(VBAParser.OptionBaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionCompareStmt(VBAParser.OptionCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionCompareStmt(VBAParser.OptionCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionExplicitStmt(VBAParser.OptionExplicitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionExplicitStmt(VBAParser.OptionExplicitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionPrivateModuleStmt(VBAParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VBAParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionPrivateModuleStmt(VBAParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarationsElement(VBAParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarationsElement(VBAParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(VBAParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(VBAParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleBodyElement(VBAParser.ModuleBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleBodyElement(VBAParser.ModuleBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VBAParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VBAParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#unterminatedBlock}.
	 * @param ctx the parse tree
	 */
	void enterUnterminatedBlock(VBAParser.UnterminatedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#unterminatedBlock}.
	 * @param ctx the parse tree
	 */
	void exitUnterminatedBlock(VBAParser.UnterminatedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(VBAParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(VBAParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#mainBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMainBlockStmt(VBAParser.MainBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#mainBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMainBlockStmt(VBAParser.MainBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#fileStmt}.
	 * @param ctx the parse tree
	 */
	void enterFileStmt(VBAParser.FileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#fileStmt}.
	 * @param ctx the parse tree
	 */
	void exitFileStmt(VBAParser.FileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenStmt(VBAParser.OpenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenStmt(VBAParser.OpenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#pathName}.
	 * @param ctx the parse tree
	 */
	void enterPathName(VBAParser.PathNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#pathName}.
	 * @param ctx the parse tree
	 */
	void exitPathName(VBAParser.PathNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#modeClause}.
	 * @param ctx the parse tree
	 */
	void enterModeClause(VBAParser.ModeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#modeClause}.
	 * @param ctx the parse tree
	 */
	void exitModeClause(VBAParser.ModeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#fileMode}.
	 * @param ctx the parse tree
	 */
	void enterFileMode(VBAParser.FileModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#fileMode}.
	 * @param ctx the parse tree
	 */
	void exitFileMode(VBAParser.FileModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#accessClause}.
	 * @param ctx the parse tree
	 */
	void enterAccessClause(VBAParser.AccessClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#accessClause}.
	 * @param ctx the parse tree
	 */
	void exitAccessClause(VBAParser.AccessClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(VBAParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(VBAParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lock}.
	 * @param ctx the parse tree
	 */
	void enterLock(VBAParser.LockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lock}.
	 * @param ctx the parse tree
	 */
	void exitLock(VBAParser.LockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lenClause}.
	 * @param ctx the parse tree
	 */
	void enterLenClause(VBAParser.LenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lenClause}.
	 * @param ctx the parse tree
	 */
	void exitLenClause(VBAParser.LenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#recLength}.
	 * @param ctx the parse tree
	 */
	void enterRecLength(VBAParser.RecLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#recLength}.
	 * @param ctx the parse tree
	 */
	void exitRecLength(VBAParser.RecLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void enterFileNumber(VBAParser.FileNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void exitFileNumber(VBAParser.FileNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#markedFileNumber}.
	 * @param ctx the parse tree
	 */
	void enterMarkedFileNumber(VBAParser.MarkedFileNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#markedFileNumber}.
	 * @param ctx the parse tree
	 */
	void exitMarkedFileNumber(VBAParser.MarkedFileNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#unmarkedFileNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnmarkedFileNumber(VBAParser.UnmarkedFileNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#unmarkedFileNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnmarkedFileNumber(VBAParser.UnmarkedFileNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseStmt(VBAParser.CloseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseStmt(VBAParser.CloseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void enterResetStmt(VBAParser.ResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void exitResetStmt(VBAParser.ResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#fileNumberList}.
	 * @param ctx the parse tree
	 */
	void enterFileNumberList(VBAParser.FileNumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#fileNumberList}.
	 * @param ctx the parse tree
	 */
	void exitFileNumberList(VBAParser.FileNumberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void enterSeekStmt(VBAParser.SeekStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void exitSeekStmt(VBAParser.SeekStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(VBAParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(VBAParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(VBAParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(VBAParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#recordRange}.
	 * @param ctx the parse tree
	 */
	void enterRecordRange(VBAParser.RecordRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#recordRange}.
	 * @param ctx the parse tree
	 */
	void exitRecordRange(VBAParser.RecordRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#startRecordNumber}.
	 * @param ctx the parse tree
	 */
	void enterStartRecordNumber(VBAParser.StartRecordNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#startRecordNumber}.
	 * @param ctx the parse tree
	 */
	void exitStartRecordNumber(VBAParser.StartRecordNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#endRecordNumber}.
	 * @param ctx the parse tree
	 */
	void enterEndRecordNumber(VBAParser.EndRecordNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#endRecordNumber}.
	 * @param ctx the parse tree
	 */
	void exitEndRecordNumber(VBAParser.EndRecordNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStmt(VBAParser.UnlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStmt(VBAParser.UnlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineInputStmt(VBAParser.LineInputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineInputStmt(VBAParser.LineInputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(VBAParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(VBAParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void enterWidthStmt(VBAParser.WidthStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void exitWidthStmt(VBAParser.WidthStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lineWidth}.
	 * @param ctx the parse tree
	 */
	void enterLineWidth(VBAParser.LineWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lineWidth}.
	 * @param ctx the parse tree
	 */
	void exitLineWidth(VBAParser.LineWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#debugPrintStmt}.
	 * @param ctx the parse tree
	 */
	void enterDebugPrintStmt(VBAParser.DebugPrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#debugPrintStmt}.
	 * @param ctx the parse tree
	 */
	void exitDebugPrintStmt(VBAParser.DebugPrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#debugPrint}.
	 * @param ctx the parse tree
	 */
	void enterDebugPrint(VBAParser.DebugPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#debugPrint}.
	 * @param ctx the parse tree
	 */
	void exitDebugPrint(VBAParser.DebugPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#debugModule}.
	 * @param ctx the parse tree
	 */
	void enterDebugModule(VBAParser.DebugModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#debugModule}.
	 * @param ctx the parse tree
	 */
	void exitDebugModule(VBAParser.DebugModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#debugPrintSub}.
	 * @param ctx the parse tree
	 */
	void enterDebugPrintSub(VBAParser.DebugPrintSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#debugPrintSub}.
	 * @param ctx the parse tree
	 */
	void exitDebugPrintSub(VBAParser.DebugPrintSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(VBAParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(VBAParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#outputList}.
	 * @param ctx the parse tree
	 */
	void enterOutputList(VBAParser.OutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#outputList}.
	 * @param ctx the parse tree
	 */
	void exitOutputList(VBAParser.OutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#outputItem}.
	 * @param ctx the parse tree
	 */
	void enterOutputItem(VBAParser.OutputItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#outputItem}.
	 * @param ctx the parse tree
	 */
	void exitOutputItem(VBAParser.OutputItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#outputClause}.
	 * @param ctx the parse tree
	 */
	void enterOutputClause(VBAParser.OutputClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#outputClause}.
	 * @param ctx the parse tree
	 */
	void exitOutputClause(VBAParser.OutputClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#charPosition}.
	 * @param ctx the parse tree
	 */
	void enterCharPosition(VBAParser.CharPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#charPosition}.
	 * @param ctx the parse tree
	 */
	void exitCharPosition(VBAParser.CharPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void enterOutputExpression(VBAParser.OutputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void exitOutputExpression(VBAParser.OutputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#spcClause}.
	 * @param ctx the parse tree
	 */
	void enterSpcClause(VBAParser.SpcClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#spcClause}.
	 * @param ctx the parse tree
	 */
	void exitSpcClause(VBAParser.SpcClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#spcNumber}.
	 * @param ctx the parse tree
	 */
	void enterSpcNumber(VBAParser.SpcNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#spcNumber}.
	 * @param ctx the parse tree
	 */
	void exitSpcNumber(VBAParser.SpcNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#tabClause}.
	 * @param ctx the parse tree
	 */
	void enterTabClause(VBAParser.TabClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#tabClause}.
	 * @param ctx the parse tree
	 */
	void exitTabClause(VBAParser.TabClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#tabNumberClause}.
	 * @param ctx the parse tree
	 */
	void enterTabNumberClause(VBAParser.TabNumberClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#tabNumberClause}.
	 * @param ctx the parse tree
	 */
	void exitTabNumberClause(VBAParser.TabNumberClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#tabNumber}.
	 * @param ctx the parse tree
	 */
	void enterTabNumber(VBAParser.TabNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#tabNumber}.
	 * @param ctx the parse tree
	 */
	void exitTabNumber(VBAParser.TabNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(VBAParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(VBAParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(VBAParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(VBAParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#inputList}.
	 * @param ctx the parse tree
	 */
	void enterInputList(VBAParser.InputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#inputList}.
	 * @param ctx the parse tree
	 */
	void exitInputList(VBAParser.InputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#inputVariable}.
	 * @param ctx the parse tree
	 */
	void enterInputVariable(VBAParser.InputVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#inputVariable}.
	 * @param ctx the parse tree
	 */
	void exitInputVariable(VBAParser.InputVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void enterPutStmt(VBAParser.PutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void exitPutStmt(VBAParser.PutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#recordNumber}.
	 * @param ctx the parse tree
	 */
	void enterRecordNumber(VBAParser.RecordNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#recordNumber}.
	 * @param ctx the parse tree
	 */
	void exitRecordNumber(VBAParser.RecordNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(VBAParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(VBAParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetStmt(VBAParser.GetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetStmt(VBAParser.GetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VBAParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VBAParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstStmt(VBAParser.ConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstStmt(VBAParser.ConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstSubStmt(VBAParser.ConstSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstSubStmt(VBAParser.ConstSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(VBAParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(VBAParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VBAParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VBAParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(VBAParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(VBAParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterArgDefaultValue(VBAParser.ArgDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitArgDefaultValue(VBAParser.ArgDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#defDirective}.
	 * @param ctx the parse tree
	 */
	void enterDefDirective(VBAParser.DefDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#defDirective}.
	 * @param ctx the parse tree
	 */
	void exitDefDirective(VBAParser.DefDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#defType}.
	 * @param ctx the parse tree
	 */
	void enterDefType(VBAParser.DefTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#defType}.
	 * @param ctx the parse tree
	 */
	void exitDefType(VBAParser.DefTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#letterSpec}.
	 * @param ctx the parse tree
	 */
	void enterLetterSpec(VBAParser.LetterSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#letterSpec}.
	 * @param ctx the parse tree
	 */
	void exitLetterSpec(VBAParser.LetterSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#singleLetter}.
	 * @param ctx the parse tree
	 */
	void enterSingleLetter(VBAParser.SingleLetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#singleLetter}.
	 * @param ctx the parse tree
	 */
	void exitSingleLetter(VBAParser.SingleLetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#universalLetterRange}.
	 * @param ctx the parse tree
	 */
	void enterUniversalLetterRange(VBAParser.UniversalLetterRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#universalLetterRange}.
	 * @param ctx the parse tree
	 */
	void exitUniversalLetterRange(VBAParser.UniversalLetterRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#letterRange}.
	 * @param ctx the parse tree
	 */
	void enterLetterRange(VBAParser.LetterRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#letterRange}.
	 * @param ctx the parse tree
	 */
	void exitLetterRange(VBAParser.LetterRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoLoopStmt(VBAParser.DoLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoLoopStmt(VBAParser.DoLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt(VBAParser.EnumerationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt(VBAParser.EnumerationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt_Constant(VBAParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt_Constant(VBAParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndStmt(VBAParser.EndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndStmt(VBAParser.EndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(VBAParser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(VBAParser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(VBAParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(VBAParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void enterEventStmt(VBAParser.EventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void exitEventStmt(VBAParser.EventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(VBAParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(VBAParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(VBAParser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(VBAParser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void enterForNextStmt(VBAParser.ForNextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void exitForNextStmt(VBAParser.ForNextStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#stepStmt}.
	 * @param ctx the parse tree
	 */
	void enterStepStmt(VBAParser.StepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#stepStmt}.
	 * @param ctx the parse tree
	 */
	void exitStepStmt(VBAParser.StepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(VBAParser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(VBAParser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(VBAParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(VBAParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoSubStmt(VBAParser.GoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoSubStmt(VBAParser.GoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoToStmt(VBAParser.GoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoToStmt(VBAParser.GoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(VBAParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(VBAParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(VBAParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(VBAParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(VBAParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(VBAParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#singleLineIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineIfStmt(VBAParser.SingleLineIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#singleLineIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineIfStmt(VBAParser.SingleLineIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#ifWithNonEmptyThen}.
	 * @param ctx the parse tree
	 */
	void enterIfWithNonEmptyThen(VBAParser.IfWithNonEmptyThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#ifWithNonEmptyThen}.
	 * @param ctx the parse tree
	 */
	void exitIfWithNonEmptyThen(VBAParser.IfWithNonEmptyThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#ifWithEmptyThen}.
	 * @param ctx the parse tree
	 */
	void enterIfWithEmptyThen(VBAParser.IfWithEmptyThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#ifWithEmptyThen}.
	 * @param ctx the parse tree
	 */
	void exitIfWithEmptyThen(VBAParser.IfWithEmptyThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#singleLineElseClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineElseClause(VBAParser.SingleLineElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#singleLineElseClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineElseClause(VBAParser.SingleLineElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#listOrLabel}.
	 * @param ctx the parse tree
	 */
	void enterListOrLabel(VBAParser.ListOrLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#listOrLabel}.
	 * @param ctx the parse tree
	 */
	void exitListOrLabel(VBAParser.ListOrLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#sameLineStatement}.
	 * @param ctx the parse tree
	 */
	void enterSameLineStatement(VBAParser.SameLineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#sameLineStatement}.
	 * @param ctx the parse tree
	 */
	void exitSameLineStatement(VBAParser.SameLineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(VBAParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(VBAParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStmt(VBAParser.ImplementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStmt(VBAParser.ImplementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(VBAParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(VBAParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterLsetStmt(VBAParser.LsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitLsetStmt(VBAParser.LsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnErrorStmt(VBAParser.OnErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnErrorStmt(VBAParser.OnErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoToStmt(VBAParser.OnGoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoToStmt(VBAParser.OnGoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoSubStmt(VBAParser.OnGoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoSubStmt(VBAParser.OnGoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetStmt(VBAParser.PropertyGetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetStmt(VBAParser.PropertyGetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetStmt(VBAParser.PropertySetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetStmt(VBAParser.PropertySetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLetStmt(VBAParser.PropertyLetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLetStmt(VBAParser.PropertyLetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseEventStmt(VBAParser.RaiseEventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseEventStmt(VBAParser.RaiseEventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#eventArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterEventArgumentList(VBAParser.EventArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#eventArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitEventArgumentList(VBAParser.EventArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#eventArgument}.
	 * @param ctx the parse tree
	 */
	void enterEventArgument(VBAParser.EventArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#eventArgument}.
	 * @param ctx the parse tree
	 */
	void exitEventArgument(VBAParser.EventArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimStmt(VBAParser.RedimStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimStmt(VBAParser.RedimStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#redimDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterRedimDeclarationList(VBAParser.RedimDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#redimDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitRedimDeclarationList(VBAParser.RedimDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#redimVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRedimVariableDeclaration(VBAParser.RedimVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#redimVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRedimVariableDeclaration(VBAParser.RedimVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#midStatement}.
	 * @param ctx the parse tree
	 */
	void enterMidStatement(VBAParser.MidStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#midStatement}.
	 * @param ctx the parse tree
	 */
	void exitMidStatement(VBAParser.MidStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#modeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterModeSpecifier(VBAParser.ModeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#modeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitModeSpecifier(VBAParser.ModeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(VBAParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(VBAParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(VBAParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(VBAParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void enterResumeStmt(VBAParser.ResumeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void exitResumeStmt(VBAParser.ResumeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(VBAParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(VBAParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterRsetStmt(VBAParser.RsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitRsetStmt(VBAParser.RsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(VBAParser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(VBAParser.StopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void enterNameStmt(VBAParser.NameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void exitNameStmt(VBAParser.NameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseStmt(VBAParser.SelectCaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseStmt(VBAParser.SelectCaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpression(VBAParser.SelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpression(VBAParser.SelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(VBAParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(VBAParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#caseElseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseElseClause(VBAParser.CaseElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#caseElseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseElseClause(VBAParser.CaseElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(VBAParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(VBAParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#selectStartValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectStartValue(VBAParser.SelectStartValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#selectStartValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectStartValue(VBAParser.SelectStartValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#selectEndValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectEndValue(VBAParser.SelectEndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#selectEndValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectEndValue(VBAParser.SelectEndValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(VBAParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(VBAParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void enterSubStmt(VBAParser.SubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void exitSubStmt(VBAParser.SubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineName(VBAParser.SubroutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineName(VBAParser.SubroutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#udtDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUdtDeclaration(VBAParser.UdtDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#udtDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUdtDeclaration(VBAParser.UdtDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#udtMemberList}.
	 * @param ctx the parse tree
	 */
	void enterUdtMemberList(VBAParser.UdtMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#udtMemberList}.
	 * @param ctx the parse tree
	 */
	void exitUdtMemberList(VBAParser.UdtMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#udtMember}.
	 * @param ctx the parse tree
	 */
	void enterUdtMember(VBAParser.UdtMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#udtMember}.
	 * @param ctx the parse tree
	 */
	void exitUdtMember(VBAParser.UdtMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#untypedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUntypedNameMemberDeclaration(VBAParser.UntypedNameMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#untypedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUntypedNameMemberDeclaration(VBAParser.UntypedNameMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#reservedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReservedNameMemberDeclaration(VBAParser.ReservedNameMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#reservedNameMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReservedNameMemberDeclaration(VBAParser.ReservedNameMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#optionalArrayClause}.
	 * @param ctx the parse tree
	 */
	void enterOptionalArrayClause(VBAParser.OptionalArrayClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#optionalArrayClause}.
	 * @param ctx the parse tree
	 */
	void exitOptionalArrayClause(VBAParser.OptionalArrayClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#arrayDim}.
	 * @param ctx the parse tree
	 */
	void enterArrayDim(VBAParser.ArrayDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#arrayDim}.
	 * @param ctx the parse tree
	 */
	void exitArrayDim(VBAParser.ArrayDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#boundsList}.
	 * @param ctx the parse tree
	 */
	void enterBoundsList(VBAParser.BoundsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#boundsList}.
	 * @param ctx the parse tree
	 */
	void exitBoundsList(VBAParser.BoundsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#dimSpec}.
	 * @param ctx the parse tree
	 */
	void enterDimSpec(VBAParser.DimSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#dimSpec}.
	 * @param ctx the parse tree
	 */
	void exitDimSpec(VBAParser.DimSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lowerBound}.
	 * @param ctx the parse tree
	 */
	void enterLowerBound(VBAParser.LowerBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lowerBound}.
	 * @param ctx the parse tree
	 */
	void exitLowerBound(VBAParser.LowerBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#upperBound}.
	 * @param ctx the parse tree
	 */
	void enterUpperBound(VBAParser.UpperBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#upperBound}.
	 * @param ctx the parse tree
	 */
	void exitUpperBound(VBAParser.UpperBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(VBAParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(VBAParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(VBAParser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(VBAParser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableListStmt(VBAParser.VariableListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableListStmt(VBAParser.VariableListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSubStmt(VBAParser.VariableSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSubStmt(VBAParser.VariableSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileWendStmt(VBAParser.WhileWendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileWendStmt(VBAParser.WhileWendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(VBAParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(VBAParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lineSpecialForm}.
	 * @param ctx the parse tree
	 */
	void enterLineSpecialForm(VBAParser.LineSpecialFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lineSpecialForm}.
	 * @param ctx the parse tree
	 */
	void exitLineSpecialForm(VBAParser.LineSpecialFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#circleSpecialForm}.
	 * @param ctx the parse tree
	 */
	void enterCircleSpecialForm(VBAParser.CircleSpecialFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#circleSpecialForm}.
	 * @param ctx the parse tree
	 */
	void exitCircleSpecialForm(VBAParser.CircleSpecialFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#scaleSpecialForm}.
	 * @param ctx the parse tree
	 */
	void enterScaleSpecialForm(VBAParser.ScaleSpecialFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#scaleSpecialForm}.
	 * @param ctx the parse tree
	 */
	void exitScaleSpecialForm(VBAParser.ScaleSpecialFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#pSetSpecialForm}.
	 * @param ctx the parse tree
	 */
	void enterPSetSpecialForm(VBAParser.PSetSpecialFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#pSetSpecialForm}.
	 * @param ctx the parse tree
	 */
	void exitPSetSpecialForm(VBAParser.PSetSpecialFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(VBAParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(VBAParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lineSpecialFormOption}.
	 * @param ctx the parse tree
	 */
	void enterLineSpecialFormOption(VBAParser.LineSpecialFormOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lineSpecialFormOption}.
	 * @param ctx the parse tree
	 */
	void exitLineSpecialFormOption(VBAParser.LineSpecialFormOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(VBAParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(VBAParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VBAParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VBAParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#unrestrictedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnrestrictedIdentifier(VBAParser.UnrestrictedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#unrestrictedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnrestrictedIdentifier(VBAParser.UnrestrictedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#legalLabelIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLegalLabelIdentifier(VBAParser.LegalLabelIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#legalLabelIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLegalLabelIdentifier(VBAParser.LegalLabelIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VBAParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VBAParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#untypedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUntypedIdentifier(VBAParser.UntypedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#untypedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUntypedIdentifier(VBAParser.UntypedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#typedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypedIdentifier(VBAParser.TypedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#typedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypedIdentifier(VBAParser.TypedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#identifierValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValue(VBAParser.IdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#identifierValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValue(VBAParser.IdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#foreignName}.
	 * @param ctx the parse tree
	 */
	void enterForeignName(VBAParser.ForeignNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#foreignName}.
	 * @param ctx the parse tree
	 */
	void exitForeignName(VBAParser.ForeignNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#foreignIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterForeignIdentifier(VBAParser.ForeignIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#foreignIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitForeignIdentifier(VBAParser.ForeignIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeClause(VBAParser.AsTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeClause(VBAParser.AsTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(VBAParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(VBAParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VBAParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VBAParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctLiteralExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtLiteralExpr(VBAParser.CtLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctLiteralExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtLiteralExpr(VBAParser.CtLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctLExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtLExpr(VBAParser.CtLExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctLExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtLExpr(VBAParser.CtLExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctBuiltInTypeExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtBuiltInTypeExpr(VBAParser.CtBuiltInTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctBuiltInTypeExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtBuiltInTypeExpr(VBAParser.CtBuiltInTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctParenthesizedExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtParenthesizedExpr(VBAParser.CtParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctParenthesizedExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtParenthesizedExpr(VBAParser.CtParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctTypeofexpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtTypeofexpr(VBAParser.CtTypeofexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctTypeofexpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtTypeofexpr(VBAParser.CtTypeofexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctNewExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtNewExpr(VBAParser.CtNewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctNewExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtNewExpr(VBAParser.CtNewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctMarkedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterCtMarkedFileNumberExpr(VBAParser.CtMarkedFileNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctMarkedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitCtMarkedFileNumberExpr(VBAParser.CtMarkedFileNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(VBAParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(VBAParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#statementLabelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStatementLabelDefinition(VBAParser.StatementLabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#statementLabelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStatementLabelDefinition(VBAParser.StatementLabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#identifierStatementLabel}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierStatementLabel(VBAParser.IdentifierStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#identifierStatementLabel}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierStatementLabel(VBAParser.IdentifierStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#standaloneLineNumberLabel}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneLineNumberLabel(VBAParser.StandaloneLineNumberLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#standaloneLineNumberLabel}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneLineNumberLabel(VBAParser.StandaloneLineNumberLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#combinedLabels}.
	 * @param ctx the parse tree
	 */
	void enterCombinedLabels(VBAParser.CombinedLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#combinedLabels}.
	 * @param ctx the parse tree
	 */
	void exitCombinedLabels(VBAParser.CombinedLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lineNumberLabel}.
	 * @param ctx the parse tree
	 */
	void enterLineNumberLabel(VBAParser.LineNumberLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lineNumberLabel}.
	 * @param ctx the parse tree
	 */
	void exitLineNumberLabel(VBAParser.LineNumberLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(VBAParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(VBAParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VBAParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VBAParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(VBAParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(VBAParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(VBAParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(VBAParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(VBAParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(VBAParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusOp(VBAParser.UnaryMinusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusOp(VBAParser.UnaryMinusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowOp(VBAParser.PowOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowOp(VBAParser.PowOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(VBAParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(VBAParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofexpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofexpr(VBAParser.TypeofexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofexpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofexpr(VBAParser.TypeofexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDivOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntDivOp(VBAParser.IntDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDivOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntDivOp(VBAParser.IntDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalImpOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalImpOp(VBAParser.LogicalImpOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalImpOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalImpOp(VBAParser.LogicalImpOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatOp(VBAParser.ConcatOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatOp(VBAParser.ConcatOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code markedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMarkedFileNumberExpr(VBAParser.MarkedFileNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code markedFileNumberExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMarkedFileNumberExpr(VBAParser.MarkedFileNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModOp(VBAParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModOp(VBAParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLExpr(VBAParser.LExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLExpr(VBAParser.LExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(VBAParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(VBAParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalXorOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalXorOp(VBAParser.LogicalXorOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalXorOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalXorOp(VBAParser.LogicalXorOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndOp(VBAParser.LogicalAndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndOp(VBAParser.LogicalAndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrOp(VBAParser.LogicalOrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrOp(VBAParser.LogicalOrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(VBAParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(VBAParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalEqvOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEqvOp(VBAParser.LogicalEqvOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalEqvOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEqvOp(VBAParser.LogicalEqvOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(VBAParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(VBAParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(VBAParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(VBAParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtInTypeExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInTypeExpr(VBAParser.BuiltInTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtInTypeExpr}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInTypeExpr(VBAParser.BuiltInTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNotOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotOp(VBAParser.LogicalNotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNotOp}
	 * labeled alternative in {@link VBAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotOp(VBAParser.LogicalNotOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(VBAParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(VBAParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#literalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLiteralIdentifier(VBAParser.LiteralIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#literalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLiteralIdentifier(VBAParser.LiteralIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#booleanLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralIdentifier(VBAParser.BooleanLiteralIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#booleanLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralIdentifier(VBAParser.BooleanLiteralIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#objectLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralIdentifier(VBAParser.ObjectLiteralIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#objectLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralIdentifier(VBAParser.ObjectLiteralIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#variantLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariantLiteralIdentifier(VBAParser.VariantLiteralIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#variantLiteralIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariantLiteralIdentifier(VBAParser.VariantLiteralIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(VBAParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(VBAParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withMemberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithMemberAccessExpr(VBAParser.WithMemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withMemberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithMemberAccessExpr(VBAParser.WithMemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withDictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterWithDictionaryAccessExpr(VBAParser.WithDictionaryAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withDictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitWithDictionaryAccessExpr(VBAParser.WithDictionaryAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterStandardExpr(VBAParser.StandardExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitStandardExpr(VBAParser.StandardExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleNameExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNameExpr(VBAParser.SimpleNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleNameExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNameExpr(VBAParser.SimpleNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(VBAParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(VBAParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExpr(VBAParser.InstanceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExpr(VBAParser.InstanceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAccessExpr(VBAParser.DictionaryAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictionaryAccessExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAccessExpr(VBAParser.DictionaryAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whitespaceIndexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhitespaceIndexExpr(VBAParser.WhitespaceIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whitespaceIndexExpr}
	 * labeled alternative in {@link VBAParser#lExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhitespaceIndexExpr(VBAParser.WhitespaceIndexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(VBAParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(VBAParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(VBAParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(VBAParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#requiredArgument}.
	 * @param ctx the parse tree
	 */
	void enterRequiredArgument(VBAParser.RequiredArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#requiredArgument}.
	 * @param ctx the parse tree
	 */
	void exitRequiredArgument(VBAParser.RequiredArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(VBAParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(VBAParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(VBAParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(VBAParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(VBAParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(VBAParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#missingArgument}.
	 * @param ctx the parse tree
	 */
	void enterMissingArgument(VBAParser.MissingArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#missingArgument}.
	 * @param ctx the parse tree
	 */
	void exitMissingArgument(VBAParser.MissingArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(VBAParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(VBAParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#lowerBoundArgumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterLowerBoundArgumentExpression(VBAParser.LowerBoundArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#lowerBoundArgumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitLowerBoundArgumentExpression(VBAParser.LowerBoundArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#upperBoundArgumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterUpperBoundArgumentExpression(VBAParser.UpperBoundArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#upperBoundArgumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitUpperBoundArgumentExpression(VBAParser.UpperBoundArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#addressOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddressOfExpression(VBAParser.AddressOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#addressOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddressOfExpression(VBAParser.AddressOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(VBAParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(VBAParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#markerKeyword}.
	 * @param ctx the parse tree
	 */
	void enterMarkerKeyword(VBAParser.MarkerKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#markerKeyword}.
	 * @param ctx the parse tree
	 */
	void exitMarkerKeyword(VBAParser.MarkerKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#statementKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStatementKeyword(VBAParser.StatementKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#statementKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStatementKeyword(VBAParser.StatementKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#standardFunctionKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStandardFunctionKeyword(VBAParser.StandardFunctionKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#standardFunctionKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStandardFunctionKeyword(VBAParser.StandardFunctionKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void enterEndOfLine(VBAParser.EndOfLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void exitEndOfLine(VBAParser.EndOfLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfStatement(VBAParser.EndOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfStatement(VBAParser.EndOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#individualNonEOFEndOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterIndividualNonEOFEndOfStatement(VBAParser.IndividualNonEOFEndOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#individualNonEOFEndOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitIndividualNonEOFEndOfStatement(VBAParser.IndividualNonEOFEndOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#commentOrAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterCommentOrAnnotation(VBAParser.CommentOrAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#commentOrAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitCommentOrAnnotation(VBAParser.CommentOrAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#remComment}.
	 * @param ctx the parse tree
	 */
	void enterRemComment(VBAParser.RemCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#remComment}.
	 * @param ctx the parse tree
	 */
	void exitRemComment(VBAParser.RemCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(VBAParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(VBAParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#commentBody}.
	 * @param ctx the parse tree
	 */
	void enterCommentBody(VBAParser.CommentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#commentBody}.
	 * @param ctx the parse tree
	 */
	void exitCommentBody(VBAParser.CommentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(VBAParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(VBAParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(VBAParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(VBAParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(VBAParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(VBAParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#annotationArgList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgList(VBAParser.AnnotationArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#annotationArgList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgList(VBAParser.AnnotationArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#annotationArg}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArg(VBAParser.AnnotationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#annotationArg}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArg(VBAParser.AnnotationArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#mandatoryLineContinuation}.
	 * @param ctx the parse tree
	 */
	void enterMandatoryLineContinuation(VBAParser.MandatoryLineContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#mandatoryLineContinuation}.
	 * @param ctx the parse tree
	 */
	void exitMandatoryLineContinuation(VBAParser.MandatoryLineContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VBAParser#whiteSpace}.
	 * @param ctx the parse tree
	 */
	void enterWhiteSpace(VBAParser.WhiteSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBAParser#whiteSpace}.
	 * @param ctx the parse tree
	 */
	void exitWhiteSpace(VBAParser.WhiteSpaceContext ctx);
}