import java.util.List;

public class IfASTNode extends ASTNode {
	ASTNode condition;
	BodyASTNode body;
	List<ElifASTNode> elifs;
	ElseASTNode elsePart;
	
	public IfASTNode(ASTNode condition, BodyASTNode body, List<ElifASTNode> elifs, ElseASTNode elsePart) {
		this.condition = condition;
		this.body = body;
		this.elifs = elifs;
		this.elsePart = elsePart;
	}

	@Override
	public void print(int level) {
		System.out.println(baseIndentation(level) + "IfASTNode");
		System.out.println(baseIndentation(level+1) + "Condition:");
		condition.print(level+1);
		System.out.println(baseIndentation(level+1) + "Body:");
		body.print(level+1);
		for (ElifASTNode elifASTNode : elifs) {
			elifASTNode.print(level);
		}
		if (elsePart != null) {
			elsePart.print(level);
		}
	}
}
