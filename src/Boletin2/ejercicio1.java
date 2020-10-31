package Boletin2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, altura, area;
        System.out.println("introduce base");
        base = sc.nextFloat();
        System.out.println("introduce altura");
        altura = sc.nextFloat();
        area = base * altura / 2;
        System.out.println("area= " + area);
    }
}
