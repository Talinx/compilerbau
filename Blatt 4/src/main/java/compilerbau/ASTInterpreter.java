package compilerbau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.StringBuilder;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import compilerbau.ASTNodes.ASTNode;
import compilerbau.ASTNodes.BooleanLiteralASTNode;
import compilerbau.ASTNodes.FunctionCallASTNode;
import compilerbau.ASTNodes.FunctionDefinitionASTNode;
import compilerbau.ASTNodes.IDASTNode;
import compilerbau.ASTNodes.IntLiteralASTNode;
import compilerbau.ASTNodes.PlusASTNode;
import compilerbau.ASTNodes.MinusASTNode;
import compilerbau.ASTNodes.MulASTNode;
import compilerbau.ASTNodes.DivASTNode;
import compilerbau.ASTNodes.EqualsASTNode;
import compilerbau.ASTNodes.NotEqualsASTNode;
import compilerbau.ASTNodes.LessASTNode;
import compilerbau.ASTNodes.LessEqualsASTNode;
import compilerbau.ASTNodes.GreaterASTNode;
import compilerbau.ASTNodes.GreaterEqualsASTNode;
import compilerbau.ASTNodes.AndASTNode;
import compilerbau.ASTNodes.OrASTNode;
import compilerbau.ASTNodes.IfASTNode;
import compilerbau.ASTNodes.ElifASTNode;
import compilerbau.ASTNodes.WhileASTNode;
import compilerbau.ASTNodes.StringLiteralASTNode;
import compilerbau.ASTNodes.VariableAssignmentASTNode;
import compilerbau.Environment;

class ASTInterpreter {
	AST ast;
	Scope topLevel, currentScope;
	Map<Symbol, ASTNode> links;

    List<AST> interactiveASTs;
    Environment interactiveEnvironment, currentEnvironment;

    public ASTInterpreter() {
        this.interactiveASTs = new ArrayList<>();
        this.interactiveEnvironment = new BuiltinEnvironment();
        this.currentEnvironment = new Environment();
        this.currentEnvironment = this.interactiveEnvironment;
    }

	public ASTInterpreter(AST ast, Scope scope) {
		this.ast = ast;
		this.topLevel = scope;
		this.currentScope = scope;
		this.links = new HashMap<>();
	}
	
	public void interpret() {
		this.constructLinks(this.ast, this.topLevel);
		List<ASTNode> nodes = this.ast.getContent();
		for (int i = 0; i < nodes.size(); i++) {
			this.currentScope = this.topLevel;
			this.interpretASTNode(nodes.get(i));
		}
	}

    public void interpretInteractive(String input) {
        var inputStream = CharStreams.fromString(input);
        var lexer = new MiniPythonLexer(inputStream);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new MiniPythonParser(tokenStream);
        var cst = parser.startfile();
        var astVisitor = new ASTVisitor();
        var ast = (AST) astVisitor.visitStartfile(cst);

		List<ASTNode> nodes = ast.getContent();
		for (int i = 0; i < nodes.size(); i++) {
			this.interpretASTNodeInteractive(nodes.get(i));
		}
    }

	private void constructLinks(ASTNode node, Scope currentScope) {
		Symbol symbol;
		AST ast;
		FunctionDefinitionASTNode functionDefinitionASTNode;
		if (node instanceof AST) {
			ast = (AST) node;
			for (ASTNode n : ast.getContent()) {
				this.constructLinks(n, currentScope);
			}
		} else
		if (node instanceof FunctionDefinitionASTNode) {
			functionDefinitionASTNode = (FunctionDefinitionASTNode) node;
			symbol = currentScope.resolve(functionDefinitionASTNode.getId().getText());
			links.put(symbol, functionDefinitionASTNode);
		}
	}

	private InterpreterContext interpretASTNode(FunctionDefinitionASTNode node, List<InterpreterContext> contexts) {
		List<ASTNode> body = node.getBody();
		InterpreterContext output = null;
		for (int i = 0; i < body.size(); i++) {
			output = interpretASTNode(body.get(i));
		}
		return output;
	}

