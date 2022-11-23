public class NotEqualsASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public NotEqualsASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
