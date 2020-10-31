package Boletin2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float num1, num2, suma, resta, producto, cociente;
        System.out.println("introduce numero1");
        num1= sc.nextFloat();
        System.out.println("introduce numero2");
        num2= sc.nextFloat();
        suma= num1+num2;
        resta= num1-num2;
        producto= num1*num2;
        cociente= num1/num2;
        System.out.println("  suma=  "+ suma + " resta= " +resta + "  producto=  " + producto + " cociente=  " + cociente );

    }

}
