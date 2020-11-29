package Main;

import GUI.MyWindow;
import GUI.Panels.LinePrinter;
import Geometric.GeometricFunction;

import java.awt.*;

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
        System.out.println(this.getClass()+" : "+ input);
        GeometricFunction function = new GeometricFunction(input);
        System.out.println(input +" --> is valid : "+ function.isValid());
        Dimension dimension = LinePrinter.getInstance().getDimension();
        function.calculateLine(dimension.width);
    }

    //MAIN
    public static void main(String[] args) {
        MyGeogebra myGeogebra = MyGeogebra.getInstance();
    }

}