	private InterpreterContext interpretASTNode(ASTNode node) {
		Symbol symbol;
		FunctionCallASTNode functionCallASTNode;
		VariableAssignmentASTNode variableAssignmentASTNode;
		PlusASTNode plusASTNode;
		MinusASTNode minusASTNode;
		MulASTNode mulASTNode;
		DivASTNode divASTNode;
		EqualsASTNode equalsASTNode;
		NotEqualsASTNode notEqualsASTNode;
		LessASTNode lessASTNode;
		LessEqualsASTNode lessEqualsASTNode;
		GreaterASTNode greaterASTNode;
		GreaterEqualsASTNode greaterEqualsASTNode;
		AndASTNode andASTNode;
		OrASTNode orASTNode;
		IfASTNode ifASTNode;
		WhileASTNode whileASTNode;
		IDASTNode idASTNode;
		List<ASTNode> astNodes;
		InterpreterContext context, left, right, condition;
		Scope stackScope; // for saving the current scope on the stack of this function call
		ClassScope currentClassScope;
		ASTNode tempNode;
		FunctionDefinitionASTNode functionDefinitionASTNode;
		if (node instanceof IntLiteralASTNode) {
			return InterpreterContext.from((IntLiteralASTNode) node);
		} else
		if (node instanceof StringLiteralASTNode) {
			return InterpreterContext.from((StringLiteralASTNode) node);
		} else
		if (node instanceof BooleanLiteralASTNode) {
			return InterpreterContext.from((BooleanLiteralASTNode) node);
		} else
		if (node instanceof FunctionCallASTNode) {
			functionCallASTNode = (FunctionCallASTNode) node;
			symbol = currentScope.resolve(functionCallASTNode.getId().getText());
			if (symbol == null) {
				// throw error
				System.err.println("Function " + functionCallASTNode.getId().getText() + " not found.");
			}
			if (!(symbol.getType() instanceof FunctionType)) {
				// throw error
				System.err.println("Not a function: " + functionCallASTNode.getId().getText() + ". Got type " + symbol.getType() + " instead.");
			}
			astNodes = functionCallASTNode.getArguments();
			List<InterpreterContext> contexts = new ArrayList<>(astNodes.size());
			for (int i = 0; i < astNodes.size(); i++) {
				contexts.add(this.interpretASTNode(astNodes.get(i)));
			}
			if (symbol.getScope() instanceof BuiltinIdsScope) {
				switch(symbol.getId()) {
				case "print":
					for (int i = 0; i < contexts.size(); i++) {
						switch (contexts.get(i).getEvalType()) {
						case NONE:
							System.out.print("None");
							break;
						case INTEGER:
							System.out.print(contexts.get(i).getIntValue());
							break;
						case STRING:
							System.out.print(contexts.get(i).getStringValue());
							break;
						case BOOLEAN:
							System.out.print(contexts.get(i).getBooleanValue());
							break;
						}
						if (i+1 < contexts.size()) {
							System.out.print(" ");
						} else {
							System.out.print("\n");
						}
					}
					return new InterpreterContext(ExprEvalType.NONE);
				default:
					tempNode = links.get(symbol);
					if (tempNode == null || !(tempNode instanceof FunctionDefinitionASTNode)) {
						System.err.println("Not a built-in function: " + functionCallASTNode.getId().getText());
					} else {
						System.out.println("Function call for: " + functionCallASTNode.getId().getText());
						return interpretASTNode((FunctionDefinitionASTNode) tempNode, contexts);
					}
				}
			} else {
				// handle function call
				tempNode = links.get(symbol);
				if (tempNode == null || !(tempNode instanceof FunctionDefinitionASTNode)) {
					System.err.println("Function not found: " + functionCallASTNode.getId().getText());
				} else {
					System.out.println("Function call for: " + functionCallASTNode.getId().getText());
					return interpretASTNode((FunctionDefinitionASTNode) tempNode, contexts);
				}
			}
		} else
		if (node instanceof VariableAssignmentASTNode) {
			variableAssignmentASTNode = (VariableAssignmentASTNode) node;
			stackScope = this.currentScope;
			context = this.interpretASTNode(variableAssignmentASTNode.getExpr());
			symbol = stackScope.resolve(variableAssignmentASTNode.getId().getTextId());
			if (symbol == null) {
				// create new variable in current scope
				symbol = new Symbol(variableAssignmentASTNode.getId().getTextId());
				if (variableAssignmentASTNode.getId().belongsToClass()) {
					stackScope = stackScope.resolveClass(variableAssignmentASTNode.getId().getTextClass());
				}
				stackScope.bind(symbol);
			}
			stackScope.setValue(variableAssignmentASTNode.getId().getTextId(), context);
			return context;
		} else
		if (node instanceof PlusASTNode) {
			plusASTNode = (PlusASTNode) node;
			left = this.interpretASTNode(plusASTNode.getLeft());
			right = this.interpretASTNode(plusASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() + right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue() + right.getStringValue());
				case BOOLEAN:
					int trueCount = 0;
					if (left.getBooleanValue()) {
						trueCount++;
					}
					if (right.getBooleanValue()) {
						trueCount++;
					}
					return new InterpreterContext(trueCount);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Plus operands have different types.");
			}
		} else
		if (node instanceof MinusASTNode) {
			minusASTNode = (MinusASTNode) node;
			left = this.interpretASTNode(minusASTNode.getLeft());
			right = this.interpretASTNode(minusASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() - right.getIntValue());
				case BOOLEAN:
					int minusBooleans = 0;
					if (left.getBooleanValue()) {
						minusBooleans++;
					}
					if (right.getBooleanValue()) {
						minusBooleans--;
					}
					return new InterpreterContext(minusBooleans);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Minus operands have different types.");
			}
		} else
		if (node instanceof MulASTNode) {
			mulASTNode = (MulASTNode) node;
			left = this.interpretASTNode(mulASTNode.getLeft());
			right = this.interpretASTNode(mulASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() * right.getIntValue());
				case BOOLEAN:
					int mulBooleans = 0;
					if (left.getBooleanValue() && right.getBooleanValue()) {
						mulBooleans = 1;
					}
					return new InterpreterContext(mulBooleans);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				if (left.getEvalType() == ExprEvalType.STRING && right.getEvalType() == ExprEvalType.INTEGER) {
					StringBuilder mulBuilder = new StringBuilder();
					for (int i = 0; i < right.getIntValue(); i++) {
						mulBuilder.append(right.getStringValue());
					}
					return new InterpreterContext(mulBuilder.toString());
				} else {
					// TODO: throw error
					System.err.println("Mul operands have different types.");
				}
			}
		} else
		if (node instanceof DivASTNode) {
			divASTNode = (DivASTNode) node;
			left = this.interpretASTNode(divASTNode.getLeft());
			right = this.interpretASTNode(divASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					if (right.getIntValue() == 0) {
						// TODO: throw error
						System.err.println("Zero division");
					} else {
						return new InterpreterContext(left.getIntValue() / right.getIntValue());
					}
				case BOOLEAN:
					if (!right.getBooleanValue()) {
						// TODO: throw error
						System.err.println("Zero division");
					} else {
						if (left.getBooleanValue()) {
							return new InterpreterContext(1);
						}
						return new InterpreterContext(0);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Div operands have different types.");
			}
		} else
		if (node instanceof EqualsASTNode) {
			equalsASTNode = (EqualsASTNode) node;
			left = this.interpretASTNode(equalsASTNode.getLeft());
			right = this.interpretASTNode(equalsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() == right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().equals(right.getStringValue()));
				case BOOLEAN:
					return new InterpreterContext(left.getBooleanValue() == right.getBooleanValue());
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				if (left.getEvalType() == ExprEvalType.INTEGER && right.getEvalType() == ExprEvalType.BOOLEAN) {
					if (right.getBooleanValue()) {
						return new InterpreterContext(left.getIntValue() == 1);
					}
					return new InterpreterContext(left.getIntValue() == 0);
				}
				if (right.getEvalType() == ExprEvalType.INTEGER && left.getEvalType() == ExprEvalType.BOOLEAN) {
					if (left.getBooleanValue()) {
						return new InterpreterContext(right.getIntValue() == 1);
					}
					return new InterpreterContext(right.getIntValue() == 0);
				}
				return new InterpreterContext(false);
			}
		} else
		if (node instanceof NotEqualsASTNode) {
			notEqualsASTNode = (NotEqualsASTNode) node;
			equalsASTNode = new EqualsASTNode(notEqualsASTNode.getLeft(), notEqualsASTNode.getRight());
			var equalsContext = this.interpretASTNode(equalsASTNode);
			if (equalsContext.getBooleanValue()) {
				return new InterpreterContext(false);
			}
			return new InterpreterContext(true);
		} else
		if (node instanceof LessASTNode) {
			lessASTNode = (LessASTNode) node;
			left = this.interpretASTNode(lessASTNode.getLeft());
			right = this.interpretASTNode(lessASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() < right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() < right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						if (right.getBooleanValue()) {
							return new InterpreterContext(true);
						}
						return new InterpreterContext(false);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Less operands have different types.");
			}
		} else
		if (node instanceof LessEqualsASTNode) {
			lessEqualsASTNode = (LessEqualsASTNode) node;
			left = this.interpretASTNode(lessEqualsASTNode.getLeft());
			right = this.interpretASTNode(lessEqualsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() <= right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() <= right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue() == right.getBooleanValue()) {
						return new InterpreterContext(true);
					}
					if (left.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						return new InterpreterContext(true);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Less equals operands have different types.");
			}
		} else
		if (node instanceof GreaterASTNode) {
			greaterASTNode = (GreaterASTNode) node;
			left = this.interpretASTNode(greaterASTNode.getLeft());
			right = this.interpretASTNode(greaterASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() > right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() > right.getStringValue().length());
				case BOOLEAN:
					if (right.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						if (left.getBooleanValue()) {
							return new InterpreterContext(true);
						}
						return new InterpreterContext(false);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Greater operands have different types.");
			}
		} else
		if (node instanceof GreaterEqualsASTNode) {
			greaterEqualsASTNode = (GreaterEqualsASTNode) node;
			left = this.interpretASTNode(greaterEqualsASTNode.getLeft());
			right = this.interpretASTNode(greaterEqualsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() >= right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() >= right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue() == right.getBooleanValue()) {
						return new InterpreterContext(true);
					}
					if (right.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						return new InterpreterContext(true);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Greater equals operands have different types.");
			}
		} else
		if (node instanceof AndASTNode) {
			andASTNode = (AndASTNode) node;
			left = this.interpretASTNode(andASTNode.getLeft());
			if (left.isTruthy()) {
				right = this.interpretASTNode(andASTNode.getRight());
				return right;
			}
			return left;
		} else
		if (node instanceof OrASTNode) {
			orASTNode = (OrASTNode) node;
			left = this.interpretASTNode(orASTNode.getLeft());
			if (left.isTruthy()) {
				return left;
			}
			right = this.interpretASTNode(orASTNode.getRight());
			return right;
		} else
		if (node instanceof IfASTNode) {
			ifASTNode = (IfASTNode) node;
			condition = this.interpretASTNode(ifASTNode.getCondition());
			if (condition.isTruthy()) {
				return this.interpretASTNode(ifASTNode.getBody());
			}
			var elifs = ifASTNode.getElifs();
			for (int i = 0; i < elifs.size(); i++) {
				ElifASTNode cNode = elifs.get(i);
				condition = this.interpretASTNode(cNode.getCondition());
				if (condition.isTruthy()) {
					return this.interpretASTNode(cNode.getBody());
				}
			}
			var elseNode = ifASTNode.getElse();
			if (elseNode != null) {
				return this.interpretASTNode(elseNode.getBody());
			}
			return new InterpreterContext(ExprEvalType.NONE);
		} else
		if (node instanceof WhileASTNode) {
			whileASTNode = (WhileASTNode) node;
			condition = this.interpretASTNode(whileASTNode.getCondition());
			while (condition.isTruthy()) {
				this.interpretASTNode(whileASTNode.getBody());
				condition = this.interpretASTNode(whileASTNode.getCondition());
			}
			return new InterpreterContext(ExprEvalType.NONE);
		} else
		if (node instanceof IDASTNode) {
			idASTNode = (IDASTNode) node;
			stackScope = this.currentScope;
			if (idASTNode.belongsToClass()) {
				stackScope = stackScope.resolveClass(idASTNode.getTextClass());
			}
			context = stackScope.getValue(idASTNode.getTextId());
			if (context == null) {
				return new InterpreterContext(ExprEvalType.NONE);
			}
			return context;
		}
		return new InterpreterContext(ExprEvalType.NONE);
	}

    private InterpreterContext interpretASTNodeInteractive(ASTNode node) {
		FunctionCallASTNode functionCallASTNode;
		VariableAssignmentASTNode variableAssignmentASTNode;
		InterpreterContext left, right, condition;
		PlusASTNode plusASTNode;
		MinusASTNode minusASTNode;
		MulASTNode mulASTNode;
		DivASTNode divASTNode;
		EqualsASTNode equalsASTNode;
		NotEqualsASTNode notEqualsASTNode;
		LessASTNode lessASTNode;
		LessEqualsASTNode lessEqualsASTNode;
		GreaterASTNode greaterASTNode;
		GreaterEqualsASTNode greaterEqualsASTNode;
		AndASTNode andASTNode;
		OrASTNode orASTNode;
		IDASTNode idASTNode;
		IfASTNode ifASTNode;
		WhileASTNode whileASTNode;
		InterpreterContext context;
		if (node instanceof IntLiteralASTNode) {
			return InterpreterContext.from((IntLiteralASTNode) node);
		} else
		if (node instanceof StringLiteralASTNode) {
			return InterpreterContext.from((StringLiteralASTNode) node);
		} else
		if (node instanceof BooleanLiteralASTNode) {
			return InterpreterContext.from((BooleanLiteralASTNode) node);
		} else
		if (node instanceof FunctionCallASTNode) {
			functionCallASTNode = (FunctionCallASTNode) node;
			context = currentEnvironment.getValue(functionCallASTNode.getId().getText());
			if (context == null) {
				// throw error
				System.err.println("Function " + functionCallASTNode.getId().getText() + " not found.");
			}
            if (context.getEvalType() == ExprEvalType.BUILTINFUNC) {
                var paramAstNodes = functionCallASTNode.getArguments();
                if (paramAstNodes.size() != 1) {
                    System.err.println("Function " + functionCallASTNode.getId().getText() + " expected " + 
                                        1 + " Arguments but got " + paramAstNodes.size());
                    return null;
                }
                var value = interpretASTNodeInteractive(paramAstNodes.get(0));
                switch (value.getEvalType()) {
                    case INTEGER:
                        context.JavaConsRefV.accept(Integer.toString(value.getIntValue()));
                        break;
                    case STRING:
                        context.JavaConsRefV.accept(value.getStringValue());
                        break;
                    case BOOLEAN:
                        if (value.getBooleanValue())
                            context.JavaConsRefV.accept("True");
                        else
                            context.JavaConsRefV.accept("False");
                        break;
                    default:
                        break;
                }
                return null;
            }
			if (!(context.getEvalType() == ExprEvalType.FUNCASTNODE)) {
				// throw error
				System.err.println("Function " + functionCallASTNode.getId().getText() + " not found.");
			}

			var paramAstNodes = functionCallASTNode.getArguments();
            var argAstNodes = context.AstRefV.getParametersASTNodes();
            
            if (paramAstNodes.size() != argAstNodes.size()) {
                System.err.println("Function " + functionCallASTNode.getId().getText() + " expected " + 
                                    argAstNodes.size() + " Arguments but got " + paramAstNodes.size());
                return null;
            }

            var paramEnv = new Environment(currentEnvironment);
            currentEnvironment = paramEnv;
            
            for (int i = 0; i < paramAstNodes.size(); i++) {
                var name = argAstNodes.get(i).getId().id.getText();
                var value = interpretASTNodeInteractive(paramAstNodes.get(i));
                if (value == null) {
                    System.err.println("Argument " + i + " of Function " + functionCallASTNode.getId().getText() + "could not be interpreted");
                    return null;
                }
                paramEnv.setValue(name, value);
            }
            
            var bodyEnv = new Environment(currentEnvironment);
            currentEnvironment = bodyEnv;
            
            for (var bodyNode : context.AstRefV.getBody()) {
                interpretASTNodeInteractive(bodyNode);
            }

            var oldBodyEnv = currentEnvironment;
            currentEnvironment = currentEnvironment.enclosingEnv;
            oldBodyEnv.enclosingEnv = null;

            var oldParamEnv = currentEnvironment;
            currentEnvironment = currentEnvironment.enclosingEnv;
            oldParamEnv.enclosingEnv = null;
		} else
		if (node instanceof VariableAssignmentASTNode) {
			variableAssignmentASTNode = (VariableAssignmentASTNode) node;
            var name = variableAssignmentASTNode.getId().id.getText();
			var value = this.interpretASTNodeInteractive(variableAssignmentASTNode.getExpr());
            
            currentEnvironment.setValue(name, value);
			return null;
		} else
		if (node instanceof PlusASTNode) {
			plusASTNode = (PlusASTNode) node;
			left = this.interpretASTNodeInteractive(plusASTNode.getLeft());
			right = this.interpretASTNodeInteractive(plusASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() + right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue() + right.getStringValue());
				case BOOLEAN:
					int trueCount = 0;
					if (left.getBooleanValue()) {
						trueCount++;
					}
					if (right.getBooleanValue()) {
						trueCount++;
					}
					return new InterpreterContext(trueCount);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Plus operands have different types.");
			}
		} else
		if (node instanceof MinusASTNode) {
			minusASTNode = (MinusASTNode) node;
			left = this.interpretASTNodeInteractive(minusASTNode.getLeft());
			right = this.interpretASTNodeInteractive(minusASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() - right.getIntValue());
				case BOOLEAN:
					int minusBooleans = 0;
					if (left.getBooleanValue()) {
						minusBooleans++;
					}
					if (right.getBooleanValue()) {
						minusBooleans--;
					}
					return new InterpreterContext(minusBooleans);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Minus operands have different types.");
			}
		} else
		if (node instanceof MulASTNode) {
			mulASTNode = (MulASTNode) node;
			left = this.interpretASTNodeInteractive(mulASTNode.getLeft());
			right = this.interpretASTNodeInteractive(mulASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() * right.getIntValue());
				case BOOLEAN:
					int mulBooleans = 0;
					if (left.getBooleanValue() && right.getBooleanValue()) {
						mulBooleans = 1;
					}
					return new InterpreterContext(mulBooleans);
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				if (left.getEvalType() == ExprEvalType.STRING && right.getEvalType() == ExprEvalType.INTEGER) {
					StringBuilder mulBuilder = new StringBuilder();
					for (int i = 0; i < right.getIntValue(); i++) {
						mulBuilder.append(right.getStringValue());
					}
					return new InterpreterContext(mulBuilder.toString());
				} else {
					// TODO: throw error
					System.err.println("Mul operands have different types.");
				}
			}
		} else
		if (node instanceof DivASTNode) {
			divASTNode = (DivASTNode) node;
			left = this.interpretASTNodeInteractive(divASTNode.getLeft());
			right = this.interpretASTNodeInteractive(divASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					if (right.getIntValue() == 0) {
						// TODO: throw error
						System.err.println("Zero division");
					} else {
						return new InterpreterContext(left.getIntValue() / right.getIntValue());
					}
				case BOOLEAN:
					if (!right.getBooleanValue()) {
						// TODO: throw error
						System.err.println("Zero division");
					} else {
						if (left.getBooleanValue()) {
							return new InterpreterContext(1);
						}
						return new InterpreterContext(0);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Div operands have different types.");
			}
		} else
		if (node instanceof EqualsASTNode) {
			equalsASTNode = (EqualsASTNode) node;
			left = this.interpretASTNodeInteractive(equalsASTNode.getLeft());
			right = this.interpretASTNodeInteractive(equalsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() == right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().equals(right.getStringValue()));
				case BOOLEAN:
					return new InterpreterContext(left.getBooleanValue() == right.getBooleanValue());
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				if (left.getEvalType() == ExprEvalType.INTEGER && right.getEvalType() == ExprEvalType.BOOLEAN) {
					if (right.getBooleanValue()) {
						return new InterpreterContext(left.getIntValue() == 1);
					}
					return new InterpreterContext(left.getIntValue() == 0);
				}
				if (right.getEvalType() == ExprEvalType.INTEGER && left.getEvalType() == ExprEvalType.BOOLEAN) {
					if (left.getBooleanValue()) {
						return new InterpreterContext(right.getIntValue() == 1);
					}
					return new InterpreterContext(right.getIntValue() == 0);
				}
				return new InterpreterContext(false);
			}
		} else
		if (node instanceof NotEqualsASTNode) {
			notEqualsASTNode = (NotEqualsASTNode) node;
			equalsASTNode = new EqualsASTNode(notEqualsASTNode.getLeft(), notEqualsASTNode.getRight());
			var equalsContext = this.interpretASTNodeInteractive(equalsASTNode);
			if (equalsContext.getBooleanValue()) {
				return new InterpreterContext(false);
			}
			return new InterpreterContext(true);
		} else
		if (node instanceof LessASTNode) {
			lessASTNode = (LessASTNode) node;
			left = this.interpretASTNodeInteractive(lessASTNode.getLeft());
			right = this.interpretASTNodeInteractive(lessASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() < right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() < right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						if (right.getBooleanValue()) {
							return new InterpreterContext(true);
						}
						return new InterpreterContext(false);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Less operands have different types.");
			}
		} else
		if (node instanceof LessEqualsASTNode) {
			lessEqualsASTNode = (LessEqualsASTNode) node;
			left = this.interpretASTNodeInteractive(lessEqualsASTNode.getLeft());
			right = this.interpretASTNodeInteractive(lessEqualsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() <= right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() <= right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue() == right.getBooleanValue()) {
						return new InterpreterContext(true);
					}
					if (left.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						return new InterpreterContext(true);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Less equals operands have different types.");
			}
		} else
		if (node instanceof GreaterASTNode) {
			greaterASTNode = (GreaterASTNode) node;
			left = this.interpretASTNodeInteractive(greaterASTNode.getLeft());
			right = this.interpretASTNodeInteractive(greaterASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() > right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() > right.getStringValue().length());
				case BOOLEAN:
					if (right.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						if (left.getBooleanValue()) {
							return new InterpreterContext(true);
						}
						return new InterpreterContext(false);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Greater operands have different types.");
			}
		} else
		if (node instanceof GreaterEqualsASTNode) {
			greaterEqualsASTNode = (GreaterEqualsASTNode) node;
			left = this.interpretASTNodeInteractive(greaterEqualsASTNode.getLeft());
			right = this.interpretASTNodeInteractive(greaterEqualsASTNode.getRight());
			if (left.getEvalType() == right.getEvalType()) {
				switch(left.getEvalType()) {
				case INTEGER:
					return new InterpreterContext(left.getIntValue() >= right.getIntValue());
				case STRING:
					return new InterpreterContext(left.getStringValue().length() >= right.getStringValue().length());
				case BOOLEAN:
					if (left.getBooleanValue() == right.getBooleanValue()) {
						return new InterpreterContext(true);
					}
					if (right.getBooleanValue()) {
						return new InterpreterContext(false);
					} else {
						return new InterpreterContext(true);
					}
				default:
					// TODO: throw error
					System.err.println("Unsupported operands.");
				}
			} else {
				// TODO: throw error
				System.err.println("Greater equals operands have different types.");
			}
		} else
		if (node instanceof AndASTNode) {
			andASTNode = (AndASTNode) node;
			left = this.interpretASTNodeInteractive(andASTNode.getLeft());
			if (left.isTruthy()) {
				right = this.interpretASTNodeInteractive(andASTNode.getRight());
				return right;
			}
			return left;
		} else
		if (node instanceof OrASTNode) {
			orASTNode = (OrASTNode) node;
			left = this.interpretASTNodeInteractive(orASTNode.getLeft());
			if (left.isTruthy()) {
				return left;
			}
			right = this.interpretASTNodeInteractive(orASTNode.getRight());
			return right;
		} else
		if (node instanceof IfASTNode) {
			ifASTNode = (IfASTNode) node;
			condition = this.interpretASTNodeInteractive(ifASTNode.getCondition());
			if (condition.isTruthy()) {
				return this.interpretASTNodeInteractive(ifASTNode.getBody());
			}
			var elifs = ifASTNode.getElifs();
			for (int i = 0; i < elifs.size(); i++) {
				ElifASTNode cNode = elifs.get(i);
				condition = this.interpretASTNodeInteractive(cNode.getCondition());
				if (condition.isTruthy()) {
					return this.interpretASTNodeInteractive(cNode.getBody());
				}
			}
			var elseNode = ifASTNode.getElse();
			if (elseNode != null) {
				return this.interpretASTNodeInteractive(elseNode.getBody());
			}
			return new InterpreterContext(ExprEvalType.NONE);
		} else
		if (node instanceof WhileASTNode) {
			whileASTNode = (WhileASTNode) node;
			condition = this.interpretASTNodeInteractive(whileASTNode.getCondition());
			while (condition.isTruthy()) {
				this.interpretASTNodeInteractive(whileASTNode.getBody());
				condition = this.interpretASTNodeInteractive(whileASTNode.getCondition());
			}
			return new InterpreterContext(ExprEvalType.NONE);
		} else
		if (node instanceof IDASTNode) {
			idASTNode = (IDASTNode) node;
			// if (idASTNode.belongsToClass()) {
			// 	stackScope = currentEnvironment.resolveClass(idASTNode.getTextClass());
			// }
			context = currentEnvironment.getValue(idASTNode.getTextId());
			if (context == null) {
				return new InterpreterContext(ExprEvalType.NONE);
			}
			return context;
		}
		return new InterpreterContext(ExprEvalType.NONE);
	}
}
