package src.AstNodes;

public class LessASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public LessASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
