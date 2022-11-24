public class FunctionCallASTNode extends ASTNode {
	IDASTNode functionId;
	ArgumentsASTNode arguments;
	
	public FunctionCallASTNode(IDASTNode functionId, ArgumentsASTNode arguments) {
		this.functionId = functionId;
		this.arguments = arguments;
	}
}
