public class PassASTNode extends ASTNode {

    @Override
    public void print(int level) {
        System.out.println(baseIndentation(level) + "PassASTNode");
    }

}
