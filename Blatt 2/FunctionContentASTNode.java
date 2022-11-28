public class FunctionContentASTNode extends ASTNode {
	ASTNode returnExpr;
	
	public FunctionContentASTNode(ASTNode returnExpr) {
		this.returnExpr = returnExpr;
	}
}
