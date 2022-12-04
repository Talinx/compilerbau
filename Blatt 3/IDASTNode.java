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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IDASTNode) {
			IDASTNode otherId = (IDASTNode) obj;
			if (otherId.id.getText().equals(this.id.getText())) {
				if (otherId.classId == null) {
					return this.classId == null;
				} else {
					return otherId.classId.getText().equals(this.classId.getText());
				}
			}
			return false;
		}
		return false;
	}

	@Override
	public void print(int level) {
		System.out.println(id.getText());
	}
}
