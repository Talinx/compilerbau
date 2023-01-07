package compilerbau;

import java.util.function.Consumer;

public class BuiltinEnvironment extends Environment {

    public BuiltinEnvironment(Environment enclosingEnv) {
        super(enclosingEnv);
        Consumer<String> builtinPrint = (s) -> System.out.println(s);
        setValue("print", new InterpreterContext(builtinPrint));
    }
}
