package Boletin3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b100, b20, b5, m1, total, r1, r2;
        System.out.println("introducir euros");
        total= sc.nextInt();
        b100= total/100;
        r1= total%100;
        b20= r1/20;
        r2= r1%20;
        b5= r2/5;
        m1= r2%5;
        System.out.println("billetes de 100="+b100+"billetes de 20=" +b20+"billetes de 5=" +b5+"monedas de 1=" +m1);
    }
}
