package Boletin6;

public class Coche1 {
    private int velocidade, incremento, decremento;


    public Coche1(){
        velocidade=0;
    }
    public int getVelocidade(){
        System.out.println("Velocidad actual es de "+velocidade);
        return velocidade;
    }

    public void acelerar(int valor){
        velocidade=velocidade+valor;
        System.out.println("Incrementa en "+velocidade);
    }
    public void frenar (int menos){
        velocidade=velocidade-menos;
        System.out.println("decrementa en "+velocidade);
    }
}
