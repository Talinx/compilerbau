package src.AstNodes;

public class NotASTNode extends ASTNode {
	ASTNode child;

	public NotASTNode(ASTNode child) {
		this.child = child;
	}
}
