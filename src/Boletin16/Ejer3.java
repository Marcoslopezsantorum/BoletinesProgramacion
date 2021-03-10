package Boletin16;

public class Ejer3 {
    String cadea="www. java-desde0. com";


    public void separarCadea(){
        String [] partes = cadea.split("-");
        System.out.println(partes[0]);
        System.out.println(partes[1]);

    }
    public void unirCadea(String parte1, String parte2){

        cadea=parte1+parte2;
        System.out.println(cadea);


    }
}
