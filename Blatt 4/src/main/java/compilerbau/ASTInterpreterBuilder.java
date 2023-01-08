package compilerbau;

public class ASTInterpreterBuilder {

    public ASTInterpreterBuilder() {
    }
    private static ASTInterpreter astInterpreter;

    public ASTInterpreter getInstance() {
        if (astInterpreter == null) {
            astInterpreter = new ASTInterpreter();
            return astInterpreter;
        }
        else {
            return astInterpreter;
        }
    }
}
