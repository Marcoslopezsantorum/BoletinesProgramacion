package Boletin2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float euros, dolares, cambio;
        System.out.println("introducir euros");
        euros= sc.nextFloat();
        System.out.println("cambio a dolar");
        cambio= sc.nextFloat();
        dolares= euros*cambio;
        System.out.println(euros+"euros son ="+dolares +"$");

    }
}
