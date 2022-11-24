public class FunctionContentASTNode extends ASTNode {
	BodyASTNode body;
	ASTNode returnExpr;
	
	public FunctionContentASTNode(BodyASTNode body, ASTNode returnExpr) {
		this.body = body;
		this.returnExpr = returnExpr;
	}
}
