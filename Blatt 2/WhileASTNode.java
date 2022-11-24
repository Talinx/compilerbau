public class WhileASTNode extends ASTNode {
	ASTNode condition;
	BodyASTNode body;
	
	public WhileASTNode(ASTNode condition, BodyASTNode body) {
		this.condition = condition;
		this.body = body;
	}
}
