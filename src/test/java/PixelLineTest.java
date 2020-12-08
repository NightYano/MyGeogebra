import Exceptions.InvalidFunctionException;
import GUI.Panels.LinePrinter;
import GUI.Panels.OptionsPanel;
import Geometric.GeometricFunction;
import Geometric.Line;
import Main.MyGeogebra;
import Util.Pair;

import java.awt.*;

public class PixelLineTest {

    public static void main(String[] args) {
        MyGeogebra myGeogebra = MyGeogebra.getInstance();
        GeometricFunction function = new GeometricFunction("3*x+1");
        if (!function.isValid()) throw new InvalidFunctionException("The input function is not valid");
        function.setRange(new Pair<Double, Double>(1.0, 2.0));
        Dimension dimension = LinePrinter.getInstance().getDimension();
        function.calculateLine(dimension.width);
        System.out.println(function);
        Line pixelLine = function.getLine().toPixelLine(new Dimension(1, 2));
        System.out.println(pixelLine);
        LinePrinter printer = LinePrinter.getInstance();
        //printer.printLine(pixelLine);

    }
}
