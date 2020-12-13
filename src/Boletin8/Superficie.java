package Boletin8;

import javax.swing.*;

public class Superficie {
    public static void main(String[] args) {
        Datos obx = new Datos();

        String numero;
        do{
            numero = JOptionPane.showInputDialog(" introducir numero para calcular area: \n1-Cadrado \n2-Triangulo \n3-Circulo");
            switch (numero){
                case "1": obx.areaCuadrado();
                    break;
                case "2": obx.areaTriangulo();
                    break;
                case "3": obx.areaCirculo();
                    break;
                case "4":System.out.println(" sale del switch ");
                default :System.out.println(" opcion incorrecta ");

            }

        }while (!numero.equals("4"));

    }
}
