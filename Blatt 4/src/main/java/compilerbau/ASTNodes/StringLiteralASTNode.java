package compilerbau.ASTNodes;
public class StringLiteralASTNode extends LiteralASTNode {
	String content;

	public StringLiteralASTNode(String text) {
		this.content = text;
	}

	public String getContent() {
		return this.content;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "String: " + content);
	}

	@Override
	public String toString() {
    	return content + " (" + super.toString() + ")";
    }
}
