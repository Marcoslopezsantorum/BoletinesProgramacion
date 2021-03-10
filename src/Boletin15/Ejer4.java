package Boletin15;

public class Ejer4 {

    public void validarDNI(){
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        EntradaTeclado entrada = new EntradaTeclado();
        System.out.println("Introduce el N de DNI y sin la letra");
        entrada.pedirEntrada();
        String strDNI=entrada.getEntrada();
        int dni = Integer.parseInt(strDNI);
        int resto = dni%23;
        System.out.println("El DNI  es ---->"+dni+String.valueOf(letra[resto]));
    }

}
