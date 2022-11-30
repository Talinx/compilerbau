package src.AstNodes;

public class LessEqualsASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public LessEqualsASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
