public class StringLiteralASTNode extends LiteralASTNode {
	String content;

	public StringLiteralASTNode(String text) {
		this.content = text;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "String: " + content);
	}
}
