package Boletin17;

import javax.swing.*;
import java.util.ArrayList;

public class Boletin17 {
    public static void main(String[] args) {
        try{


            ArrayList <Libro> lista= new ArrayList();
            String opcion;
            do{
                opcion =  JOptionPane.showInputDialog(" *** MENU ***\n 1-->ENGADIR\n 2-->AMOSAR\n 3-->CONSULTA\n 4-->ELIMINAR\n 5-->ORDENAR\n Cualquier otra tecla-->SAIR");
                switch(opcion){
                    case "1":Metodos.engadirLibro(lista);
                        break;
                    case "2":Metodos.amosar(lista);
                        break;
                    case "3":Metodos.consultarLibros(lista);
                        break;
                    case "4":Metodos.eliminarLibro(lista);
                        break;
                    case "5":Metodos.ordenarAmosar(lista);
                        break;
                    default:System.exit(0); break;
                }

            }while(! opcion.equalsIgnoreCase("6"));

        }catch(NullPointerException ex){

            System.out.println("Ha sucedido un error: "+ex.getMessage());

        }
    }
}
