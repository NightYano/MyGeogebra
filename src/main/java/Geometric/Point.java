package Geometric;

import java.awt.*;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Point toPixelPoint(Dimension canvasDimension, Point minPoint, Point maxPoint){
        double pixelAbc, pixelOrd;
        //SCALING
        double rangeX, rangeY;
        rangeX = maxPoint.getX()- minPoint.getX();
        rangeY = maxPoint.getY()- minPoint.getY();
        double scaleX, scaleY;
        scaleX = rangeX/canvasDimension.width;
        scaleY = rangeY/canvasDimension.height;

        //Relative position from xMin and yMin
        double xRel, yRel;
        xRel = this.x - minPoint.getX();
        yRel = this.y - minPoint.getY();

        pixelAbc = xRel * scaleX;
        pixelOrd = yRel * scaleY;

        return new Point(pixelAbc, pixelOrd);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}
