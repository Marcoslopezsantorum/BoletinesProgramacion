package Boletin2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float millasMarinas, metros;
        System.out.println("introducir millasmarinas");
        millasMarinas= sc.nextFloat();
        metros= millasMarinas*1852;
        System.out.println(millasMarinas+ "millasMarinas son ="+metros+ "metros");


    }
}
