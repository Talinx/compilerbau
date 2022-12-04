import java.util.List;

public class CallMetaInfo {
	public IDASTNode id;
	public List<ASTNode> from;

	CallMetaInfo(IDASTNode id, List<ASTNode> from) {
		this.id = id;
		this.from = from;
	}
}
