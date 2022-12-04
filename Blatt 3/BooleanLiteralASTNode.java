public class BooleanLiteralASTNode extends LiteralASTNode {
	boolean content;

	public BooleanLiteralASTNode(boolean value) {
		this.content = value;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "Boolean: " + this.content);
	}
}
