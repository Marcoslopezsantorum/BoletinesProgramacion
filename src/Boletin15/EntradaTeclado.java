package Boletin15;

import java.util.Scanner;

public class EntradaTeclado {
    private String entradaTeclado;
    public EntradaTeclado ()  {
        entradaTeclado="";

    }
    public void pedirEntrada ()  {
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
    }
    public String getEntrada () { return entradaTeclado; }

}
