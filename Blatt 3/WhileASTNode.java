public class WhileASTNode extends ASTNode {
	ASTNode condition;
	BodyASTNode body;
	
	public WhileASTNode(ASTNode condition, BodyASTNode body) {
		this.condition = condition;
		this.body = body;
	}

	public BodyASTNode getBody() {
		return this.body;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "WhileASTNode");
		System.out.println(baseIndentation(level+1) + "Condition:");
		condition.print(level+1);
		System.out.println(baseIndentation(level+1) + "Body:");
		body.print(level+1);
	}
}
