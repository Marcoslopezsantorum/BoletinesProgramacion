package Boletin7;

import javax.swing.*;

public class Numero3 {
    float num1, num2, num3;

    public void Num2(){

        num1 = Float.parseFloat(JOptionPane.showInputDialog(" introducir numero 1 "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(" introducir numero 2 "));
        num3 = Float.parseFloat(JOptionPane.showInputDialog(" introducir numero 3 "));

        if (num1>num2 && num1>num3 ){
            System.out.println(" numero 1 mayor ");
        }
        else if (num2>num1 && num2>num3 ){
            System.out.println(" numero 2 mayor ");
        }
        else {
            System.out.println(" numero 3 mayor");
        }
    }
}
