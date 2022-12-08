import java.util.List;

public class CallMetaInfo {
	public IDASTNode id;
	public List<ASTNode> from;
	public List<ASTNode> nextLevel;

	CallMetaInfo(IDASTNode id, List<ASTNode> from) {
		this.id = id;
		this.from = from;
	}

	CallMetaInfo(IDASTNode id, List<ASTNode> from, List<ASTNode> nextLevel) {
		this.id = id;
		this.from = from;
		this.nextLevel = nextLevel;
	}
}
