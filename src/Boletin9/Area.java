package Boletin9;

import javax.swing.*;

public class Area {
    float base, altura;

    public void areaRect(){


        base= Float.parseFloat(JOptionPane.showInputDialog(" Introducir base "));
        altura= Float.parseFloat(JOptionPane.showInputDialog(" Introducir altura "));

        if (base>0 && altura>0){

            System.out.println(" Area =" +base*altura);
        }


        System.out.println(" dato erroneo ");
    }
}
