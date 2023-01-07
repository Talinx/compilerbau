package compilerbau.ASTNodes;
import java.util.List;
import java.util.ArrayList;

public class FunctionContentASTNode extends ASTNode {
	List<ASTNode> statements;
	ASTNode returnExpr;
	
	public FunctionContentASTNode(List<ASTNode> statements, ASTNode returnExpr) {
		this.statements = statements;
		this.returnExpr = returnExpr;
	}

	public List<ASTNode> getBody() {
		List<ASTNode> output = new ArrayList<ASTNode>();
		for (int i = 0; i < this.statements.size(); i++) {
			output.add(this.statements.get(i));
		}
		if (this.returnExpr != null) {
			output.add(returnExpr);
		}
		return output;
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
