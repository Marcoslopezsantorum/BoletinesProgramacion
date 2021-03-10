package Boletin16;

import javax.swing.*;

public class Ejer1 {
    int [] arrayNumeros = new int [10];


    public void crearArray(){


        String dato;
        int numero;

        for(int i=0;i<arrayNumeros.length;i++){

            dato= JOptionPane.showInputDialog("Introduce un numero "+(i+1));
            numero=Integer.parseInt(dato);
            arrayNumeros[i]=numero;

            if( numero %2 ==0 ){
                System.out.println("Numeros pares: "+arrayNumeros[i]);
            }if(numero < 0){

                System.out.println("Numeros negativos: "+arrayNumeros[i]);
            }if(numero %2!=0){
                System.out.println("Numeros impares: "+arrayNumeros[i]);
            }


        }

    }
}
