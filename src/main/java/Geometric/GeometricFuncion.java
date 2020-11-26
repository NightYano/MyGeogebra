package Geometric;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class GeometricFuncion {
    private Expression expression;

    public GeometricFuncion(String function){
        expression = new Expression(function);
        expression.addArguments(new Argument("x"));
    }

    public boolean isValid(){
        return expression.checkSyntax();
    }
}
