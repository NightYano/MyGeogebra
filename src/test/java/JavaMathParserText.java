import org.mariuszgromada.math.mxparser.*;

public class JavaMathParserText {
    public static void main(String[] args){
        Expression expression = new Expression("3*x");
        expression.addArguments(new Argument("x"));
        System.out.println(expression.checkSyntax());
        expression.getArgument("x").setArgumentValue(2);
        System.out.println(expression.calculate());

    }
}
