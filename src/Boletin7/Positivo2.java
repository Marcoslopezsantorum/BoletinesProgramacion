package Boletin7;

import javax.swing.*;

public class Positivo2 {

    float numero;

    public Positivo2(){

    }
    public void NumPos(){

        numero= Float.parseFloat(JOptionPane.showInputDialog(" Introducir numero"));

        if (numero>0){
            System.out.println(" + ");

        }

        else if (numero<0){
            System.out.println(" - ");
        }

        else {

            System.out.println(" 0 ");



        }

    }
}
