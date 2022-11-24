public class MinusASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public MinusASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}
}
