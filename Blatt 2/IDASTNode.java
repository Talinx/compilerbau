import org.antlr.v4.runtime.Token;

public class IDASTNode extends ASTNode {
	Token classId;
	Token id;

	public IDASTNode(Token id) {
		this.id = id;
	}

	public IDASTNode(Token classId, Token id) {
		this.classId = classId;
		this.id = id;
	}
}
