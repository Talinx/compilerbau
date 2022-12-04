import java.util.List;

public class ClassScope extends Scope {
	Symbol id;
	List<ClassScope> parentScopes; // scopes of parent classes

	public ClassScope(Scope enclosingScope, Symbol id, List<ClassScope> parentClassScopes) {
		super(enclosingScope);
		this.id = id;
		this.parentScopes = parentClassScopes;
	}

	public String getClassId() {
		return this.id.getId();
	}

	@Override
	public Symbol resolve(String id) {
		if (id.equals("self")) {
			return this.id;
		}
		var symbolFromThisScope = symbols.get(id);
		if (symbolFromThisScope != null) {
			return symbolFromThisScope;
		}
		for (int i = 0; i < this.parentScopes.size(); i++) {
			var symbolFromParentClass = parentScopes.get(i).resolve(id);
			if (symbolFromParentClass != null) {
				return symbolFromParentClass;
			}
		}
		if (enclosingScope != null) {
			return enclosingScope.resolve(id);
		}
		return null;
	}

    public Symbol resolveAttribute(String id) {
        var symbolFromThisScope = symbols.get(id);
        if (symbolFromThisScope != null) {
            return symbolFromThisScope;
        }

		var innerScope = this.innerScopes.get(id);
		if (innerScope != null) {
			try {
				ClassScope innerAsClass = (ClassScope) innerScope;
                var symbolFromImmerScope = innerAsClass.resolveAttribute(id);
				if (symbolFromImmerScope != null) {
					return symbolFromImmerScope;
				}
			} catch (ClassCastException e) {

			}
		}
		return null;
    }
}
