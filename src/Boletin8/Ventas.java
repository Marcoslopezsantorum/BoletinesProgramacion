package Boletin8;

import javax.swing.*;

public class Ventas {
    float numero;
    String nome;

    public void Ventas2 (){
        do {

            numero = Float.parseFloat(JOptionPane.showInputDialog(" insertar numero"));
            nome  = JOptionPane.showInputDialog(" insertar nombre");
            if (numero>0) {
                if (numero<=100){

                    System.out.println(numero+ nome+" baixo ");

                }

                else if (numero>100 && numero<=500){

                    System.out.println(numero+ nome+" medio ");
                }

                else if (numero>500 && numero<=1000){

                    System.out.println(numero+ nome+" alto ");
                }

                else{
                    System.out.println(numero+ nome+ " primeira necesidade ");
                }
            }
            else {
                System.out.println(" finalización programa ");
            }

        }
        while (numero!=0);
//        System.out.println(" finalizar bucle ");

    }
}
