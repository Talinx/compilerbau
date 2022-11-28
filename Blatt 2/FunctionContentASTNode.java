import java.util.List;

public class FunctionContentASTNode extends ASTNode {
	List<ASTNode> statements;
	ASTNode returnExpr;
	
	public FunctionContentASTNode(List<ASTNode> statements, ASTNode returnExpr) {
		this.statements = statements;
		this.returnExpr = returnExpr;
	}
}
