package compilerbau;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    Environment enclosingEnv;
    Map<String, InterpreterContext> values;

    public Environment() {
		this.enclosingEnv = null;
        this.values = new HashMap<String, InterpreterContext>();
	}

    public Environment(Environment enclosingEnv) {
        this.enclosingEnv = enclosingEnv;
        this.values = new HashMap<String, InterpreterContext>();
    }

    public void setValue(String id, InterpreterContext value) {
		var symbolFromThisScope = values.get(id);
		if (symbolFromThisScope != null) {
			values.put(id, value);
            return;
		}
		if (enclosingEnv != null) {
			var ret = enclosingEnv.setValueEnclosing(id, value);
            if (ret) return;
		}
        values.put(id, value);
	}

    public boolean setValueEnclosing(String id, InterpreterContext value) {
		var symbolFromThisScope = values.get(id);
		if (symbolFromThisScope != null) {
			values.put(id, value);
			return true;
		}
		if (enclosingEnv != null) {
			return enclosingEnv.setValueEnclosing(id, value);
		}
		return false;
	}

	public InterpreterContext getValue(String id) {
		var valueFromThisScope = values.get(id);
		if (valueFromThisScope != null) {
			return valueFromThisScope;
		}
		if (enclosingEnv != null) {
			return enclosingEnv.getValue(id);
		}
		return null;
	}
}
