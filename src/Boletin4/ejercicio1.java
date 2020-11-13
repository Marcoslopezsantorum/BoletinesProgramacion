package Boletin4;

import java.util.Scanner;

public class ejercicio1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el titulo del libro: ");
            String titulo = sc.nextLine();
            System.out.println("Escribe el autor del libro: ");
            String autor = sc.nextLine();
            System.out.println("Escribe el año de publicacion del libro: ");
            int año = sc.nextInt();
            System.out.println("Escribe el numero de paginas del libro: ");
            short numeroPaginas = sc.nextShort();
            System.out.println("Escribe la valoracion del libro: ");
            float puntuacion = sc.nextFloat();
            System.out.println("Titulo "  +titulo+   "\nAutor "+autor+"\nFecha del libro "+año+"\nNumero de páginas "+numeroPaginas+"\nPuntucion  "+puntuacion);

    }
}
