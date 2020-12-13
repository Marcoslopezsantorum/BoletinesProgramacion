package Boletin7;

import javax.swing.*;

public class Num {
    short numero, numero2;

    public Num(){


    }
    public void NumDos(){

        numero = Short.parseShort(JOptionPane.showInputDialog(" Introduce número 1"));
        numero2 = Short.parseShort(JOptionPane.showInputDialog("Introduce número 2"));

        if(numero>=numero2){

            System.out.println(" resta " +(numero-numero2));
        }
        else {
            System.out.println(" suma " +(numero+numero2));
        }

    }
}
