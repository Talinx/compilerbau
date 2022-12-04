public class ElifASTNode extends ASTNode {
	ASTNode condition;
	BodyASTNode body;
	
	public ElifASTNode(ASTNode condition, BodyASTNode body) {
		this.condition = condition;
		this.body = body;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "ElifASTNode");
		System.out.println(baseIndentation(level+1) + "Condition:");
		condition.print(level+1);
		System.out.println(baseIndentation(level+1) + "Body:");
		body.print(level+1);
	}
}
