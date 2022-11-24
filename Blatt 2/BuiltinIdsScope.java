public class BuiltinIdsScope extends Scope {
	private static BuiltinIdsScope scopeInstance = null;

	private BuiltinIdsScope() {
		// add built-in ids/types here
	}

	public static Scope getInstance() {
		if (scopeInstance == null) {
			scopeInstance = new BuiltinIdsScope();
		}
		return scopeInstance;
	}
}
