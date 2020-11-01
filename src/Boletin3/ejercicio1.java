package Boletin3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float prezoTarifa, prezoPagado, desconto;
        System.out.println("introducir prezo tarifa");
        prezoTarifa= sc.nextFloat();
        System.out.println("introducir prezo pagado");
        prezoPagado= sc.nextFloat();
        desconto=(prezoTarifa-prezoPagado)*100/prezoTarifa;
        System.out.println("desconto="+desconto+"%");
    }
}
