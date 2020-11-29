package Geometric;

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

    public int getSize(){
        return this.points.length;
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
