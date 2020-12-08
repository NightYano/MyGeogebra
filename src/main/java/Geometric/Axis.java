package Geometric;

import java.awt.*;

public class Axis {
    private Line axisX, axisY;

    public Line getAxisX() {
        return axisX;
    }

    public Line getAxisY() {
        return axisY;
    }

    public Line[] getAxes(){
        Line[] axes = new Line[2];
        axes[0] = getAxisX(); axes[1] = getAxisY();
        return axes;
    }

    public void calculateAxes(GeometricFunction function, Dimension dimension){
        Line line = function.getLine();
        GeometricFunction axis = new GeometricFunction("x=0");
        //TODO calculate Axis X

        axis = new GeometricFunction("y=0");
        //TODO calculate Axis Y
    }
}
