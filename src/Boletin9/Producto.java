package Boletin9;

import javax.swing.*;

public class Producto {

    float numero;

    public void productoUno(){

        do {
            numero= Float.parseFloat(JOptionPane.showInputDialog(" Introducir número "));

            if (numero>0){

                System.out.println("1*"+numero+"="+1*numero+"\n2*"+numero+"="+2*numero+"\n3*"+numero+"="+3*numero+"\n4*"+numero+"="+4*numero+"\n5*"+numero+"="+5*numero+"\n6*"+numero+"="+6*numero+"\n7*"+numero+"="+7*numero+"\n8*"+numero+"="+8*numero+"\n9*"+numero+"="+9*numero+"\n10*"+numero+"="+10*numero);
            }


        }while (numero !=0);

    }
}
