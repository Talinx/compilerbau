public class PlusASTNode extends ASTNode {
	ASTNode left;
	ASTNode right;

	public PlusASTNode(ASTNode left, ASTNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "PlusASTNode");
		System.out.println(baseIndentation(level) + "  left:");
		left.print(level+1);
		System.out.println(baseIndentation(level) + "  right:");
		right.print(level+1);
	}
}
