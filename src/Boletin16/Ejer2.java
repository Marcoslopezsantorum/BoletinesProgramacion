package Boletin16;

import javax.swing.*;

public class Ejer2 {
    int [] personas = new int [10];

    public  void definirAltura(){

        int altura;
        int alturaMedia;
        int countMedia=0;
        int countSuperior=0;
        int countInferior=0;
        int countPersonasDe170=0;

        for(int i=0;i<personas.length;i++){

            altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de la persona "+(i+1)+" en centímetros"));
            personas[i]=altura;
            if(personas[i]>170){

                countSuperior+=1;

            }if(personas[i]<170){

                countInferior+=1;

            }if(personas[i]==170){

                countPersonasDe170+=1;

            }


            countMedia+=personas[i];



        }
        System.out.println("Nª personas superior a la media= "+countSuperior);
        System.out.println("Nª personas inferior a la media= "+countInferior);
        System.out.println("personas que miden 170 cm = "+countPersonasDe170);
        alturaMedia=countMedia/personas.length;
        System.out.println("media = "+ alturaMedia+"cm");









    }
}
