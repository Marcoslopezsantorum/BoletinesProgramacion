package Boletin6;

import java.util.Scanner;

public class Coche {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Coche1 car=new Coche1();
        System.out.println("Introduce incremento velocidad");
        int incremento=sc.nextInt();
        car.acelerar(incremento);
        System.out.println("Introduce decremento velocidad");
        int frenar=sc.nextInt();
        car.frenar(frenar);
        car.getVelocidade();
    }
}
