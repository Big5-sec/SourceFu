package sourcefu.VBA.fullinterpreter;
/*
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import sourcefu.VBA.antlr.VBAParser.AttributeStmtContext;
import sourcefu.VBA.antlr.VBAParser.ConstStmtContext;
import sourcefu.VBA.antlr.VBAParser.DeclareStmtContext;
import sourcefu.VBA.antlr.VBAParser.DefDirectiveContext;
import sourcefu.VBA.antlr.VBAParser.EnumerationStmtContext;
import sourcefu.VBA.antlr.VBAParser.EventStmtContext;
import sourcefu.VBA.antlr.VBAParser.ImplementsStmtContext;
import sourcefu.VBA.antlr.VBAParser.ModuleAttributesContext;
import sourcefu.VBA.antlr.VBAParser.ModuleConfigElementContext;
import sourcefu.VBA.antlr.VBAParser.ModuleContext;
import sourcefu.VBA.antlr.VBAParser.ModuleDeclarationsElementContext;
import sourcefu.VBA.antlr.VBAParser.ModuleOptionContext;
import sourcefu.VBA.antlr.VBAParser.StartRuleContext;
import sourcefu.VBA.antlr.VBAParser.UdtDeclarationContext;
import sourcefu.VBA.antlr.VBAParser.VariableStmtContext;

public class Compiler {
	
		
		/*public final NameIndex names = new NameIndex();

		protected VbDecl withObjDecl;

		private final static Map<String, VbVarType> vbTypeCharToVbType = new HashMap<>();

		private final static Map<String, VbVarType> vbTypeNameToType = new HashMap<>();

		static {
			vbTypeCharToVbType.put("%", VbVarType.VbInteger);
			vbTypeCharToVbType.put("&", VbVarType.VbLong);
			vbTypeCharToVbType.put("@", VbVarType.VbCurrency);
			vbTypeCharToVbType.put("!", VbVarType.VbSingle);
			vbTypeCharToVbType.put("#", VbVarType.VbDouble);
			vbTypeCharToVbType.put("$", VbVarType.VbString);

			vbTypeNameToType.put("STRING", VbVarType.VbString);
			vbTypeNameToType.put("INTEGER", VbVarType.VbInteger);
			vbTypeNameToType.put("LONG", VbVarType.VbLong);
			vbTypeNameToType.put("DECIMAL", VbVarType.VbDecimal);
			vbTypeNameToType.put("SINGLE", VbVarType.VbSingle);
			vbTypeNameToType.put("DOUBLE", VbVarType.VbDouble);
			vbTypeNameToType.put("OBJECT", VbVarType.VbObject);
			vbTypeNameToType.put("IUNKNOWN", VbVarType.VbObject);
			vbTypeNameToType.put("CURRENCY", VbVarType.VbCurrency);
			vbTypeNameToType.put("DATE", VbVarType.VbDate);
			vbTypeNameToType.put("BOOLEAN", VbVarType.VbBoolean);
			vbTypeNameToType.put("BYTE", VbVarType.VbByte);
			vbTypeNameToType.put("VARIANT", VbVarType.VbVariant);
		}
		*
	
		StartRuleContext ast;
		
		public Compiler(ParseTree ast) {
			this.ast = (StartRuleContext) ast;
		}

		public void compile() {
			ModuleContext moduleAst = this.ast.module();
			
		}

		/*
			// implements
			for (ModuleDecl moduleDecl : result.modules.values()) {
				ModuleContext moduleAst = (ModuleContext) moduleTrees.get(moduleDecl.getSrcFile().getAbsolutePath());
				assert moduleAst != null;
				List<ImplementsStmtContext> impls = new ArrayList<>();
				if(moduleAst.moduleDeclarations() != null){
					for (ModuleDeclarationsElementContext decl : moduleAst.moduleDeclarations().moduleDeclarationsElement()) {
						ImplementsStmtContext impl = decl.implementsStmt();
						if (impl != null) {
							impls.add(impl);
						}
					}
				}
				if (impls.size() > 0) {
					compileClassModuleImplements(moduleDecl, impls);
				}
			}
			/*
			// procedures: function, sub, property, rule ...
			for (ModuleDecl moduleDecl : result.modules.values()) {
				ParseTree moduleAst = moduleTrees.get(moduleDecl.getSrcFile().getAbsolutePath());
				compileModuleBodyBaseInfo(moduleDecl, (ModuleContext) moduleAst, result);
			}
			
			// implements
			for(ModuleDecl moduleDecl : result.modules.values()){
				if(moduleDecl instanceof ClassModuleDecl){
					ModuleContext moduleAst = (ModuleContext) moduleTrees.get(moduleDecl.getSrcFile().getAbsolutePath());
					List<ImplementsStmtContext> impls = new ArrayList<>();
					if(moduleAst.moduleDeclarations() != null){
						for (ModuleDeclarationsElementContext decl : moduleAst.moduleDeclarations().moduleDeclarationsElement()) {
							ImplementsStmtContext impl = decl.implementsStmt();
							if (impl != null) {
								impls.add(impl);
							}
						}
					}
					((ClassModuleDecl) moduleDecl).buildImplements(impls);
				}
			}

			// form to same name variable
			for (ModuleDecl moduleDecl : result.modules.values()) {
				if(moduleDecl instanceof FormModuleDecl) {
					FormModuleDecl fmdcl = (FormModuleDecl) moduleDecl;
					fmdcl.initVarDecls();
				}
			}
			
			// procedure body
			for (ModuleDecl moduleDecl : result.modules.values()) {
				for (VbDecl member : moduleDecl.members.values()) {
					if (member instanceof RuleDecl) {
						compileRuleBody((RuleDecl) member);
					} else if (member instanceof MethodDecl) {
						MethodDecl method = (MethodDecl) member;
						compileMethodBody(method);
					} else if (member instanceof PropertyDecl) {
						for (MethodDecl m : ((PropertyDecl) member).getMembers()) {
							if (m != null) {
								compileMethodBody(m);
							}
						}
					}
				}
			}

			this.libs.add(result);

			return result;
		}

		private void compileClassModuleImplements(ModuleDecl moduleDecl, List<ImplementsStmtContext> impls) {
			if (moduleDecl instanceof ClassModuleDecl == false) {
				moduleDecl.addCompileException(impls.get(0), CompileException.SYNTAX_ERROR, "is not class module");
				return;
			}

			for (ImplementsStmtContext impl : impls) {
				ClassModuleDecl cls = (ClassModuleDecl) moduleDecl;
				String name = impl.ambiguousIdentifier().getText().toUpperCase();
				ClassTypeDecl decl;
				try {
					decl = this.findClassTypeDecl(name, impl, moduleDecl);
					if(decl == null){
						moduleDecl.addCompileException(impl, CompileException.SYNTAX_ERROR, "cannot implement");
					} if (cls.implementClasses.contains(decl)) {
						moduleDecl.addCompileException(impl, CompileException.SYNTAX_ERROR, "already implements it");
					} else if (decl.classModule.isImplementFrom(cls)) {
						moduleDecl.addCompileException(impl, CompileException.SYNTAX_ERROR, "recursive implementation");
					} else {
						cls.implementClasses.add(decl);
					}
				} catch (CompileException e) {
					moduleDecl.addCompileException(e);
				}
			}
		}*

		public ModuleDecl compileBasicInfo(ModuleContext moduleAst) {
			/*
			module :
    			endOfStatement?
    			moduleAttributes
    			moduleHeader?
    			moduleAttributes
    			moduleConfigReferences?
    			moduleConfig?
    			moduleAttributes
    			moduleDeclarations
    			moduleAttributes
    			moduleBody
    			moduleAttributes
    			// A module can consist of WS as well as line continuations only.
    			whiteSpace?
			;
			 *

			ModuleDecl modDecl = new ModuleDecl();
			for (ModuleAttributesContext moduleAttribute : moduleAst.moduleAttributes()) {
				modDecl.attributes.putAll(parseAttributes(moduleAttribute));
			}


			if (moduleAst.moduleConfig() != null) {
				for (ModuleConfigElementContext config : moduleAst.moduleConfig().moduleConfigElement()) {
					//TODO implem
					//if(config instanceof SimplePropertyContext) {
					//	setModuleConfig(moduleDecl, (SimplePropertyContext) config);
					//}
				}
			}
			
			if (moduleAst.moduleDeclarations() != null) {
				/*
				 * moduleDeclarationsElement :
                         whiteSpace?
    					(attributeStmt
    					| declareStmt
    					| defDirective
    					| enumerationStmt 
    					| eventStmt
    					| constStmt
    					| implementsStmt
    					| variableStmt
    					| moduleOption
    					| udtDeclaration)
				 *
				for (ModuleDeclarationsElementContext decl : moduleAst.moduleDeclarations().moduleDeclarationsElement()) {
					ParserRuleContext declStmt;
					if (decl.children.size() > 1) {
						declStmt = (ParserRuleContext) decl.children.get(1);
					} else {
						declStmt = (ParserRuleContext) decl.children.get(0);	
					}
					
					if (declStmt instanceof AttributeStmtContext) {
						//compile attribute
					} else if (declStmt instanceof DeclareStmtContext) {
						//blah
					} else if (declStmt instanceof DefDirectiveContext) {
						//blih
					} else if (declStmt instanceof EnumerationStmtContext) {
						compileEnumDecl((EnumerationStmtContext) declStmt, moduleDecl);
					} else if (declStmt instanceof EventStmtContext) {
						EventDecl eventDecl = compileEventDecl((EventStmtContext) declStmt, moduleDecl);
						if(eventDecl != null) {
							ClassModuleDecl classModuleDecl = (ClassModuleDecl) moduleDecl;
							classModuleDecl.addEvent((EventStmtContext) declStmt, eventDecl); // 事件并不是对象成员，事件可以和其它成员重名
						}
					} else if (declStmt instanceof ConstStmtContext) {
						ConstStmtContext constStmt = (ConstStmtContext) declStmt;
						compileConstDecl(constStmt, moduleDecl, null);
					} else if (declStmt instanceof ImplementsStmtContext) {
						//bloh
					} else if (declStmt instanceof VariableStmtContext) {
						//bluh	setModuleOption(moduleDecl, declStmt);
					} else if (declStmt instanceof ModuleOptionContext) {
						setModuleOption(moduleDecl, declStmt);
					} else if (declStmt instanceof UdtDeclarationContext) {
						compileUdtDecl((UdtDeclarationContext) declStmt, moduleDecl);
					} 
				}
			}
			return modDecl;
		}

		private Map<String, Object> parseAttributes(ModuleAttributesContext moduleAttributes) {
			Map<String, Object> result = new HashMap<>();
			for (AttributeStmtContext attr : moduleAttributes.attributeStmt()) {
				String name = attr.attributeName().getText();
				Object val = null;
				//val = parseLiteral(attr.literal(0), module).value;
				val = (String) attr.attributeValue(0).getText();
				result.put(name.toUpperCase(), val);
			}
			return result;
		}
//
//		/*
//		private ControlDef parseControlDecl(ControlDeclarationContext controlDeclAst, ModuleDecl moduleDecl) throws CompileException {
//			ControlDef result = new ControlDef();
//			result.setType(this.parseType(controlDeclAst.type(), null, moduleDecl));
//			result.setName(controlDeclAst.ambiguousIdentifier().getText());
//				
//			this.passControlDefAttrs(result, controlDeclAst.moduleConfigElement(), moduleDecl);
//			for(ControlDeclarationContext child : controlDeclAst.controlDeclaration()) {
//				result.getChildren().add(parseControlDecl(child, moduleDecl));
//			}
//			return result;
//		}
//
//		private void passControlDefAttrs(ControlDef result, List<ModuleConfigElementContext> moduleConfigElements, ModuleDecl moduleDecl) {
//			for (ModuleConfigElementContext config : moduleConfigElements) {
//				if(config instanceof SimplePropertyContext) {
//					SimplePropertyContext simple = (SimplePropertyContext)config;
//					String id = simple.ambiguousIdentifier().getText();
//					VbValue val;
//					try {
//						val = parseLiteral(simple.literal(), moduleDecl);
//						result.getAttributes().put(id, val);
//					} catch (CompileException e) {
//						moduleDecl.addCompileException(e);
//					}
//				} else {
//					ComplexPropertyContext complex = (ComplexPropertyContext) config;
//					String id = complex.moduleBagProperty().ambiguousIdentifier().getText();
//					ControlDef val = new ControlDef();
//					val.setName(id);
//					result.getComplexAttributes().put(id, val);
//					passControlDefAttrs(val, complex.moduleBagProperty().moduleConfigElement(), moduleDecl);
//				}
//			}
//		}
//
//
//		/**
//		 * 编译全局变量和方法。
//		 * 
//		 * @param moduleAst
//		 *
//		private void compileModuleDeclarations(ModuleDecl moduleDecl, ModuleContext moduleAst, Library library) {
//			if (moduleAst.moduleDeclarations() != null) {
//				/*
//				 * moduleDeclarationsElement :
//					comment
//					| declareStmt  		*
//					| enumerationStmt   *
//					| eventStmt			*
//					| constStmt			*
//					| implementsStmt 	*
//					| variableStmt		*
//					| moduleOption		*
//					| typeStmt			*
//				 */
//				for (ModuleDeclarationsElementContext decl : moduleAst.moduleDeclarations().moduleDeclarationsElement()) {
//					ParserRuleContext declStmt = (ParserRuleContext) decl.children.get(0);
//					if (declStmt instanceof VariableStmtContext) {
//						VariableStmtContext variableStmt = (VariableStmtContext) declStmt;
//						compileVarDecl(variableStmt, moduleDecl, null);
//					}
//				}
//			}
//		}
//
//		void compileModuleBodyBaseInfo(ModuleDecl moduleDecl, ModuleContext moduleAst, Library library) {
//			if (moduleAst.moduleBody() != null) {
//				/*
//				moduleBody : 
//					moduleBodyElement (endOfLine+ moduleBodyElement)* endOfLine*;
//				
//				moduleBodyElement : 
//					functionStmt 		*
//					| propertyGetStmt 	*
//					| propertySetStmt 	*
//					| propertyLetStmt 	*
//					| subStmt 			*
//				;
//				*/
//				for (ModuleBodyElementContext bodyEle : moduleAst.moduleBody().moduleBodyElement()) {
//					ParserRuleContext ele = (ParserRuleContext) bodyEle.getChild(0);
//					if (ele instanceof DeclareStmtContext) { // TODO delcare function lib ...
//						moduleDecl.addCompileException(ele, CompileException.UNSUPPORT_FEATURE, "declare function");
//					} else if (ele instanceof SubStmtContext) {
//						MethodDecl sub = compileMethodBaseInfo((SubStmtContext) ele, moduleDecl);
//						if (moduleDecl.addMember(sub)) {
//							this.names.addDecl(sub);
//						}
//					} else if (ele instanceof FunctionStmtContext) {
//						MethodDecl fun = compileMethodBaseInfo((FunctionStmtContext) ele, moduleDecl);
//						if (moduleDecl.addMember(fun)) {
//							this.names.addDecl(fun);
//						}
//					} else if (ele instanceof RuleStmtContext) {
//						compileRuleBaseInfo((RuleStmtContext) ele, moduleDecl);
//					} else if (ele instanceof PropertyGetStmtContext) {
//						MethodDecl propGet = compilePropertyGetBaseInfo((PropertyGetStmtContext) ele, moduleDecl);
//						if (moduleDecl.addMember(propGet)) {
//							this.names.addDecl(propGet);
//						}
//					} else if (ele instanceof PropertyLetStmtContext) {
//						MethodDecl propLet = compilePropertyLetBaseInfo((PropertyLetStmtContext) ele, moduleDecl);
//						if (moduleDecl.addMember(propLet)) {
//							this.names.addDecl(propLet);
//						}
//					} else if (ele instanceof PropertySetStmtContext) {
//						MethodDecl propSet = compilePropertySetBaseInfo((PropertySetStmtContext) ele, moduleDecl);
//						if (moduleDecl.addMember(propSet)) {
//							this.names.addDecl(propSet);
//						}
//					}
//				}
//			}
//		}
//
//		private void compileUdtDecl(TypeStmtContext decl, ModuleDecl module) {
//			/*
//				typeStmt : 
//					(visibility WS)? TYPE WS ambiguousIdentifier endOfStatement
//					typeStmt_Element*
//					END_TYPE
//				;
//				
//				typeStmt_Element : ambiguousIdentifier (WS? LPAREN (WS? subscripts)? WS? RPAREN)? (WS asTypeClause)? endOfStatement;
//			 *
//			UdtDecl result = new UdtDecl(module.getLibrary());
//			result.visibility = parseVisibility(decl.visibility(), Visibility.PRIVATE);
//			result.name = decl.ambiguousIdentifier().getText();
//			for (TypeStmt_ElementContext te : decl.typeStmt_Element()) {
//				VarDecl var = new VarDecl(module.getLibrary(), module);
//				var.name = te.ambiguousIdentifier().getText();
//				ArrayDef.Rank[] ranks = null;
//				try {
//					ranks = parseArrayRanks(module, null, te.constSubscripts());
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//				VbVarType vbVarType = VbVarType.VbVariant;
//				// if (te.typeHint() != null) { // 类型块内的语句无效
//				// vbVarType = parseTypeHint(stmt.typeHint());
//				// }
//				try {
//					vbVarType = parseType(te.asTypeClause(), null, module);
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//				if (ranks != null) {
//					vbVarType = vbVarType.toArrayType(ranks);
//				}
//
//				var.varType = vbVarType;
//				var.ast = te;
//
//				result.addMember(var);
//			}
//			addType(module.getLibrary(), result);
//		}
//
//		private String fileNameToModuleName(String baseName) {
//			return baseName.replaceAll("-|\\s|\\.", "_");
//		}
//
//		private void setModuleOption(ModuleDecl moduleDecl, ParserRuleContext declStmt) {
//			ModuleOptionContext option = (ModuleOptionContext) declStmt;
//			Token start = option.start;
//			switch (start.getType()) {
//			case VbaLexer.OPTION_EXPLICIT:
//				moduleDecl.setExplicit(true);
//				break;
//			case VbaLexer.OPTION_BASE:
//				OptionBaseStmtContext optionBase = (OptionBaseStmtContext) option;
//				moduleDecl.setArrayBase(Integer.parseInt(optionBase.SHORTLITERAL().getText()));
//			case VbaLexer.OPTION_COMPARE:
//				if (option.getToken(VbaLexer.TEXT, 0) != null) {
//					moduleDecl.setCompareMode(ModuleDecl.CompareMode.Text);
//				}
//				break;
//			case VbaLexer.OPTION_PRIVATE_MODULE:
//				moduleDecl.setPrivateModule(true);
//				break;
//			}
//		}
//
//		private void setModuleConfig(ModuleDecl moduleDecl, SimplePropertyContext config) {
//			String id = config.ambiguousIdentifier().getText();
//			Object val;
//			try {
//				val = parseLiteral(config.literal(), moduleDecl).value;
//				moduleDecl.config.put(id, val);
//			} catch (CompileException e) {
//				moduleDecl.addCompileException(e);
//			}
//		}
//
//		private Map<String, Object> parseAttributes(ModuleAttributesContext moduleAttributes, ModuleDecl module) {
//			/*
//			 * attributeStmt : ATTRIBUTE WS implicitCallStmt_InStmt WS? EQ WS? literal (WS? ',' WS? literal)*;
//			 *
//			Map<String, Object> result = new HashMap<>();
//			for (AttributeStmtContext attr : moduleAttributes.attributeStmt()) {
//				String name = attr.implicitCallStmt_InStmt().getText();
//				Object val = null;
//				try { // TODO why multi literal in the g4 spec
//					val = parseLiteral(attr.literal(0), module).value;
//					result.put(name.toUpperCase(), val);
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//			}
//			return result;
//		}
//
//		public EventDecl compileEventDecl(EventStmtContext eventStmt, ModuleDecl module) {
//			/*
//			 * 	eventStmt : (visibility WS)? EVENT WS ambiguousIdentifier WS? argList;
//			 */
//			if (module instanceof ClassModuleDecl == false) {
//				module.addCompileException(eventStmt, CompileException.MUST_IN_CLASSMODULE, eventStmt);
//				// TODO raise error and module add CompileException to it's list self
//				return null;
//			}
//
//			EventDecl eventDecl = new EventDecl(module.getLibrary(), module);
//			eventDecl.name = eventStmt.ambiguousIdentifier().getText();
//			eventDecl.visibility = parseVisibility(eventStmt.visibility(), Visibility.PUBLIC);
//
//			List<ArgContext> argList = eventStmt.argList().arg();
//			List<ArgumentDecl> args = new ArrayList<>();
//			if (argList == null || argList.isEmpty()) {
//			} else {
//				for (ArgContext arg : argList) {
//					if (arg.OPTIONAL() != null || arg.argDefaultValue() != null) {
//						module.addCompileException(arg.OPTIONAL(), CompileException.SYNTAX_ERROR, " can not be Optional");
//						continue;
//					}
//					if (arg.PARAMARRAY() != null) {
//						module.addCompileException(arg.OPTIONAL(), CompileException.SYNTAX_ERROR, " can not be ParamArray");
//						continue;
//					}
//					ArgumentDecl argument = parseArg(arg, module, null);
//					args.add(argument);
//				}
//			}
//
//			// TODO check arguments
//			// 可以象声明过程的参数一样来声明事件的参数，但有以下不同：事件不能有带命名参数、Optional 参数、或者 ParamArray 参数。事件没有返回值。
//			eventDecl.arguments = args;
//
//			return eventDecl;
//		}
//
//		/*
//		subStmt : 
//		(visibility WS)? (STATIC WS)? SUB WS ambiguousIdentifier (WS? argList)? NEWLINE+ 
//		(block NEWLINE+)? 
//		END_SUB
//		 */
//		public MethodDecl compileMethodBaseInfo(SubStmtContext sub, ModuleDecl module) {
//			MethodDecl method = new MethodDecl(module.getLibrary(), module, MethodType.Sub);
//			String name = sub.ambiguousIdentifier().getText();
//			compileMethodBaseInfo(name, parseVisibility(sub.visibility(), Visibility.PUBLIC), sub.STATIC() != null, sub.argList(),
//					module, method);
//			method.ast = sub;
//			return method;
//		}
//
//		public MethodDecl compileMethodBaseInfo(FunctionStmtContext func, ModuleDecl module) {
//			MethodDecl method = new MethodDecl(module.getLibrary(), module, MethodType.Function);
//
//			VbVarType vbVarType = VbVarType.VbVariant;
//			try {
//				vbVarType = parseType(func.asTypeClause(), func.typeHint(), module);
//			} catch (CompileException e) {
//				module.addCompileException(e);
//			}
//			if (vbVarType instanceof VbFixedStringType) {
//				module.addCompileException(func.asTypeClause(), CompileException.CANNOT_BE_FIXED_LENGTH_STRING,
//						func.asTypeClause().getText());
//			}
//			method.returnType = vbVarType;
//
//			String name = func.ambiguousIdentifier().getText();
//			VarDecl resultDecl = new VarDecl(module.getLibrary(), module);
//			resultDecl.name = name;
//			resultDecl.varType = method.returnType;
//			resultDecl.methodDecl = method;
//			method.result = resultDecl;
//
//			method.variables.put(name.toUpperCase(), resultDecl);
//
//			compileMethodBaseInfo(name, parseVisibility(func.visibility(), Visibility.PUBLIC), func.STATIC() != null,
//					func.argList(), module, method);
//
//			method.ast = func;
//
//			return method;
//		}
//
//		private void compileRuleBaseInfo(RuleStmtContext ruleStmt, ModuleDecl module) {
//			String name = ruleStmt.ambiguousIdentifier().get(0).getText();
//
//			RuleDecl rule = null;
//			if (module.members.containsKey(name.toUpperCase())) {
//				VbDecl decl = module.members.get(name.toUpperCase());
//				if (decl instanceof RuleDecl) {
//					rule = (RuleDecl) decl;
//				} else {
//					AmbiguousIdentifierContext id = ruleStmt.ambiguousIdentifier(0);
//					module.addCompileException(id, CompileException.AMBIGUOUS_IDENTIFIER, name);
//					return;
//				}
//			} else {
//				rule = new RuleDecl(module.getLibrary(), module);
//
//				VbVarType varType = VbVarType.VbVariant;
//				try {
//					varType = parseType(ruleStmt.asTypeClause(), ruleStmt.typeHint(), module);
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//				if (varType instanceof VbFixedStringType) {
//					module.addCompileException(ruleStmt.asTypeClause(), CompileException.CANNOT_BE_FIXED_LENGTH_STRING,
//							ruleStmt.asTypeClause().getText());
//				}
//				rule.returnType = varType;
//
//				VarDecl resultDecl = new VarDecl(module.getLibrary(), module);
//				resultDecl.name = name;
//				resultDecl.varType = rule.returnType;
//				resultDecl.methodDecl = rule;
//				rule.result = resultDecl;
//
//				compileMethodBaseInfo(name, parseVisibility(ruleStmt.visibility(), Visibility.PUBLIC), ruleStmt.STATIC() != null,
//						ruleStmt.argList(), module, rule);
//
//				module.addMember(rule);
//				names.addDecl(rule);
//			}
//
//			MethodDecl func = new MethodDecl(module.getLibrary(), module, MethodType.Function);
//			func.ast = ruleStmt;
//			func.name = rule.name;
//			func.arguments = rule.arguments;
//			func.isStatic = rule.isStatic;
//			func.visibility = rule.visibility;
//			func.returnType = rule.returnType;
//			func.result = rule.result;
//			func.variables.put(name.toUpperCase(), rule.result);
//			rule.methods.add(func);
//			rule.entranceAstes.add(ruleStmt.valueStmt());
//
//			for (ArgumentDecl arg : func.arguments) {
//				String u = arg.name.toUpperCase();
//				if (func.variables.containsKey(u)) {
//					func.module.addCompileException(arg.ast, CompileException.AMBIGUOUS_IDENTIFIER, arg.ast.getText());
//				} else {
//					func.variables.put(u, arg);
//				}
//			}
//
//			if (ruleStmt.ALIAS() != null) {
//				func.name = ruleStmt.ambiguousIdentifier(1).getText();
//				if (!func.name.equalsIgnoreCase(name)) {
//					if (!module.addMember(func)) {
//						this.names.addDecl(func);
//					}
//				}
//			}
//		}
//
//		public MethodDecl compilePropertyGetBaseInfo(PropertyGetStmtContext propGet, ModuleDecl module) {
//			MethodDecl method = new MethodDecl(module.getLibrary(), module, MethodType.PropertyGet);
//
//			VbVarType vbVarType = VbVarType.VbVariant;
//			try {
//				vbVarType = parseType(propGet.asTypeClause(), propGet.typeHint(), module);
//			} catch (CompileException e) {
//				module.addCompileException(e);
//			}
//			if (vbVarType instanceof VbFixedStringType) {
//				module.addCompileException(propGet.asTypeClause(), CompileException.CANNOT_BE_FIXED_LENGTH_STRING,
//						propGet.asTypeClause().getText());
//			}
//			method.returnType = vbVarType;
//
//			String name = propGet.ambiguousIdentifier().getText();
//			VarDecl resultDecl = new VarDecl(module.getLibrary(), module);
//			resultDecl.name = name;
//			resultDecl.varType = method.returnType;
//			resultDecl.methodDecl = method;
//			method.result = resultDecl;
//
//			method.variables.put(name.toUpperCase(), resultDecl);
//
//			compileMethodBaseInfo(name, parseVisibility(propGet.visibility(), Visibility.PUBLIC), propGet.STATIC() != null,
//					propGet.argList(), module, method);
//
//			method.ast = propGet;
//
//			return method;
//		}
//
//		public MethodDecl compilePropertyLetBaseInfo(PropertyLetStmtContext sub, ModuleDecl module) {
//			MethodDecl method = new MethodDecl(module.getLibrary(), module, MethodType.PropertyLet);
//			String name = sub.ambiguousIdentifier().getText();
//			compileMethodBaseInfo(name, parseVisibility(sub.visibility(), Visibility.PUBLIC), sub.STATIC() != null, sub.argList(),
//					module, method);
//			method.ast = sub;
//			return method;
//		}
//
//		public MethodDecl compilePropertySetBaseInfo(PropertySetStmtContext sub, ModuleDecl module) {
//			MethodDecl method = new MethodDecl(module.getLibrary(), module, MethodType.PropertySet);
//			String name = sub.ambiguousIdentifier().getText();
//			compileMethodBaseInfo(name, parseVisibility(sub.visibility(), Visibility.PUBLIC), sub.STATIC() != null, sub.argList(),
//					module, method);
//			method.ast = sub;
//			return method;
//		}
//
//		private void compileMethodBaseInfo(String name, Visibility visibility, boolean isStatic, ArgListContext argList,
//				ModuleDecl module, MethodDecl method) {
//			method.module = module;
//
//			method.visibility = visibility;
//
//			method.isStatic = isStatic;
//			method.name = name;
//
//			method.arguments = parseArgs(argList, method);
//			for (ArgumentDecl arg : method.arguments) {
//				String u = arg.name.toUpperCase();
//				if (method.variables.containsKey(u)) {
//					method.module.addCompileException(arg.ast, CompileException.AMBIGUOUS_IDENTIFIER, arg.ast.getText());
//				} else {
//					method.variables.put(u, arg);
//				}
//			}
//		}
//
//		private void addErrObjectDecl(MethodDecl method) {
////			VbVarType varType = vba.getErrorVarType();
////			VarDecl varDecl = new VarDecl(method.library, method.module);
////			varDecl.module = method.module;
////			varDecl.methodDecl = method;
////			varDecl.varType = varType;
////			varDecl.name = "Err";
////			method.addVariable(varDecl);
//		}
//
//		private List<ArgumentDecl> parseArgs(ArgListContext argList, MethodDecl method) {
//			List<ArgumentDecl> result = new ArrayList<>();
//			if (argList == null || argList.isEmpty())
//				return result;
//
//			// (OPTIONAL WS)? ((BYVAL | BYREF) WS)? (PARAMARRAY WS)? ambiguousIdentifier (WS? LPAREN WS? RPAREN)? (WS
//			// asTypeClause)? (WS? argDefaultValue)?;
//			boolean optional = false, paramArray = false;
//			for (ArgContext arg : argList.arg()) {
//				ArgumentDecl argument = parseArg(arg, method.module, method);
//				argument.methodDecl = method;
//				result.add(argument);
//
//				if (optional && argument.optional == false) {
//					method.module.addCompileException(arg, CompileException.SYNTAX_ERROR,
//							" after optional argument must be optional too");
//				}
//
//				if (optional == false && argument.optional) {
//					if (paramArray) {
//						method.module.addCompileException(arg.PARAMARRAY(), CompileException.SYNTAX_ERROR,
//								"ParamArray cannot stay with optional");
//					} else {
//						optional = true;
//					}
//				}
//				if (paramArray == false && argument.isParamArray) {
//					if (optional) {
//						method.module.addCompileException(arg.OPTIONAL(), CompileException.SYNTAX_ERROR,
//								"Optional cannot stay with optional");
//					} else {
//						paramArray = true;
//					}
//				}
//			}
//
//			return result;
//		}
//
//		ArgumentDecl parseArg(ArgContext arg, ModuleDecl module, MethodDecl method) {
//			ArgumentDecl argument = new ArgumentDecl();
//			argument.module = module;
//			argument.mode = ArgumentMode.ByRef; // 表示该参数按地址传递。ByRef 是 Visual Basic 的缺省选项。
//			if (arg.OPTIONAL() != null) {
//				argument.optional = true;
//				if (arg.argDefaultValue() != null) {
//					try {
//						argument.defaultValue = parseConstValueExpr(arg.argDefaultValue().constValueExpr(), module, method);
//					} catch (CompileException e) {
//						module.addCompileException(e);
//					}
//				}
//			} else if (arg.argDefaultValue() != null) { // TODO no optional but default value throw error
//				module.addCompileException(arg.argDefaultValue(), CompileException.SHOULD_BE, " optional argument");
//			}
//
//			if (arg.BYREF() != null) {
//				argument.mode = ArgumentMode.ByRef;
//			}
//			if (arg.PARAMARRAY() != null) {
//				argument.isParamArray = true;
//				if (arg.BYREF() != null) {
//					module.addCompileException(arg.BYREF(), CompileException.SYNTAX_ERROR, " ParamArray cannot ByRef");
//				}
//			}
//			argument.name = arg.ambiguousIdentifier().getText();
//
//			VbVarType vbVarType = VbVarType.VbVariant;
//			try {
//				vbVarType = parseType(arg.asTypeClause(), arg.typeHint(), module);
//			} catch (CompileException e) {
//				module.addCompileException(e);
//			}
//			boolean isArray = (arg.LPAREN() != null);
//			if (isArray) {
//				vbVarType = vbVarType.toArrayType(null);
//			}
//			argument.varType = vbVarType;
//			if (vbVarType instanceof VbFixedStringType) {
//				module.addCompileException(arg.asTypeClause(), CompileException.CANNOT_BE_FIXED_LENGTH_STRING,
//						arg.asTypeClause().getText());
//			}
//			if (argument.optional && argument.defaultValue == null) {
//				if (vbVarType.vbType == VbVarType.vbVariant) {
//					argument.defaultValue = VbValue.Missing;
//				} else {
//					argument.defaultValue = argument.varType.crateDefaultValue();
//				}
//			}
//			return argument;
//		}
//
//		void compileConstDecl(ConstStmtContext variableStmt, ModuleDecl moduleDecl, MethodDecl methodDecl) {
//			/*
//			 	constStmt : (visibility WS)? CONST WS constSubStmt (WS? ',' WS? constSubStmt)*;
//			
//				constSubStmt : ambiguousIdentifier typeHint? (WS asTypeClause)? WS? EQ WS? valueStmt;
//			 */
//			Visibility visibility = parseVisibility(variableStmt.visibility(), Visibility.PRIVATE);
//			for (ConstSubStmtContext stmt : variableStmt.constSubStmt()) {
//				VbValue val;
//				try {
//					val = parseConstValueExpr(stmt.constValueExpr(), moduleDecl, methodDecl);
//
//					VbVarType vbVarType = VbVarType.VbVariant;
//					try {
//						vbVarType = parseType(stmt.asTypeClause(), stmt.typeHint(), moduleDecl);
//					} catch (CompileException e) {
//						moduleDecl.addCompileException(e);
//					}
//					// 可以是 Byte、布尔、Integer、Long、Currency、Single、Double、Decimal（目前尚不支持）、Date、String 或
//					// Variant。所声明的每个变量都要使用一个单独的 As 类型子句。
//					if (ArrayUtils
//							.indexOf(new int[] { VbVarType.vbByte, VbVarType.vbBoolean, VbVarType.vbInteger, VbVarType.vbLong,
//									VbVarType.vbCurrency, VbVarType.vbSingle, VbVarType.vbDouble, VbVarType.vbDecimal,
//									VbVarType.vbDate, VbVarType.vbString, VbVarType.vbVariant }, vbVarType.vbType) == -1
//							|| vbVarType.typeDecl != null) {
//
//						moduleDecl.addCompileException(stmt.asTypeClause(), CompileException.SYNTAX_ERROR, "invalid const type",
//								stmt.asTypeClause().getText());
//					}
//
//					ConstDecl decl;
//					try {
//						decl = new ConstDecl(methodDecl == null ? moduleDecl.getLibrary() : null, moduleDecl,
//								VbValue.cast(val, vbVarType.vbType));
//						decl.visibility = visibility;
//						decl.name = stmt.ambiguousIdentifier().getText();
//
//						decl.varType = vbVarType;
//						decl.ast = stmt;
//						decl.methodDecl = methodDecl;
//
//						addDecl(moduleDecl, methodDecl, decl);
//					} catch (OverflowException e) {
//						moduleDecl.addCompileException(stmt.constValueExpr(), CompileException.OVERFLOW, stmt.constValueExpr());
//					}
//				} catch (CompileException e) {
//					moduleDecl.addCompileException(e);
//				}
//			}
//		}
//
//		private void compileEnumDecl(EnumerationStmtContext enumerationStmt, ModuleDecl moduleDecl) {
//			/*
//				enumerationStmt: 
//					(visibility WS)? ENUM WS ambiguousIdentifier endOfStatement 
//					enumerationStmt_Constant* 
//					END_ENUM
//				;
//				
//				enumerationStmt_Constant : ambiguousIdentifier (WS? EQ WS? constValueExpr)? endOfStatement;
//			
//			 */
//			EnumDecl enumDecl = new EnumDecl(moduleDecl.getLibrary());
//			// enumDecl.module = moduleDecl;
//			enumDecl.name = enumerationStmt.ambiguousIdentifier().getText();
//			enumDecl.visibility = parseVisibility(enumerationStmt.visibility(), Visibility.PUBLIC);
//
//			Integer start = 0;
//			for (EnumerationStmt_ConstantContext enumConstCtxt : enumerationStmt.enumerationStmt_Constant()) {
//				try {
//					VbValue v = null;
//					if(enumConstCtxt.constValueExpr() != null) {
//						v = parseConstValueExpr(enumConstCtxt.constValueExpr(), moduleDecl, null);
//						start = ((Number)v.toJava()).intValue() + 1;
//					} else {
//						v = VbValue.fromJava(start);
//						start ++;
//					}
//					ConstDecl constDecl = new ConstDecl(moduleDecl.getLibrary(), moduleDecl, v);
//
//					String name = enumConstCtxt.ambiguousIdentifier().getText();
//
//					constDecl.visibility = enumDecl.visibility;
//					constDecl.ast = enumConstCtxt;
//					constDecl.varType = enumDecl.type;
//					constDecl.name = name;
//
//					// 枚举值可以相同
//					if (enumDecl.hasMember(name)) {
//						moduleDecl.addCompileException(enumConstCtxt.ambiguousIdentifier(), CompileException.AMBIGUOUS_IDENTIFIER,
//								name);
//					} else {
//						enumDecl.constDecls.add(constDecl);
//					}
//				} catch (CompileException e) {
//					moduleDecl.addCompileException(e);
//				}
//			}
//
//			addType(moduleDecl.getLibrary(), enumDecl);
//
//		}
//
//		private void addType(Library library, VbTypeDecl typeDecl) {
//			names.addDecl(typeDecl);
//			library.addType(typeDecl);
//			// TODO 类型已经存在
//		}
//
//		public void addDecl(ModuleDecl moduleDecl, MethodDecl methodDecl, VarDecl decl) {
//			if (methodDecl == null) {
//				if (moduleDecl.addMember(decl))
//					this.names.addDecl(decl);
//			} else {
//				methodDecl.addVariable(decl);
//			}
//		}
//
//		/// 变量声明
//		List<VarDecl> compileVarDecl(VariableStmtContext variableStmt, ModuleDecl module, MethodDecl method) {
//			/*
//			variableStmt : (DIM | STATIC | visibility) WS (WITHEVENTS WS)? variableListStmt;
//			
//			variableListStmt : variableSubStmt (WS? ',' WS? variableSubStmt)*;
//			
//			variableSubStmt : ambiguousIdentifier (WS? LPAREN WS? (subscripts WS?)? RPAREN WS?)? typeHint? (WS asTypeClause)?;
//			 */
//			Visibility visibility = parseVisibility(variableStmt.visibility(), Visibility.PRIVATE);
//			boolean isStatic = variableStmt.STATIC() != null;
//			boolean withEvents = variableStmt.WITHEVENTS() != null;
//
//			List<VarDecl> result = new ArrayList<VarDecl>();
//			for (VariableSubStmtContext stmt : variableStmt.variableListStmt().variableSubStmt()) {
//				VarDecl decl = new VarDecl(method == null ? module.getLibrary() : null, module);
//				decl.visibility = visibility;
//				decl.isStatic = isStatic;
//				decl.withEvents = withEvents;
//				decl.name = stmt.ambiguousIdentifier().getText();
//				ArrayDef.Rank[] ranks = null;
//				try {
//					ranks = parseArrayRanks(module, method, stmt.constSubscripts());
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//				VbVarType vbVarType = VbVarType.VbVariant;
//				try {
//					vbVarType = parseType(stmt.asTypeClause(), stmt.typeHint(), module);
//					decl.withNew = stmt.asTypeClause() != null && stmt.asTypeClause().NEW() != null;
//				} catch (CompileException e) {
//					module.addCompileException(e);
//				}
//				if (ranks != null || stmt.LPAREN() != null) {
//					vbVarType = vbVarType.toArrayType(ranks);
//				}
//
//				decl.varType = vbVarType;
//				decl.ast = stmt;
//				decl.methodDecl = method;
//				if (decl.withEvents) {
//					if (method != null || module instanceof ClassModuleDecl == false) {
//						module.addCompileException(variableStmt.WITHEVENTS(), CompileException.MUST_IN_CLASSMODULE,
//								variableStmt.WITHEVENTS());
//					}
//					if (decl.withNew) {
//						module.addCompileException(stmt.asTypeClause().NEW(), CompileException.SYNTAX_ERROR,
//								" New cannot come with WithEvents ");
//					}
//				}
//				decl.module = module;
//
//				result.add(decl);
//
//				addDecl(module, method, decl);
//			}
//			return result;
//		}
//
//		private ArrayDef.Rank[] parseArrayRanks(ModuleDecl module, MethodDecl method, ConstSubscriptsContext constSubscriptsContext)
//				throws CompileException {
//			ArrayDef.Rank[] ranks = null;
//			if (constSubscriptsContext != null) {
//				List<ConstSubscriptContext> subscripts = constSubscriptsContext.constSubscript();
//				ranks = new ArrayDef.Rank[subscripts.size()];
//				int i = 0;
//				for (ConstSubscriptContext subscript : subscripts) {
//					if (subscript.constValueExpr().size() == 1) {
//						int from = module.getArrayBase();
//						int to;
//						ConstValueExprContext s = subscript.constValueExpr(0);
//						try {
//							to = (Integer) (VbValue.cast(parseConstValueExpr(s, module, method), VbVarType.vbInteger).value);
//							ranks[i++] = new ArrayDef.Rank(from, to);
//						} catch (OverflowException e) {
//							module.addCompileException(s, CompileException.OVERFLOW, s);
//						}
//					} else {
//						ConstValueExprContext s = subscript.constValueExpr(0);
//						ConstValueExprContext e = subscript.constValueExpr(1);
//						int from;
//						try {
//							from = (Integer) (VbValue.cast(parseConstValueExpr(s, module, method), VbVarType.vbInteger).value);
//							int to;
//							try {
//								to = (Integer) (VbValue.cast(parseConstValueExpr(e, module, method), VbVarType.vbInteger).value);
//								ranks[i++] = new ArrayDef.Rank(from, to);
//							} catch (OverflowException e1) {
//								module.addCompileException(s, CompileException.OVERFLOW, e);
//							}
//						} catch (OverflowException e1) {
//							module.addCompileException(s, CompileException.OVERFLOW, s);
//						}
//					}
//				}
//			}
//			return ranks;
//		}
//
//		/*
//		 constValueExpr : 
//			literal 													# cveLiteral
//			| ambiguousIdentifier ('.' ambiguousIdentifier)* 			# cveIdentifier
//			
//			| constValueExpr WS? POW WS? constValueExpr 				# cvePow
//			| MINUS WS? constValueExpr 									# cveNegation
//			| PLUS WS? constValueExpr 									# cvePlus
//			| constValueExpr WS? MULT WS? constValueExpr 				# cveMult
//			| constValueExpr WS? DIV WS? constValueExpr 				# cveDiv
//			| constValueExpr WS? MOD WS? constValueExpr 				# cveMod
//			| constValueExpr WS? PLUS WS? constValueExpr 				# cveAdd
//			| constValueExpr WS? MINUS WS? constValueExpr 				# cveMinus
//			
//			| constValueExpr WS? AMPERSAND WS? constValueExpr 			# cveAmp
//			
//			| constValueExpr WS? LIKE WS? constValueExpr 				# cveLike
//			| constValueExpr WS? GEQ WS? constValueExpr 				# cveGeq
//			| constValueExpr WS? LEQ WS? constValueExpr 				# cveLeq
//			| constValueExpr WS? GT WS? constValueExpr 					# cveGt
//			| constValueExpr WS? LT WS? constValueExpr 					# cveLt
//			| constValueExpr WS? NEQ WS? constValueExpr 				# cveNeq
//			| constValueExpr WS? EQ WS? constValueExpr 					# cveEq
//		
//			| NOT WS? constValueExpr 									# cveNot
//			| constValueExpr WS? AND WS? constValueExpr 				# cveAnd
//			| constValueExpr WS? OR WS? constValueExpr 					# cveOr
//			| constValueExpr WS? XOR WS? constValueExpr 				# cveXor
//			| constValueExpr WS? EQV WS? constValueExpr 				# cveEqv
//			| constValueExpr WS? IMP WS? valueStmt 						# cveImp
//		 */
//		private VbValue parseConstValueExpr(ConstValueExprContext valueStmt, ModuleDecl module, MethodDecl method)
//				throws CompileException {
//			try {
//				if (valueStmt instanceof CveLiteralContext) {
//					LiteralContext literal = ((CveLiteralContext) valueStmt).literal();
//					return parseLiteral(literal, module);
//				} else if (valueStmt instanceof CveAddContext) {
//					VbValue n1 = parseConstValueExpr(((CveAddContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveAddContext) valueStmt).constValueExpr(1), module, method);
//					return MathExpr.add(n1, n2);
//				} else if (valueStmt instanceof CveMinusContext) {
//					VbValue n1 = parseConstValueExpr(((CveMinusContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveMinusContext) valueStmt).constValueExpr(1), module, method);
//					return MathExpr.subtract(n1, n2);
//				} else if (valueStmt instanceof CveMultContext) {
//					VbValue n1 = parseConstValueExpr(((CveMultContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveMultContext) valueStmt).constValueExpr(1), module, method);
//					return MathExpr.multi(n1, n2);
//				} else if (valueStmt instanceof CveDivContext) {
//					VbValue n1 = parseConstValueExpr(((CveDivContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveDivContext) valueStmt).constValueExpr(1), module, method);
//					CveDivContext div = (CveDivContext) valueStmt;
//					if (div.DIV().getText().charAt(0) == '/') {
//						return MathExpr.div(n1, n2);
//					} else {
//						// 整除 \
//						return MathExpr.idiv(n1, n2);
//					}
//				} else if (valueStmt instanceof CveLikeContext) {
//					VbValue n1 = parseConstValueExpr(((CveMultContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveMultContext) valueStmt).constValueExpr(1), module, method);
//					return StringExpr.like(n1, n2);
//				} else if (valueStmt instanceof CvePowContext) {
//					VbValue n1 = parseConstValueExpr(((CvePowContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CvePowContext) valueStmt).constValueExpr(1), module, method);
//					return MathExpr.power(n1, n2);
//				} else if (valueStmt instanceof CveModContext) {
//					VbValue n1 = parseConstValueExpr(((CvePowContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CvePowContext) valueStmt).constValueExpr(1), module, method);
//					return MathExpr.mod(n1, n2);
//				} else if (valueStmt instanceof CveNegationContext) {
//					VbValue v = parseConstValueExpr(((CveNegationContext) valueStmt).constValueExpr(), module, method);
//					return MathExpr.neg(v);
//				} else if (valueStmt instanceof CvePlusContext) {
//					VbValue v = parseConstValueExpr(((CvePlusContext) valueStmt).constValueExpr(), module, method);
//					return MathExpr.pos(v);
//				} else if (valueStmt instanceof CveNotContext) {
//					VbValue v = parseConstValueExpr(((CveNotContext) valueStmt).constValueExpr(), module, method);
//					return LogicalExpr.not(v);
//				} else if (valueStmt instanceof CveAndContext) {
//					VbValue n1 = parseConstValueExpr(((CveAndContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveAndContext) valueStmt).constValueExpr(1), module, method);
//					return LogicalExpr.and(n1, n2);
//				} else if (valueStmt instanceof CveOrContext) {
//					VbValue n1 = parseConstValueExpr(((CveOrContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveOrContext) valueStmt).constValueExpr(1), module, method);
//					return LogicalExpr.or(n1, n2);
//				} else if (valueStmt instanceof CveXorContext) {
//					VbValue n1 = parseConstValueExpr(((CveXorContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveXorContext) valueStmt).constValueExpr(1), module, method);
//					return LogicalExpr.xor(n1, n2);
//				} else if (valueStmt instanceof CveImpContext) {
//					VbValue n1 = parseConstValueExpr(((CveImpContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveImpContext) valueStmt).constValueExpr(1), module, method);
//					return LogicalExpr.imp(n1, n2);
//				} else if (valueStmt instanceof CveEqvContext) {
//					VbValue n1 = parseConstValueExpr(((CveEqvContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveEqvContext) valueStmt).constValueExpr(1), module, method);
//					return LogicalExpr.eqv(n1, n2);
//				} else if (valueStmt instanceof CveIdentifierContext) {
//					List<AmbiguousIdentifierContext> ids = ((CveIdentifierContext) valueStmt).ambiguousIdentifier();
//					return findConstValue(valueStmt, module, method, ids);
//				} else if (valueStmt instanceof CveAmpContext) {
//					VbValue n1 = parseConstValueExpr(((CveAddContext) valueStmt).constValueExpr(0), module, method);
//					VbValue n2 = parseConstValueExpr(((CveAddContext) valueStmt).constValueExpr(1), module, method);
//					String s = VbValue.CStr(n1).value + "" + VbValue.CStr(n2).value;
//					return new VbValue(VbVarType.VbString, s);
//				}
//			} catch (OverflowException e) {
//				throw module.newCompileException(valueStmt, CompileException.OVERFLOW, valueStmt);
//			}
//			// TODO 其它表达式
//			throw new UnsupportedOperationException("");
//		}
//
//		VbValue findConstValue(String complexName, ModuleDecl module, MethodDecl method) throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
//			return names.findAccessibleConst(complexName, module.getLibrary()).constValue;
//		}
//		
//		VbValue findConstValue(ConstValueExprContext valueStmt, ModuleDecl module, MethodDecl method,
//				List<AmbiguousIdentifierContext> ids) throws CompileException {
//			try {
//				if (ids.size() == 1) {
//					String constName = valueStmt.getText().toUpperCase();
//
//					if (method != null && method.variables.containsKey(constName)) {
//						VarDecl v = method.variables.get(constName);
//						if (v instanceof ConstDecl == false) {
//							throw new NotMatchException();
//						}
//						return ((ConstDecl) v).constValue;
//					} else {
//						return names.findAccessibleConst(constName, module.getLibrary()).constValue;
//					}
//				} else {
//					String constName = valueStmt.getText().toUpperCase();
//					return names.findAccessibleConst(constName, module.getLibrary()).constValue;
//				}
//			} catch (NotMatchException e) {
//				throw module.newCompileException(valueStmt, CompileException.SHOULD_BE, valueStmt, "const");
//			} catch (AmbiguousIdentifierException e) {
//				throw module.newCompileException(valueStmt, CompileException.AMBIGUOUS_IDENTIFIER, valueStmt);
//			} catch (NotFoundException e) {
//				throw module.newCompileException(valueStmt, CompileException.UNKOWN_VALUE, valueStmt);
//			}
//		}
//
//		VbVarType parseType(AsTypeClauseContext asType, TypeHintContext typeHint, ModuleDecl module) throws CompileException {
//			TypeContext type = null;
//			if (asType != null) {
//				type = asType.type();
//			}
//			return parseType(type, typeHint, module);
//		}
//
//		VbVarType parseType(TypeContext type, TypeHintContext typeHint, ModuleDecl module) throws CompileException {
//			/*
//				type : (fixedSizeString | baseType | complexType) (WS? LPAREN WS? RPAREN)?;
//				
//				baseType : BOOLEAN | BYTE | DATE | DOUBLE | INTEGER | LONG | SINGLE | STRING | VARIANT | OBJECT | IUNKNOWN;
//				
//				complexType : ambiguousIdentifier (('.' | '!') ambiguousIdentifier)*;
//			 */
//			VbVarType result = null;
//			String name = null;
//			if (type != null) {
//				BaseTypeContext baseType = type.baseType();
//				if (baseType != null) {
//					name = baseType.getText().toUpperCase();
//					result = vbTypeNameToType.get(name);
//				} else if (type.fixedSizeString() != null) {
//					result = VbVarType.VbString;
//					FixedSizeStringContext fs = type.fixedSizeString();
//					long length = 0;
//					try {
//						if (fs.literal() != null) {
//							VbValue l = parseLiteral(fs.literal(), module);
//							length = (Long) VbValue.cast(l, VbVarType.vbLong).value;
//						} else {
//							VbValue l = names.findAccessibleConst(fs.ambiguousIdentifier().getText(), module.getLibrary()).constValue;
//							length = (Long) VbValue.cast(l, VbVarType.vbLong).value;
//						}
//					} catch (ClassCastException e) {
//						throw module.newCompileException(fs, CompileException.SHOULD_BE, fs, "number");
//					} catch (NotMatchException e) {
//						throw module.newCompileException(fs, CompileException.SHOULD_BE, fs, "number");
//					} catch (AmbiguousIdentifierException e) {
//						throw module.newCompileException(fs, CompileException.AMBIGUOUS_IDENTIFIER, fs);
//					} catch (NotFoundException e) {
//						throw module.newCompileException(fs, CompileException.UNKOWN_TYPE, fs);
//					} catch (OverflowException e) {
//						throw module.newCompileException(fs, CompileException.OVERFLOW, fs);
//					}
//					result = new VbFixedStringType(length);
//				} else {
//					ComplexTypeContext types = type.complexType();
//					result = findType(types, module);
//				}
//				assert result != null;
//			}
//			if (typeHint != null) {
//				VbVarType typeHintType = parseTypeHint(typeHint);
//				if (result == null) {
//					result = typeHintType;
//				} else {
//					if (result.vbType != typeHintType.vbType) {
//						throw module.newCompileException(typeHint, CompileException.TYPE_HINT_MISMATCH, typeHint);
//					}
//				}
//			}
//			if (result == null) {
//				result = VbVarType.VbVariant;
//			}
//			if (type != null && type.LPAREN() != null) {
//				return result.toArrayType(null);
//			} else {
//				return result;
//			}
//		}
//
//		private VbVarType findTypeInGlobal(ComplexTypeContext types, ModuleDecl module) throws CompileException {
//			try {
//				VbTypeDecl type = names.findAccessibleType(types.getText(), module.getLibrary());
//				if (type instanceof EnumDecl) {
//					return new VbVarType(VbVarType.vbLong, (VbTypeDecl) type, null, null);
//				} else if (type instanceof UdtDecl) {
//					return new VbVarType(VbVarType.vbUserDefinedType, type, null, null);
//				} else if (type instanceof ClassTypeDecl) {
//					return new VbVarType(VbVarType.vbObject, type, null, null);
//				} else {
//					throw new ImpossibleException();
//				}
//			} catch (NotMatchException e) {
//				throw module.newCompileException(types, CompileException.SHOULD_BE, types, "data type");
//			} catch (AmbiguousIdentifierException e) {
//				throw module.newCompileException(types, CompileException.AMBIGUOUS_IDENTIFIER, types);
//			} catch (NotFoundException e) {
//				throw module.newCompileException(types, CompileException.UNKOWN_VALUE, types);
//			}
//
//		}
//		
//		private VbVarType findType(ComplexTypeContext types, ModuleDecl module) throws CompileException {
//			try {
//				VbTypeDecl type = module.getLibrary().names.findAccessibleType(types.getText(), module.getLibrary());
//				if (type instanceof EnumDecl) {
//					return new VbVarType(VbVarType.vbLong, (VbTypeDecl) type, null, null);
//				} else if (type instanceof UdtDecl) {
//					return new VbVarType(VbVarType.vbUserDefinedType, type, null, null);
//				} else if (type instanceof ClassTypeDecl) {
//					return new VbVarType(VbVarType.vbObject, type, null, null);
//				} else {
//					throw new ImpossibleException();
//				}
//			} catch (NotMatchException e) {
//				throw module.newCompileException(types, CompileException.SHOULD_BE, types, "data type");
//			} catch (AmbiguousIdentifierException e) {
//				throw module.newCompileException(types, CompileException.AMBIGUOUS_IDENTIFIER, types);
//			} catch (NotFoundException e) {
//				return findTypeInGlobal(types, module);
//			}
//
//		}
//
//		private VbVarType parseTypeHint(TypeHintContext typeHint) {
//			String hint = typeHint.getText();
//			VbVarType result = vbTypeCharToVbType.get(hint);
//			return result;
//		}
//
//		private Visibility parseVisibility(VisibilityContext visibilityContext, Visibility defaultVisibility) {
//			if (visibilityContext == null)
//				return defaultVisibility;
//
//			switch (visibilityContext.getText().toUpperCase()) {
//			case "PUBLIC":
//				return Visibility.PUBLIC;
//			case "PRIVATE":
//				return Visibility.PRIVATE;
//			case "GLOBAL":
//				return Visibility.GLOBAL;
//			case "FRIEND":
//				return Visibility.FRIEND;
//			}
//			return defaultVisibility;
//		}
//
//		/*
//		 * literal : HEXLITERAL | OCTLITERAL | DATELITERAL | DOUBLELITERAL | INTEGERLITERAL | SHORTLITERAL | STRINGLITERAL | TRUE | FALSE | NOTHING | NULL | EMPTY;
//		 */
//		VbValue parseLiteral(LiteralContext literal, ModuleDecl module) throws CompileException { // TODO
//			TerminalNode node = (TerminalNode) literal.getChild(0);
//			try {
//				switch (node.getSymbol().getType()) {
//				case VbaLexer.INTEGERLITERAL:
//					return parseIntegerLiteral(node);
//				case VbaLexer.SHORTLITERAL:
//					return parseShortLiteral(node);
//				case VbaLexer.DOUBLELITERAL:
//					double v = Double.parseDouble(node.getText());
//					return new VbValue(VbVarType.VbDouble, v);
//				case VbaLexer.HEXLITERAL:
//					long n = Long.parseLong(node.getText().substring(2), 16);
//					if (n >= 0 && n <= 0xffff) { // TODO integer 范围调整此处也需要调整
//						// if(VbVarType.NumberRange[VbVarType.vbInteger].isIn(n)){
//						return new VbValue(VbVarType.VbInteger, (int) (short) n);
//					} else {
//						return new VbValue(VbVarType.VbLong, n);
//					}
//				case VbaLexer.OCTLITERAL:
//					long o = Long.parseLong(node.getText().substring(2), 8);
//					if (VbVarType.NumberRange[VbVarType.vbInteger].isIn(o)) {
//						return new VbValue(VbVarType.VbInteger, (int) o);
//					} else {
//						return new VbValue(VbVarType.VbLong, o);
//					}
//				case VbaLexer.DATELITERAL:
//					String s = node.getText();
//					s = s.substring(1, s.length() - 2); 
//					return VbValue.fromJava(VbValue.parseDate(s));
//				case VbaLexer.NOTHING:
//					return VbValue.Nothing;
//				case VbaLexer.NULL:
//					return VbValue.Null;
//				case VbaLexer.EMPTY:
//					return VbValue.Empty;
//				case VbaLexer.STRINGLITERAL:
//					return new VbValue(VbVarType.VbString, unescapeVbString(node.getText()));
//				case VbaLexer.TRUE:
//					return new VbValue(VbVarType.VbBoolean, -1);
//				case VbaLexer.FALSE:
//					return new VbValue(VbVarType.VbBoolean, 0);
//				}
//			} catch (ClassCastException e) {
//				throw module.newCompileException(node, CompileException.TYPE_MISMATCH, node);
//			}
//
//			throw new UnsupportedOperationException("unrecognized literal " + literal.getText());
//		}
//
//		/**
//		 * STRINGLITERAL : '"' (~["\r\n] | '""')* '"';
//		 * 
//		 * @param text
//		 * @return
//		 */
//		public static String unescapeVbString(String text) {
//			return text.substring(1, text.length() - 1).replace("\"\"", "\"");
//		}
//
//		/*
//		 * INTEGERLITERAL : SHORTLITERAL (E SHORTLITERAL)?;
//		 */
//		private VbValue parseIntegerLiteral(TerminalNode integerLiteral) throws OverflowException {
//			TerminalNode short1 = (TerminalNode) integerLiteral.getChild(0);
//			if (integerLiteral.getChildCount() > 1) {
//				TerminalNode short2 = (TerminalNode) integerLiteral.getChild(2);
//				VbValue v1 = parseShortLiteral(short1);
//				VbValue v2 = parseShortLiteral(short2);
//				return MathExpr.e(v1, v2);
//			} else {
//				return parseShortLiteral(short1);
//			}
//		}
//
//		/*
//		 * SHORTLITERAL : (PLUS|MINUS)? DIGIT+ ('#' | '&' | '@')?;
//		 */
//		private VbValue parseShortLiteral(TerminalNode shortLiteral) {
//			boolean neg = false;
//			int type = VbVarType.vbInteger;
//			String num = "";
//			String s = shortLiteral.getText();
//			for (int i = 0; i < s.length(); i++) {
//				char c = s.charAt(i);
//				if (c == '-') {
//					neg = true;
//				} else if (c == '+' || Character.isWhitespace(c)) {
//					//
//				} else if (c == '#') {
//					type = VbVarType.vbDouble;
//				} else if (c == '&') {
//					type = VbVarType.vbLong;
//				} else if (c == '@') {
//					type = VbVarType.vbCurrency;
//				} else if (c == '!') {
//					type = VbVarType.vbSingle;
//				} else {
//					num += c;
//				}
//			}
//			long value = Long.parseLong(num);
//			if (neg)
//				value = -value;
//
//			switch (type) {
//			case VbVarType.vbInteger:
//				try {
//					return new VbValue(VbVarType.VbInteger, (int) value);
//				} catch (OverflowException e) {
//					// 贯穿到 vbLong case
//				}
//			case VbVarType.vbLong:
//				// 在 VB IDE 里，如果输入的数字足够大，即使写明为 % Integer，也会自动调为 &
//				return new VbValue(VbVarType.VbLong, (long) value);
//			case VbVarType.vbSingle:
//				return new VbValue(VbVarType.VbSingle, (float) value);
//			case VbVarType.vbCurrency:
//				return new VbValue(VbVarType.VbCurrency, (double) value); // Currency 存储为 64 位（8 个字节）整型的数值形式，然后除以 10,000 给出一个定点数，其小数点左边有 15 位数字，右边有 4 位数字。
//			case VbVarType.vbDouble:
//				return new VbValue(VbVarType.VbDouble, VbValue.doubleToCurrency((double) value));
//			default:
//				// TODO case VbVarType.vbDecimal: and other types
//				return new VbValue(VbVarType.VbDecimal, new BigDecimal(value));
//			}
//		}
//
//		/**
//		 * 编译方法体为语句
//		 * 
//		 * @param method
//		 */
//		private void compileMethodBody(MethodDecl method) {
//			if(method.ast == null) return;
//			
//			this.addErrObjectDecl(method);
//			BlockContext block = null;
//
//			block = method.ast.getChild(BlockContext.class, 0);
//			if (block != null) {
//				method.statements.addAll(compileBlock(block, method));
//			}
//		}
//
//		private void compileRuleBody(RuleDecl rule) {
//			for (int i = 0; i < rule.entranceAstes.size(); i++) {
//				ValueStmtContext ast = rule.entranceAstes.get(i);
//				if (ast != null) {
//					ValueStatementDesc desc;
//					try {
//						desc = this.compileValueStatement(ast, rule);
//						if (!desc.getVarType().isBaseType()) {
//							// TODO 如果不是基本类型，可能无法当做条件表达式，但是，，对象也可以有默认函数，所以对象可能也可算作基本类型
//						}
//						rule.entrances.add(desc.getStatement());
//					} catch (CompileException e) {
//						rule.module.addCompileException(e);
//					}
//				} else {
//					rule.entrances.add(null);
//				}
//
//				MethodDecl m = rule.methods.get(i);
//				if (m.name.equalsIgnoreCase(rule.name)) { // 无别名, 不属于模块成员， 不会被独立编译
//					compileMethodBody(m);
//				}
//			}
//		}
//
//		private List<Statement> compileBlock(BlockContext block, MethodDecl method) {
//			return new BlockCompiler(block, method, this).compile();
//		}
//
//		ValueStatementDesc compileValueStatement(ValueStmtContext valueStmt, MethodDecl method) throws CompileException {
//			return new ValueStatementCompiler(this).compileValueStatement(valueStmt, method);
//		}
//
//		ValueStatementDesc compileImplicitCallStmt(ImplicitCallStmt_InStmtContext implicitCallStmt, MethodDecl method,
//				boolean asAssignee) throws CompileException {
//			return new ValueStatementCompiler(this).compileImplicitCallStmt(implicitCallStmt, method, asAssignee);
//		}
//
//		ValueStatementDesc compileImplicitCallStmt(ImplicitCallStmt_InStmtContext implicitCallStmt, MethodDecl method,
//				boolean asAssignee, boolean apply) throws CompileException {
//			return new ValueStatementCompiler(this).compileImplicitCallStmt(implicitCallStmt, method, asAssignee, apply);
//		}
//
//		ClassTypeDecl findClassTypeDecl(String name, ParserRuleContext ast, ModuleDecl module) throws CompileException {
//			VbVarType type = vbTypeNameToType.get(name);	// Object/IUnknown
//			if(type != null && type.vbType == VbVarType.vbObject){
//				return type.getClassTypeDecl();
//			}
//			VbTypeDecl typeDecl = null;
//			try {
//				typeDecl = names.findAccessibleType(name, module.getLibrary());
//			} catch (NotMatchException e) {
//				throw module.newCompileException(ast, CompileException.SHOULD_BE, name, "type");
//			} catch (AmbiguousIdentifierException e) {
//				throw module.newCompileException(ast, CompileException.AMBIGUOUS_IDENTIFIER, name);
//			} catch (NotFoundException e) {
//				throw module.newCompileException(ast, CompileException.UNKOWN_TYPE, name);
//			}
//			if (typeDecl instanceof ClassTypeDecl == false) {
//				throw module.newCompileException(ast, CompileException.SHOULD_BE, ast, "object type");
//			}
//			return (ClassTypeDecl) typeDecl;
//		}
//
//		void checkMethodOrPropertyCall(VbDecl base, List<ValueStatementDesc> args, ModuleDecl module, ParserRuleContext ast)
//				throws CompileException {
//			if (base == VbDecl.COMPILER_UNKNOWN)
//				return;
//			if (base instanceof MethodDecl) {
//				checkArgs(((MethodDecl) base).arguments, args, module, ast);
//			} else if (base instanceof PropertyDecl) {
//				checkArgs(((PropertyDecl) base).getArguments(), args, module, ast);
//			} else {
//				throw new ImpossibleException();
//			}
//		}
//
//		static List<ArgumentDecl> getArgumentDeclsOfMethodOrProperty(VbDecl base) {
//			if (base instanceof MethodDecl) {
//				return ((MethodDecl) base).arguments;
//			} else if (base instanceof PropertyDecl) {
//				return ((PropertyDecl) base).getArguments();
//			}
//			return null;
//		}
//
//		List<ValueStatementDesc> compileArgsCall(ArgsCallContext argsCall, List<ArgumentDecl> argDecls, MethodDecl method)
//				throws CompileException {
//			List<ValueStatementDesc> result = new ArrayList<>();
//			ArgCallContext argCall = null;
//			for (int i = 0; i < argsCall.getChildCount(); i++) {
//				ParseTree c = argsCall.getChild(i);
//				if (c instanceof ArgCallContext) {
//					argCall = (ArgCallContext) c;
//					ValueStatementDesc vds = this.compileValueStatement(argCall.valueStmt(), method);
//					if (argCall.ambiguousIdentifier() != null) {
//						result.add(new NamedArgument(vds, argCall.ambiguousIdentifier().getText()));
//					} else {
//						result.add(vds);
//					}
//				} else if (c instanceof TerminalNode) {
//					if (c.getText().equals(",")) {
//						if (argCall != null) {
//							argCall = null;
//						} else {
//							result.add(null);
//						}
//					}
//				} else {
//					assert "impossible" != null;
//				}
//			}
//
//			if (argDecls != null) {
//				try {
//					Compiler.processNamedArguments(argDecls, result);
//				} catch (AlreadyPositionedException e) {
//					throw method.module.newCompileException(e.getAst(), CompileException.SYNTAX_ERROR,
//							e.getName() + " already come by positional argument");
//				} catch (RemainShouldNamedException e) {
//					throw method.module.newCompileException(e.getAst(), CompileException.SYNTAX_ERROR,
//							"remain arguments should all be named arguments");
//				} catch (NameNotFoundException e) {
//					throw method.module.newCompileException(e.getAst(), CompileException.SYNTAX_ERROR, e.getName() + " not found");
//				}
//			}
//
//			for (int i = 0; i < result.size(); i++) {
//				ValueStatementDesc arg = result.get(i);
//				if (arg == null) {
//					result.set(i, new ValueStatementDesc()); // optional argument
//				}
//			}
//			return result;
//		}
//
//		static void checkArgs(List<ArgumentDecl> argDecls, List<ValueStatementDesc> args, ModuleDecl module, ParserRuleContext ast)
//				throws CompileException {
//			int declCnt = 0, callCnt = 0;
//			if (argDecls != null)
//				declCnt = argDecls.size();
//			if (args != null)
//				callCnt = args.size();
//			if (callCnt > declCnt) {
//				if (declCnt == 0 || argDecls.get(argDecls.size() - 1).isParamArray == false) {
//					throw module.newCompileException(ast, CompileException.ARGUMENT_COUNT_MISMATCH, ast);
//				}
//			} else if (callCnt < declCnt) {
//				if (argDecls.get(callCnt).isParamArray || isAllOptional(argDecls, callCnt)) {
//					
//				} else {
//					throw module.newCompileException(ast, CompileException.ARGUMENT_COUNT_MISMATCH, ast);
//				}
//			}
//			for (int i = 0; i < Math.max(declCnt, callCnt); i++) {
//				ArgumentDecl decl = (i >= declCnt ? null : argDecls.get(i));
//				ValueStatementDesc arg = (i >= callCnt ? null : args.get(i));
//
//				if (decl.optional && (arg == null || arg.getStatement() == null)) {
//					continue;
//				}
//				if (decl.isParamArray) {
//					break;
//				}
//				boolean explicitMatch = (decl.mode == ArgumentMode.ByRef
//						&& arg.getStatement() instanceof LiteralStatement == false);
//				if (!isArgTypeMatch(decl.varType, arg.getVarType(), explicitMatch)) {
//					throw module.newCompileException(arg.getAst(), CompileException.ARGUMENT_TYPE_MISMATCH, arg.getAst());
//				}
//			}
//		}
//
//		private static boolean isAllOptional(List<ArgumentDecl> argDecls, int from) {
//			for(int i=from; i<argDecls.size(); i++){
//				if(argDecls.get(i).optional == false) return false;
//			}
//			return true;
//		}
//
//		public static boolean isArgTypeMatch(VbVarType declType, VbVarType argType, boolean explicitMatch) {
//			boolean match = false;
//			if (declType == argType) {
//				match = true;
//			} else if (declType.vbType == VbVarType.vbVariant) {
//				match = true;
//			} else if (declType.vbType == VbVarType.vbObject) {
//				if (argType.vbType == VbVarType.vbObject) {
//					ClassTypeDecl ct1 = (ClassTypeDecl) declType.typeDecl;
//					ClassTypeDecl ct2 = (ClassTypeDecl) argType.typeDecl;
//					if (ct2 == null || ct1 == null || ct1.classModule == ct2.classModule || ct2.classModule.isImplementFrom(ct1.classModule))
//						match = true;
//				}
//			} else if (declType.vbType == VbVarType.vbUserDefinedType) {
//				if (argType.vbType == VbVarType.vbUserDefinedType) {
//					match = (argType.typeDecl == declType.typeDecl);
//				}
//			} else if (declType.vbType == VbVarType.vbArray) {
//				if (argType.vbType == VbVarType.vbArray) {
//					return isArgTypeMatch(declType.arrayDef.baseType, argType.arrayDef.baseType, explicitMatch);
//				}
//			} else if (declType.vbType == argType.vbType) {
//				match = true;
//			} else if (!explicitMatch) { // TODO vb base types can cast to each other(?)
//				match = true;
//			}
//			return match;
//		}
//
//		List<Statement> toStatements(List<ValueStatementDesc> lsSubscripts, ModuleDecl moduleDecl) {
//			List<Statement> result = new ArrayList<>();
//			for (ValueStatementDesc vds : lsSubscripts) {
//				if (vds instanceof NamedArgument) {
//					result.add(new NamedArgumentStatement(moduleDecl.sourceLocation(vds.getAst()), vds.getStatement(),
//							((NamedArgument) vds).getName()));
//				} else {
//					result.add(vds.getStatement());
//				}
//			}
//			return result;
//		}
//
//		static void processNamedArguments(List<ArgumentDecl> argDecls, List<ValueStatementDesc> argCalls)
//				throws CompileException, AlreadyPositionedException, RemainShouldNamedException, NameNotFoundException {
//			boolean namedArguments = false;
//			int nameArgumentStart = -1;
//			NamedArgument firstNamedArg = null;
//			for (int i = 0; i < argCalls.size(); i++) {
//				ValueStatementDesc arg = argCalls.get(i);
//				if (namedArguments == false) {
//					if (arg instanceof NamedArgument) {
//						namedArguments = true;
//						nameArgumentStart = i;
//						firstNamedArg = (NamedArgument) arg;
//					}
//				} else {
//					if (arg instanceof NamedArgument == false) {
//						// When you supply arguments by a mixture of position and name, the positional arguments must all come first.
//						// Once you supply an argument by name, the remaining arguments must all be by name.
//						throw new NamedArgument.RemainShouldNamedException(firstNamedArg.getAst());
//					}
//				}
//
//			}
//
//			if (namedArguments) { // sort named arguments
//				for (int i = argCalls.size(); i < argDecls.size(); i++) {
//					argCalls.add(null);
//				}
//
//				for (int i = nameArgumentStart; i < argCalls.size();) {
//					ValueStatementDesc vds = argCalls.get(i);
//					if (vds instanceof NamedArgument == false) { // already converted or null
//						i++;
//						continue;
//					}
//					NamedArgument arg = (NamedArgument) vds;
//					String name = arg.getName();
//					int newIndex = findNamedArgIndex(argDecls, name.toUpperCase());
//					if (newIndex == -1) {
//						throw new NamedArgument.NameNotFoundException(arg.getAst(), name);
//					} else if (newIndex < nameArgumentStart) {
//						throw new NamedArgument.AlreadyPositionedException(arg.getAst(), name);
//					} else if (newIndex == i) {
//						i++;
//					} else {
//						// swap
//						ValueStatementDesc prev = argCalls.get(newIndex);
//						argCalls.set(newIndex, arg.getStmtDesc());
//						argCalls.set(i, prev);
//					}
//				}
//
//				for (int i = 0; i < argCalls.size(); i++) {
//					ValueStatementDesc arg = argCalls.get(i);
//					if (arg instanceof NamedArgument) {
//						argCalls.set(i, ((NamedArgument) arg).getStmtDesc());
//					}
//				}
//			}
//		}
//
//		public static int findNamedArgIndex(List<ArgumentDecl> argDecls, String argName) {
//			for (int i = 0; i < argDecls.size(); i++) {
//				ArgumentDecl na = (ArgumentDecl) argDecls.get(i);
//				if (na.name.equalsIgnoreCase(argName)) {
//					return i;
//				}
//			}
//			return -1;
//		}
//
//		static boolean isDynamic(VbDecl base) {
//			if (base == VbDecl.COMPILER_UNKNOWN)
//				return true;
//			if (base instanceof VarDecl) {
//				VarDecl var = (VarDecl) base;
//				if (var.varType.vbType == VbVarType.vbVariant)
//					return true;
//				if (var.varType.vbType == VbVarType.vbObject && var.varType.typeDecl == null)
//					return true;
//			}
//			return false;
//		}
//		
//
//		VbDecl findMemberDeclInScope(String varName, MethodDecl method, boolean thisAsMethod)
//				throws AmbiguousIdentifierException, NotMatchException, NotFoundException {
//			varName = varName.toUpperCase();
//			if (method.variables.containsKey(varName)) {
//				VarDecl var = method.variables.get(varName);
//				if (var == method.result && thisAsMethod) {
//					return method;
//				} else {
//					return var;
//				}
//			}
//
//			if (method.module.members.containsKey(varName)) {
//				return method.module.members.get(varName);
//			} else {
//				return names.findAccessibleMemberDecl(varName, method.module, method.module.getLibrary(), false, ModuleMemberDecl.class);
//			}
//		}
//		
//		VbDecl findMemberDeclInScope(ParserRuleContext ast, MethodDecl method, boolean thisAsMethod) throws CompileException {
//			boolean isKeyword = false;
//			if (ast instanceof AmbiguousIdentifierContext) {
//				AmbiguousIdentifierContext ambiguousId = (AmbiguousIdentifierContext) ast;
//				if (ambiguousId.ambiguousKeyword().isEmpty() == false) {
//					isKeyword = true;
//				}
//			}
//
//			String varName = ast.getText().toUpperCase();
//			if (isKeyword) {
//				if (varName.equals("ME")) {
//					if (method.module instanceof ClassModuleDecl) {
//						return ((ClassModuleDecl) method.module).me();
//					} else {
//						throw method.module.newCompileException(ast, CompileException.IS_NOT_CLASS, ast);
//					}
//				} else {
//					// throw method.module.newCompileException(ast, CompileException.IS_KEYWORD, ast);
//				}
//			}
//			try {
//				return this.findMemberDeclInScope(varName, method, false);
//
//			} catch (NotMatchException e) {
//				throw method.module.newCompileException(ast, CompileException.SHOULD_BE, ast, "variable or const");
//			} catch (AmbiguousIdentifierException e) {
//				throw method.module.newCompileException(ast, CompileException.AMBIGUOUS_IDENTIFIER, ast);
//			} catch (NotFoundException e) {
//				if (method.module.isExplicit() == false) {
//					// auto declare var as Variant
//					VarDecl varDecl = new VarDecl(method.getLibrary(), method.module);
//					varDecl.name = ast.getText();
//					varDecl.ast = ast;
//					varDecl.methodDecl = method;
//					varDecl.varType = VbVarType.VbVariant;
//					varDecl.isImplicit = true;
//					method.addVariable(varDecl);
//					return varDecl;
//				} else {
//					throw method.module.newCompileException(ast, CompileException.UNKOWN_VALUE, ast);
//				}
//			}
//		}
//
//		public List<Statement> generateStatements() throws VbErrorsException {
//			List<Statement> result = new ArrayList<>();
//			for (Library lib : libs) {
//				if (lib.hasError()) {
//					throw new VbErrorsException(lib.getErrors());
//				}
//				result.add(new LoadLibraryStatement(lib));
//			}
//			for (Library lib : libs) {
//				result.add(new InitLibraryStatement(lib));
//			}
//			return result;
//		}
//
//		public void bindObject(String name, VbValue object) {
//			ConstDecl konst = new ConstDecl(null, null, object);
//			konst.varType = object.varType;
//			konst.visibility = Visibility.PUBLIC;
//			konst.name = name;
//			names.addDecl(konst);
//		}
//
//		public void mustBeClassType(VbTypeDecl typeDecl, ModuleDecl module, ParserRuleContext ast) throws CompileException {
//			if (typeDecl instanceof ClassTypeDecl == false && typeDecl != VbDecl.COMPILER_UNKNOWN) {
//				throw module.newCompileException(ast, CompileException.IS_NOT_CLASS, ast);
//			}
//		}
//
//		public void mustBeClassType(VbVarType type, ModuleDecl module, ParserRuleContext ast) throws CompileException {
//			if (type.vbType != VbVarType.vbObject && type.vbType != VbVarType.vbVariant
//					&& type.typeDecl != VbDecl.COMPILER_UNKNOWN) {
//				throw module.newCompileException(ast, CompileException.IS_NOT_CLASS, ast);
//			}
//		}
//
//		public void mustBeNumberType(VbVarType varType) {
//			// TODO
//		}
//
//		public void mustBeNumberOrStringType(VbVarType varType) {
//			// TODO
//		}
//
//		public void mustBeArrayOrCollection(ValueStatementDesc collection) {
//		}
//
//		public static void noNamedArgs(ArgsCallContext argsCall, ModuleDecl module) {
//			for (ArgCallContext argCall : argsCall.argCall()) {
//				if (argCall.ambiguousIdentifier() != null) {
//					module.addCompileException(argCall, CompileException.SYNTAX_ERROR, " named argument not allowed");
//				}
//			}
//		}
//
//		public Statement compileExpression(String expr, MethodDecl method, ModuleInstance module) throws CompileException {
//			VbaLexer lexer = new VbaLexer(new org.antlr.v4.runtime.ANTLRInputStream(expr));
//
//			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//			VbaParser parser = new VbaParser(tokenStream);
//			parser.setBuildParseTree(true);
//			parser.addErrorListener(new BaseErrorListener() {
//
//				@Override
//				public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
//						String msg, RecognitionException e) {
//					// errors.add(new CompileException(new SourceLocation(file, line, charPositionInLine, 0),
//					// CompileException.SYNTAX_ERROR, msg, ((CommonToken) offendingSymbol).getText()));
//					System.err.println(msg);
//				}
//
//			});
//
//			EvalStmtContext eval = parser.evalStmt();
//			ParserRuleContext c = (ParserRuleContext) eval.getChild(0);
//			if (c instanceof ValueStmtContext) {
//				return this.compileValueStatement((ValueStmtContext) c, method).getStatement();
//			} else {
//				return new BlockCompiler(method, this).compileBlockStatement(c);
//			}
//		}
//
//		public void mustBeArrayType(VbDecl decl) {
//		}
//
//		public static boolean isArgumentDeclsMatch(List<ArgumentDecl> arguments, List<ArgumentDecl> arguments2) {
//			return true;	// TODO
//		}
//
//		public void mustBeOject(VbVarType varType, ValueStmtContext valueStmt) {
//			// TODO
//		}
//
//		public void mustBeStringType(VbDecl varDecl) {
//		}
//
//		public void mustBeBaseType(VbVarType varType, ParserRuleContext ast) {
//		}
//
//		public void mustBeVariable(VbDecl varDecl) {
//		}
//

//}
