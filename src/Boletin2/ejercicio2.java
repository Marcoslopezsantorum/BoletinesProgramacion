package Boletin2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float lado, area;
        System.out.println("introducir lado");
        lado= sc.nextFloat();
        area= lado*lado;
        System.out.println("area="+area);

    }
}
