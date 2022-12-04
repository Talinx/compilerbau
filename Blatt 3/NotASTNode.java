public class NotASTNode extends ASTNode {
	ASTNode child;

	public NotASTNode(ASTNode child) {
		this.child = child;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "NotASTNode");
		child.print(level+1);
	}
}
