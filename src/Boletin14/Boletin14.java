package Boletin14;

import javax.swing.*;


public class Boletin14 {
    public static void main(String[] args) {
        ConversorTemperaturas cov = new ConversorTemperaturas();
        float gradosCentigrados = Float.parseFloat(JOptionPane.showInputDialog("Introducir grados centígrados"));

        try {
            JOptionPane.showMessageDialog(null,"Temperatura  Fahrenheit ----> "+cov.centigradosAFharenheit(gradosCentigrados));
            JOptionPane.showMessageDialog(null,"Temperatura  Reaumur----> "+cov.centigradosAReaumur(gradosCentigrados));
        } catch (TemperaturaErradaExcepcion error) {
            JOptionPane.showMessageDialog(null,"Error "+ error.toString());
        }
    }
}
