package Boletin3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float  graosCentigrados, graosKelvin;
        double graosFahrenheit;
        System.out.println("introducir graos centigrados");
        graosCentigrados= sc.nextFloat();
        graosKelvin= graosCentigrados+273;
        graosFahrenheit= 1.8*graosCentigrados+32f;
        System.out.println(graosCentigrados+"graos centigrados=" +graosKelvin+ "graos kelvin=" +graosFahrenheit+"grados fahrenheit");
    }
}
