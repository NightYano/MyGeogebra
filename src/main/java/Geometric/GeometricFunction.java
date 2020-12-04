package Geometric;

import Util.Pair;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class GeometricFunction {
    private Expression expression;
    private double xMin, xMax;
    private Line line;


    public GeometricFunction(String function){
        expression = new Expression(function);
        expression.setDescription("y= "+function);
        expression.addArguments(new Argument("x"));
    }

    public boolean isValid(){
        return expression.checkSyntax();
    }

    public void setRange (double xMin, double xMax){
        if(xMax <= xMin) throw new IllegalArgumentException("xMin must be inferior than xMax");
        this.xMin = xMin;
        this.xMax = xMax;
    }

    public void setRange(Pair<Double, Double> pair){
        setRange(pair.getVal1(), pair.getVal2());
    }

    public Line getLine() {
        if(line != null) throw new NullPointerException("Line has not been calculated");
        return line;
    }

    /**
     *
     * @param nbPixels
     */
    public void calculateLine(int nbPixels){

        line = new Line(nbPixels);
        for (int i = 0; i < line.getSize(); i++) {
            line.setPoint(i, calculatePoint(nbPixels, i));
        }
    }

    public Point calculatePoint(int nbPixels, int index){
        /*
            size = xMax-xMin
            scale = size / nbPixels
            position = xMin + (index * scale)
         */
        double x = xMin + (index * ((xMax-xMin)/nbPixels));
        expression.getArgument("x").setArgumentValue(x);
        double y = expression.calculate();
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return this.expression.getDescription() + " from "+ xMin + " to "+ xMax +" with " + line.getSize() +" points.\n"+line.toString();
    }
}
