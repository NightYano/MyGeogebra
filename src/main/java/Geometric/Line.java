package Geometric;

import Util.Pair;

import java.awt.*;

public class Line {
    private Point[] points;


    public Line(int size){
        points = new Point[size];
    }

    public void setPoint(int index, Point point){
        if(index<0 || index >= points.length)
            throw new IndexOutOfBoundsException("Point must be inserted between 0 and " + points.length + " (" + index + " actually)");
        points[index] = point;
    }

    public void setPoint(int index, double x, double y){
        if(index<0 || index >= points.length)
            throw new IndexOutOfBoundsException("Point must be inserted between 0 and " + points.length + " (" + index + " actually)");
        points[index] = new Point(x, y);
    }

    public Point[] getPoints() {
        return points;
    }
    public Point getPoint(int index){
        if(index <0 || index >= getSize()) throw  new NullPointerException("Index out of range for points");
        return points[index];
    }

    public int getSize(){
        return this.points.length;
    }

    public Pair<Double, Double> getYExtremum(){
        return new Pair<>(getMinY(), getMaxY());
    }

    private double getMaxY(){
        double maxY = points[0].getY();
        for (Point point:points) {
            if(point.getY() > maxY)
                maxY = point.getY();
        }
        return maxY;
    }

    private double getMinY(){
        double minY = points[0].getY();
        for (Point point:points) {
            if(point.getY() < minY)
                minY = point.getY();
        }
        return minY;
    }

    public Line toPixelLine(Dimension canvasDimension){
        //TODO test Line.toPixelLine and Point.toPixelPoint
        Pair<Double, Double> YExtremum = getYExtremum();
        Point minPoint = new Point(points[0].getX(), YExtremum.getVal1()), maxPoint = new Point(points[getSize()-1].getX(), YExtremum.getVal2());

        Line pixelLine = new Line(getSize());
        for (int index = 0; index < getSize(); index++) {
            pixelLine.setPoint(index, points[index].toPixelPoint(canvasDimension, minPoint, maxPoint));
        }
        return pixelLine;
    }

    @Override
    public String toString() {
        String result = "";
        for (int index=0; index< points.length; index++) {
            result += ("x" + index + " = " + points[index].toString() + "\n");
        }
        return result;
    }
}
