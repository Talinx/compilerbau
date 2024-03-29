package compilerbau.ASTNodes;
import org.antlr.v4.runtime.Token;

public class IDASTNode extends ASTNode {
	public Token classId;
	public Token id;

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

	public boolean belongsToClass() {
		return this.classId != null;
	}

	@Override
	public void print(int level) {
		System.out.println(id.getText());
	}

    public String getText() {
    	if (classId == null) {
        	return id.getText();
    	}
    	return classId.getText() + "." + id.getText();
    }

    public String getTextClass() {
    	if (classId == null) {
    		return null;
    	}
    	return classId.getText();
    }

    public String getTextId() {
    	return id.getText();
    }

	@Override
    public String toString() {
    	if (classId == null) {
        	return id.getText() + " (" + super.toString() + ")";
    	}
    	return classId.getText() + "." + id.getText() + " (" + super.toString() + ")";
    }
}
