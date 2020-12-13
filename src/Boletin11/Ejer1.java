package Boletin11;

import javax.swing.*;

public class Ejer1 {

    public void numero() {

        int numero2, numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce numero"));
        do {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 adivine el numero"));
            if (numero2 < numero1) {
                System.out.println("Es mas grande");
            } else if (numero2 > numero1) {
                System.out.println("Es mas pequeño");
            }
        } while (numero1 != numero2);
        System.out.println("Acertaste el numero!!!! \nFelicidades");
    }
}
