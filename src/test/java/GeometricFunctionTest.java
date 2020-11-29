import Geometric.GeometricFunction;

public class GeometricFunctionTest {

    public static void main(String[] args) throws Exception {
        GeometricFunction function = new GeometricFunction("x+1");
        if(!function.isValid()) throw new Exception("NON VALIDE");
        function.setRange(1,4);
        function.calculateLine(3);
        System.out.println(function+"\n");


        function = new GeometricFunction("x^2");
        if(!function.isValid()) throw new Exception("NON VALIDE");
        function.setRange(-2,4);
        function.calculateLine(6);
        System.out.println(function+"\n");

        function = new GeometricFunction("sin(3*x)+2.5*x");
        if(!function.isValid()) throw new Exception("NON VALIDE");
        function.setRange(-2,4);
        function.calculateLine(6);
        System.out.println(function+"\n");
    }
}
