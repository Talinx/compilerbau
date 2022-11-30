package src.AstNodes;
public class ElifASTNode extends ASTNode {
	ASTNode condition;
	BodyASTNode body;
	
	public ElifASTNode(ASTNode condition, BodyASTNode body) {
		this.condition = condition;
		this.body = body;
	}
}
