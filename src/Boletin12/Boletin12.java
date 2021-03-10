package Boletin12;

public class Boletin12 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("96956");
        Coche coche2 = new Coche("98746");
        Coche coche3 = new Coche("59476");
        Coche coche4 = new Coche("96464");
        Coche coche5 = new Coche("84625");
        Coche coche6 = new Coche("27593");
        Garaxe.entradaCoche(coche1);
        Garaxe.salidaCoche(4, 50, coche1);
        Garaxe.entradaCoche(coche2);
        Garaxe.entradaCoche(coche3);
        Garaxe.entradaCoche(coche4);
        Garaxe.entradaCoche(coche5);
        Garaxe.entradaCoche(coche6);
        Garaxe.entradaCoche(coche1);
        Garaxe.salidaCoche(2, 50, coche5);
    }
}
