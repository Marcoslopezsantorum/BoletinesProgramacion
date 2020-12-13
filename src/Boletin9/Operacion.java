package Boletin9;

public class Operacion {
    public void multiplicarNumeros() {

        double resultado=1;
        for (int i=10; i<=90; i++){

            resultado=resultado*i;
        }

        System.out.println( resultado );
    }
    public void sumarNumeros() {

        double resultado2=0;
        for (int i=10; i<=90; i++){

            resultado2=resultado2+i;
        }
        System.out.println( resultado2 );

    }

}
