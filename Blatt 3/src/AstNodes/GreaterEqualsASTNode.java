package src.AstNodes;
public class GreaterEqualsASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public GreaterEqualsASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
