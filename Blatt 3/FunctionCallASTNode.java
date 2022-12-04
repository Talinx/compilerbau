public class FunctionCallASTNode extends ASTNode {
	IDASTNode functionId;
	ArgumentsASTNode arguments;
	
	public FunctionCallASTNode(IDASTNode functionId, ArgumentsASTNode arguments) {
		this.functionId = functionId;
		this.arguments = arguments;
	}

	@Override
	public void print(int level) {
		System.out.print(baseIndentation(level) + "FunctionCall: " + functionId.id.getText());
		System.out.print(baseIndentation(level+1) + "Arguments: ");
		arguments.print(level+1);
	}

	
}
