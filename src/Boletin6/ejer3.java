package Boletin6;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce radio del circulo");
        double radio=sc.nextDouble();
        Circulos c=new Circulos(radio);
        c.Area();
        c.calcularLonxitude();
        System.out.println("El radio selecionado es "+c.getRadio());
    }
}
