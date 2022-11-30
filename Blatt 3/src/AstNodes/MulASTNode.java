package src.AstNodes;

public class MulASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public MulASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
