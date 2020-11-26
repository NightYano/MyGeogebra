package Main;

import GUI.MyWindow;
import Geometric.GeometricFuncion;

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
        GeometricFuncion function = new GeometricFuncion(input);
        System.out.println(input +" --> is valid : "+ function.isValid());
    }

    //MAIN
    public static void main(String[] args) {
        MyGeogebra myGeogebra = MyGeogebra.getInstance();
    }

}
