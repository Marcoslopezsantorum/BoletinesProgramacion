package Boletin8;

import javax.swing.*;

public class Datos {


    public void areaCuadrado(){

        float lado= Float.parseFloat(JOptionPane.showInputDialog(" introducir lado "));

        System.out.println(" Area = "+ Math.pow(lado,2));

    }

    public void areaTriangulo(){
        float base= Float.parseFloat(JOptionPane.showInputDialog(" introducir base "));
        float altura= Float.parseFloat(JOptionPane.showInputDialog(" introducir altura "));
        System.out.println(" Area = "+ ( base*altura/2));
    }
    public void areaCirculo(){
        float radio= Float.parseFloat(JOptionPane.showInputDialog(" introducir radio "));

        System.out.println(" Area = "+ Math.PI*Math.pow(radio, 2));

    }


}
