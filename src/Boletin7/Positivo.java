package Boletin7;

import javax.swing.*;

public class Positivo {
    float numero;

    public Positivo() {

    }

    public void numPos() {
        numero = Float.parseFloat(JOptionPane.showInputDialog(" Introduce número"));

        if (numero > 0) {
            System.out.println(numero + " e positivo ");
        }
    }
}