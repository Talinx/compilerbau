public class Symbol {
	String id;
	Type type;
	Scope scope;

	public Symbol(String id) {
		this.id = id;
		this.type = null;
		this.scope = null;
	}

	public Symbol(String id, Type type) {
		this.id = id;
		this.type = type;
		this.scope = null;
	}

	public String getId() {
		return this.id;
	}

	public Type getType() {
		return this.type;
	}

	public Scope getScope() {
		return this.scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}
}
