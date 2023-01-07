package compilerbau;

import java.util.Map;
import java.util.HashMap;

public class Scope {
	Scope enclosingScope;
	Map<String, Symbol> symbols;
	Map<String, InterpreterContext> contexts;
	Map<String, Scope> innerScopes;

	public Scope() {
		this.enclosingScope = null;
		this.symbols = new HashMap<String, Symbol>();
		this.contexts = new HashMap<String, InterpreterContext>();
		this.innerScopes = new HashMap<String, Scope>();
	}

	public Scope(Scope enclosingScope) {
		this.enclosingScope = enclosingScope;
		this.symbols = new HashMap<String, Symbol>();
		this.innerScopes = new HashMap<String, Scope>();
        this.enclosingScope.bindScope(new Symbol(""), this);
	}

	public Scope(Scope enclosingScope, String enclosingScopeName) {
		this.enclosingScope = enclosingScope;
		this.symbols = new HashMap<String, Symbol>();
		this.innerScopes = new HashMap<String, Scope>();
        this.enclosingScope.bindScope(new Symbol(enclosingScopeName), this);
	}
	
	public Symbol resolve(String id) {
		var symbolFromThisScope = symbols.get(id);
		if (symbolFromThisScope != null) {
			return symbolFromThisScope;
		}
		if (enclosingScope != null) {
			return enclosingScope.resolve(id);
		}
		return null;
	}

	public boolean setValue(String id, InterpreterContext value) {
		var symbolFromThisScope = symbols.get(id);
		if (symbolFromThisScope != null) {
			contexts.put(id, value);
			return true;
		}
		if (enclosingScope != null) {
			return enclosingScope.setValue(id, value);
		}
		return false;
	}

	public InterpreterContext getValue(String id) {
		var valueFromThisScope = contexts.get(id);
		if (valueFromThisScope != null) {
			return valueFromThisScope;
		}
		if (enclosingScope != null) {
			return enclosingScope.getValue(id);
		}
		return null;
	}

	public ClassScope resolveClass(String id) {
		try {
			ClassScope thisAsClass = (ClassScope) this;
			if (thisAsClass.getClassId().equals(id) || id.equals("self")) {
				return thisAsClass;
			}
		} catch (ClassCastException e) {

		}
		var innerScope = this.innerScopes.get(id);
		if (innerScope != null) {
			try {
				ClassScope innerAsClass = (ClassScope) innerScope;
				if (innerAsClass.getClassId().equals(id)) {
					return innerAsClass;
				}
			} catch (ClassCastException e) {

			}
		}
		if (enclosingScope != null) {
			return enclosingScope.resolveClass(id);
		}
		return null;
	}

	public void bind(Symbol symbol) {
		symbols.put(symbol.getId(), symbol);
		symbol.setScope(this);
	}

	public void bindScope(String id, Scope innerScope) {
		innerScopes.put(id, innerScope);
	}

	public void bindScope(Symbol symbol, Scope innerScope) {
		innerScopes.put(symbol.getId(), innerScope);
	}

	public Scope getEnclosingScope() {
		return this.enclosingScope;
	}

	public Map<String, Symbol> getSymbols() {
		return symbols;
	}

	public Map<String, Scope> getInnerScopes() {
		return innerScopes;
	}
}
