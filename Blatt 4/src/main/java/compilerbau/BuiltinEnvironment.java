package compilerbau;

import java.util.function.Consumer;

public class BuiltinEnvironment extends Environment {

    public BuiltinEnvironment() {
        Consumer<String> builtinPrint = (s) -> System.out.println(s);
        setValue("print", new InterpreterContext(builtinPrint));
    }
}
