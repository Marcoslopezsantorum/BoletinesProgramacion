package Boletin9;

import javax.swing.*;

public class NumNegativos {
    float numero;

    private int j=0,k=0,h=0;


    public void pedirNum(){

        for(int i=0; i<10; i++){

            numero = Float.parseFloat(JOptionPane.showInputDialog(" Introducir números "));

            if (numero<0){

                j++;
            }
            else if(numero>0){

                k++;
            }
            else {

                h++;
            }

        }


    }
    public void amosarNum(){
        System.out.println(" numeros positivos " +k+ " numeros negativos " +j+ " numeros de ceros" +h);
    }

}


