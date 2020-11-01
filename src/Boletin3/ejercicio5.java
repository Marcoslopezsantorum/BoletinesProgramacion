package Boletin3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float soldo, soldoFixo, ventas, km, dias, soldoBruto, soldoLiquido;
        System.out.println("introduce soldo");
        soldoFixo= sc.nextFloat();
        System.out.println("introduce ventas totales");
        ventas= sc.nextFloat();
        System.out.println("introduce kilometros");
        km= sc.nextFloat();
        System.out.println("introduce dias");
        dias= sc.nextFloat();
        soldoBruto = soldoFixo+0.05f*ventas+km*2+dias*30;
        soldoLiquido= soldoBruto-0.18f*soldoBruto-36;
        System.out.println("sodo bruto="+soldoBruto+ "soldo liquido="+soldoLiquido);
    }
}
