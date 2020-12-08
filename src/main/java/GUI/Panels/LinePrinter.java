package GUI.Panels;

import Geometric.Axis;
import Geometric.GeometricFunction;
import Geometric.Line;
import Geometric.Point;

import javax.swing.*;
import java.awt.*;

/** A canvas that displays the line made by the function used as parameter.
 *
 * @see JPanel
 * @author Davide
 */
public class LinePrinter extends JPanel {
    private static LinePrinter linePrinter;
    private Axis axes;
    private GeometricFunction function;

    private LinePrinter(){}

    public static LinePrinter getInstance(){
        if(linePrinter == null)
            linePrinter = new LinePrinter();
        return linePrinter;
    }

    @Override
    public void paint(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.BLUE);
        graphics.drawLine(0, 0, getWidth(), getHeight());
    }

    public Dimension getDimension(){
        return new Dimension(getWidth(), getHeight());
    }

    @Override
    public void update(Graphics g) {
        if(axes!=null) printAxis(g);
        if(function!=null){
            printFunctionLabel(g);
            printFunction(g);
        }
    }

    private void printAxis(Graphics g){

    }

    private void printFunction(Graphics g){

    }

    private void printFunctionLabel(Graphics g){

    }
}
