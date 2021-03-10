package Boletin15;

public class Boletin15 {
    public static void main(String[] args) {
        int[]numeros ={(int)(Math.random()*(50-1)+1)};

        Metodos obx= new Metodos();

        obx.amosarArray(numeros);
        obx.notasArray();
        obx.nomeArray();
        Ejer4 obx1=new Ejer4();
        obx1.validarDNI();
    }
}
