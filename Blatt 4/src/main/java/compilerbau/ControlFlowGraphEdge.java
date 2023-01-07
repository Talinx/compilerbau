package compilerbau;

public class ControlFlowGraphEdge<T> {
	T from, to;

	ControlFlowGraphEdge(T from, T to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Edge from " + this.from + " to " + this.to;
	}
}
