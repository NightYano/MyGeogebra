package Main;

import Exceptions.InvalidFunctionException;
import GUI.MyWindow;
import GUI.Panels.LinePrinter;
import GUI.Panels.OptionsPanel;
import Geometric.GeometricFunction;
import Util.Pair;

import java.awt.*;
import java.util.Optional;

public class MyGeogebra {
    private static MyGeogebra myGeogebra;
    private MyGeogebra(){
        MyWindow myWindow = new MyWindow("My Geogebra");
        myWindow.run();
    }
    //SINGLETON
    public static MyGeogebra getInstance(){
        if(myGeogebra == null)
            myGeogebra = new MyGeogebra();
        return myGeogebra;
    }

    //SYSTEM
    public void submitFunction(String input){
        GeometricFunction function = new GeometricFunction(input);
        if(!function.isValid()) throw new InvalidFunctionException("The input function is not valid");
        function.setRange(OptionsPanel.getInstance().getRange());
        Dimension dimension = LinePrinter.getInstance().getDimension();
        function.calculateLine(dimension.width);
        System.out.println(function);
    }

    //MAIN
    public static void main(String[] args) {
        MyGeogebra myGeogebra = MyGeogebra.getInstance();
    }

}
