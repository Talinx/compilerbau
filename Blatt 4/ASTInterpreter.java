import java.util.List;
import java.util.ArrayList;

class ASTInterpreter {
	AST ast;
	Scope topLevel, currentScope;

	public ASTInterpreter(AST ast, Scope scope) {
		this.ast = ast;
		this.topLevel = scope;
		this.currentScope = scope;
	}
	
	public void interpret() {
		List<ASTNode> nodes = this.ast.getContent();
		for (int i = 0; i < nodes.size(); i++) {
			this.currentScope = this.topLevel;
			this.interpretASTNode(nodes.get(i));
		}
	}

	private InterpreterContext interpretASTNode(ASTNode node) {
		Symbol symbol;
		FunctionCallASTNode functionCallASTNode;
		VariableAssignmentASTNode variableAssignmentASTNode;
		PlusASTNode plusASTNode;
		IDASTNode idASTNode;
		List<ASTNode> astNodes;
		InterpreterContext context, left, right;
		Scope stackScope; // for saving the current scope on the stack of this function call
		ClassScope currentClassScope;
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
					System.err.println("Not a built-in function: " + functionCallASTNode.getId().getText());
				}
			} else {
				// handle function call
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
}
