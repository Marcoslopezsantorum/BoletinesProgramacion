package Boletin7;

import javax.swing.*;

public class Peso {
    String nome, nome2;
    float peso, peso2;

    public Peso(){

    }
    public void PesoPer(){

        peso = Float.parseFloat(JOptionPane.showInputDialog(" introducir peso1 "));
        nome = JOptionPane.showInputDialog(" introducir nombre1 ");
        peso2 = Float.parseFloat(JOptionPane.showInputDialog(" introducir peso2 "));
        nome2 = JOptionPane.showInputDialog(" introducir nombre2 ");

        if (peso>peso2){

            System.out.println(nome + " pesa "+ peso + " Kg " + " y la diferencia de peso es "+(peso - peso2));
        }
        else if (peso2>peso){

            System.out.println(nome2 +  " pesa "+ peso2 + " Kg " + " y la diferencia de peso es "+(peso2 - peso));
        }
    }
}
