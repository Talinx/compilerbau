package src.AstNodes;
public class BooleanLiteralASTNode extends LiteralASTNode {
	boolean content;

	public BooleanLiteralASTNode(boolean value) {
		this.content = value;
	}
}
