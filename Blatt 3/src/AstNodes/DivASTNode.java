package src.AstNodes;

public class DivASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public DivASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
