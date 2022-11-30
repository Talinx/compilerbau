package src.AstNodes;

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
}
