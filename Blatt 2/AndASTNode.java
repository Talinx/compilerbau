public class AndASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public AndASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
