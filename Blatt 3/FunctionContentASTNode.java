import java.util.List;

public class FunctionContentASTNode extends ASTNode {
	List<ASTNode> statements;
	ASTNode returnExpr;
	
	public FunctionContentASTNode(List<ASTNode> statements, ASTNode returnExpr) {
		this.statements = statements;
		this.returnExpr = returnExpr;
	}

	@Override
	public void print(int level) {
		for (ASTNode astNode : statements) {
			astNode.print(level);
		}
		if (returnExpr != null) {
			System.out.println(baseIndentation(level) + "return: ");
			returnExpr.print(level+1);
		}
	}
}
