package Boletin18;

import javax.swing.*;

public class Boletin18 {
    public static void main(String[] args) {


            int opcion = 0;

            do{
                int k =0;
                Correo obx = new Correo();

                opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "1-->Numero Correos \n 2-->Engadir\n 3-->Correos sin leer\n 4-->Primer correo sin leer\n 5-->Mostrar un correo\n 6--> Eliminar un correo"));

                switch(opcion){

                    case 1:

                        Buzon.numeroDeCorreos();
                        break;
                    case 2:
                        String contenido = JOptionPane.showInputDialog(null, "Introduce un correo ");
                        String leido = JOptionPane.showInputDialog(null,"¿Quieres marcarlo como leido?(si/no)");
                        boolean v = false;
                        if(leido.equals("si")) v=true;
                        obx.setCorreoLeido(v);
                        obx.setContenido(contenido);
                        Buzon.engade(obx);
                        break;
                    case 3:
                        Buzon.porLer();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, Buzon.amosarPrimerNoLeido());
                        break;
                    case 5:
                        k=Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
                        Buzon.amosar(k);
                        break;
                    case 6:
                        k=Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
                        Buzon.eliminar(k);
                        break;
                    case 7:
                    default:System.exit(0); break;
                }
            }while(opcion < 8 && opcion >= 1);
        }

    }

