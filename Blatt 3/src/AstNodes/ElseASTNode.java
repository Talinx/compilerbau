package src.AstNodes;
public class ElseASTNode extends ASTNode {
	BodyASTNode body;
	
	public ElseASTNode(BodyASTNode body) {
		this.body = body;
	}
}
