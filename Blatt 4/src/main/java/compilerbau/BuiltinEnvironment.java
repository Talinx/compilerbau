package compilerbau;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

public class BuiltinEnvironment extends Environment {

    public BuiltinEnvironment() {
        Consumer<String> builtinPrint = (s) -> System.out.println(s);
        setValue("print", new InterpreterContext(builtinPrint));
        Consumer<String> builtinLoad = (s) -> BuiltinLoad(s);
        setValue("load", new InterpreterContext(builtinLoad));
    }

    private void BuiltinLoad(String filePath) {
        String inputString;
        try {
            inputString = Files.readString(Path.of(filePath));
            inputString = inputString.replaceAll("\r\n","\n");
            inputString = inputString + "\n";
            var interpreterBuilder = new ASTInterpreterBuilder();
            interpreterBuilder.getInstance().interpretInteractive(inputString);
        } catch (IOException e) {
            System.out.println("Failed to load file " + filePath);
        }
    }
}
