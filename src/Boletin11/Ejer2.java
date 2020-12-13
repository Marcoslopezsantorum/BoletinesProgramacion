package Boletin11;

import javax.swing.*;

public class Ejer2 {
    public void ordenador(){
        int numero,dis,aleatorio=(int)(Math.random()*50+1);
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Acierta el numero comprendido entre 1 y 50"));
            dis=Math.abs(aleatorio-numero);
            if(dis>20){
                System.out.println("Moi lonxe");
            }else if(dis<=20&&dis>=10){
                System.out.println("Lonxe");
            }else if(dis<10&&dis>5){
                System.out.println("Preto");
            }else
                System.out.println("Moi preto");
        }while(aleatorio!=numero);
        System.out.println("Acertaste el numero!!!! \nFelicidades");
    }
}
