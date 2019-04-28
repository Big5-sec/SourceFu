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
	 * Enter a parse tree produced by {@link PowershellParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlock(PowershellParser.ScriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlock(PowershellParser.ScriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PowershellParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PowershellParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#scriptParameter}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameter(PowershellParser.ScriptParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#scriptParameter}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameter(PowershellParser.ScriptParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#scriptParameterDefault}.
	 * @param ctx the parse tree
	 */
	void enterScriptParameterDefault(PowershellParser.ScriptParameterDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#scriptParameterDefault}.
	 * @param ctx the parse tree
	 */
	void exitScriptParameterDefault(PowershellParser.ScriptParameterDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(PowershellParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(PowershellParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PowershellParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PowershellParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(PowershellParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(PowershellParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#attributeArguments}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArguments(PowershellParser.AttributeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#attributeArguments}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArguments(PowershellParser.AttributeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#attributeArgument}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgument(PowershellParser.AttributeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#attributeArgument}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgument(PowershellParser.AttributeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(PowershellParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(PowershellParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeName(PowershellParser.ArrayTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeName(PowershellParser.ArrayTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#genericTypeName}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeName(PowershellParser.GenericTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#genericTypeName}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeName(PowershellParser.GenericTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(PowershellParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(PowershellParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#genericTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeArguments(PowershellParser.GenericTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#genericTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeArguments(PowershellParser.GenericTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PowershellParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PowershellParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#namespaceTypeName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceTypeName(PowershellParser.NamespaceTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#namespaceTypeName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceTypeName(PowershellParser.NamespaceTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#assemblyNameSpec}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyNameSpec(PowershellParser.AssemblyNameSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#assemblyNameSpec}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyNameSpec(PowershellParser.AssemblyNameSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#nestedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterNestedTypeName(PowershellParser.NestedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#nestedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitNestedTypeName(PowershellParser.NestedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#namespaceSpec}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceSpec(PowershellParser.NamespaceSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#namespaceSpec}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceSpec(PowershellParser.NamespaceSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#typeNameIDENTIFIER}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameIDENTIFIER(PowershellParser.TypeNameIDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#typeNameIDENTIFIER}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameIDENTIFIER(PowershellParser.TypeNameIDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#scriptBlockBody}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlockBody(PowershellParser.ScriptBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#scriptBlockBody}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlockBody(PowershellParser.ScriptBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(PowershellParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(PowershellParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PowershellParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PowershellParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PowershellParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PowershellParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(PowershellParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(PowershellParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlowControlStatement(PowershellParser.FlowControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#flowControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlowControlStatement(PowershellParser.FlowControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpression(PowershellParser.LabelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpression(PowershellParser.LabelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#keyExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyExpression(PowershellParser.KeyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#keyExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyExpression(PowershellParser.KeyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PowershellParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PowershellParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#elseifClauses}.
	 * @param ctx the parse tree
	 */
	void enterElseifClauses(PowershellParser.ElseifClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#elseifClauses}.
	 * @param ctx the parse tree
	 */
	void exitElseifClauses(PowershellParser.ElseifClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#elseifClause}.
	 * @param ctx the parse tree
	 */
	void enterElseifClause(PowershellParser.ElseifClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#elseifClause}.
	 * @param ctx the parse tree
	 */
	void exitElseifClause(PowershellParser.ElseifClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(PowershellParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(PowershellParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(PowershellParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(PowershellParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchParameters}.
	 * @param ctx the parse tree
	 */
	void enterSwitchParameters(PowershellParser.SwitchParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchParameters}.
	 * @param ctx the parse tree
	 */
	void exitSwitchParameters(PowershellParser.SwitchParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchParameter}.
	 * @param ctx the parse tree
	 */
	void enterSwitchParameter(PowershellParser.SwitchParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchParameter}.
	 * @param ctx the parse tree
	 */
	void exitSwitchParameter(PowershellParser.SwitchParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCondition(PowershellParser.SwitchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCondition(PowershellParser.SwitchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchFilename}.
	 * @param ctx the parse tree
	 */
	void enterSwitchFilename(PowershellParser.SwitchFilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchFilename}.
	 * @param ctx the parse tree
	 */
	void exitSwitchFilename(PowershellParser.SwitchFilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(PowershellParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(PowershellParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchClauses}.
	 * @param ctx the parse tree
	 */
	void enterSwitchClauses(PowershellParser.SwitchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchClauses}.
	 * @param ctx the parse tree
	 */
	void exitSwitchClauses(PowershellParser.SwitchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchClause}.
	 * @param ctx the parse tree
	 */
	void enterSwitchClause(PowershellParser.SwitchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchClause}.
	 * @param ctx the parse tree
	 */
	void exitSwitchClause(PowershellParser.SwitchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#switchClauseCondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchClauseCondition(PowershellParser.SwitchClauseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#switchClauseCondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchClauseCondition(PowershellParser.SwitchClauseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#configurationStatement}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationStatement(PowershellParser.ConfigurationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#configurationStatement}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationStatement(PowershellParser.ConfigurationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#singleNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleNameExpression(PowershellParser.SingleNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#singleNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleNameExpression(PowershellParser.SingleNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(PowershellParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(PowershellParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#foreachParameters}.
	 * @param ctx the parse tree
	 */
	void enterForeachParameters(PowershellParser.ForeachParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#foreachParameters}.
	 * @param ctx the parse tree
	 */
	void exitForeachParameters(PowershellParser.ForeachParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#foreachParameter}.
	 * @param ctx the parse tree
	 */
	void enterForeachParameter(PowershellParser.ForeachParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#foreachParameter}.
	 * @param ctx the parse tree
	 */
	void exitForeachParameter(PowershellParser.ForeachParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#foreachThrottleLimit}.
	 * @param ctx the parse tree
	 */
	void enterForeachThrottleLimit(PowershellParser.ForeachThrottleLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#foreachThrottleLimit}.
	 * @param ctx the parse tree
	 */
	void exitForeachThrottleLimit(PowershellParser.ForeachThrottleLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PowershellParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PowershellParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForInitializer(PowershellParser.ForInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForInitializer(PowershellParser.ForInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(PowershellParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(PowershellParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#forIterator}.
	 * @param ctx the parse tree
	 */
	void enterForIterator(PowershellParser.ForIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#forIterator}.
	 * @param ctx the parse tree
	 */
	void exitForIterator(PowershellParser.ForIteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PowershellParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PowershellParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(PowershellParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(PowershellParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(PowershellParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(PowershellParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(PowershellParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(PowershellParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(PowershellParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(PowershellParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#baseTypeList}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeList(PowershellParser.BaseTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#baseTypeList}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeList(PowershellParser.BaseTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#baseClassList}.
	 * @param ctx the parse tree
	 */
	void enterBaseClassList(PowershellParser.BaseClassListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#baseClassList}.
	 * @param ctx the parse tree
	 */
	void exitBaseClassList(PowershellParser.BaseClassListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#baseClass}.
	 * @param ctx the parse tree
	 */
	void enterBaseClass(PowershellParser.BaseClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#baseClass}.
	 * @param ctx the parse tree
	 */
	void exitBaseClass(PowershellParser.BaseClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#classMemberList}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberList(PowershellParser.ClassMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#classMemberList}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberList(PowershellParser.ClassMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(PowershellParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(PowershellParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#methodMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(PowershellParser.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#methodMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(PowershellParser.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#propertyMember}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMember(PowershellParser.PropertyMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#propertyMember}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMember(PowershellParser.PropertyMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#memberAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterMemberAttributeList(PowershellParser.MemberAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#memberAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitMemberAttributeList(PowershellParser.MemberAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#memberAttribute}.
	 * @param ctx the parse tree
	 */
	void enterMemberAttribute(PowershellParser.MemberAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#memberAttribute}.
	 * @param ctx the parse tree
	 */
	void exitMemberAttribute(PowershellParser.MemberAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnumStatement(PowershellParser.EnumStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#enumStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnumStatement(PowershellParser.EnumStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(PowershellParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(PowershellParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberList(PowershellParser.EnumMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberList(PowershellParser.EnumMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void enterEnumMember(PowershellParser.EnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void exitEnumMember(PowershellParser.EnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#enumMemberName}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberName(PowershellParser.EnumMemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#enumMemberName}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberName(PowershellParser.EnumMemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(PowershellParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(PowershellParser.MethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#baseCtorCall}.
	 * @param ctx the parse tree
	 */
	void enterBaseCtorCall(PowershellParser.BaseCtorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#baseCtorCall}.
	 * @param ctx the parse tree
	 */
	void exitBaseCtorCall(PowershellParser.BaseCtorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(PowershellParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(PowershellParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PowershellParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PowershellParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#functionParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDeclaration(PowershellParser.FunctionParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#functionParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDeclaration(PowershellParser.FunctionParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#trapStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrapStatement(PowershellParser.TrapStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#trapStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrapStatement(PowershellParser.TrapStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(PowershellParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(PowershellParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(PowershellParser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(PowershellParser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(PowershellParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(PowershellParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#catchTypeList}.
	 * @param ctx the parse tree
	 */
	void enterCatchTypeList(PowershellParser.CatchTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#catchTypeList}.
	 * @param ctx the parse tree
	 */
	void exitCatchTypeList(PowershellParser.CatchTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(PowershellParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(PowershellParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(PowershellParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(PowershellParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dataName}.
	 * @param ctx the parse tree
	 */
	void enterDataName(PowershellParser.DataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dataName}.
	 * @param ctx the parse tree
	 */
	void exitDataName(PowershellParser.DataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dataCommandsAllowed}.
	 * @param ctx the parse tree
	 */
	void enterDataCommandsAllowed(PowershellParser.DataCommandsAllowedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dataCommandsAllowed}.
	 * @param ctx the parse tree
	 */
	void exitDataCommandsAllowed(PowershellParser.DataCommandsAllowedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dataCommandsList}.
	 * @param ctx the parse tree
	 */
	void enterDataCommandsList(PowershellParser.DataCommandsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dataCommandsList}.
	 * @param ctx the parse tree
	 */
	void exitDataCommandsList(PowershellParser.DataCommandsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#dataCommand}.
	 * @param ctx the parse tree
	 */
	void enterDataCommand(PowershellParser.DataCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#dataCommand}.
	 * @param ctx the parse tree
	 */
	void exitDataCommand(PowershellParser.DataCommandContext ctx);
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
	 * Enter a parse tree produced by {@link PowershellParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(PowershellParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(PowershellParser.ParenthesizedExpressionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PowershellParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PowershellParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PowershellParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#mergingredirectionoperator}.
	 * @param ctx the parse tree
	 */
	void enterMergingredirectionoperator(PowershellParser.MergingredirectionoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#mergingredirectionoperator}.
	 * @param ctx the parse tree
	 */
	void exitMergingredirectionoperator(PowershellParser.MergingredirectionoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowershellParser#fileredirectionoperator}.
	 * @param ctx the parse tree
	 */
	void enterFileredirectionoperator(PowershellParser.FileredirectionoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowershellParser#fileredirectionoperator}.
	 * @param ctx the parse tree
	 */
	void exitFileredirectionoperator(PowershellParser.FileredirectionoperatorContext ctx);
}