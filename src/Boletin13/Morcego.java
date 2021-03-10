package Boletin13;

public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void caminar() {
        System.out.println("Murcielago----> Estoy caminando");
    }

    @Override
    public void voar() {
        System.out.println("Murcielago----> Estoy volando");
    }
}