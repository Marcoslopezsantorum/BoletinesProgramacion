package Boletin18;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
    static ArrayList<Correo> listaCorreos = new ArrayList();

    public static int numeroDeCorreos(){

        JOptionPane.showMessageDialog(null, "Tienes "+listaCorreos.size()+" correos");
        return listaCorreos.size();
    }

    public static void engade(Correo c){
        listaCorreos.add(c);
    }

    public static boolean porLer(){

        Iterator it=listaCorreos.iterator();
        int correoSinLeer = 0;
        Correo correo = null;
        while(it.hasNext()){
            correo=(Correo) it.next();
            if(correo.getCorreoLeido()== false){
                correoSinLeer++;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay "+correoSinLeer+" correos sin leer");
        if(correoSinLeer != 0){
            return false;

        }else
            return true;

    }

    public static String amosarPrimerNoLeido(){
        ArrayList <Correo> correosNoLeidos= new ArrayList();

        Iterator it = listaCorreos.iterator();
        Correo correo = null;
        while(it.hasNext()){
            correo= (Correo) it.next();
            if(correo.getCorreoLeido()==false){
                correosNoLeidos.add(correo);
            }
        }
        return correosNoLeidos.get(0).getContenido();

    }

    public static void eliminar(int k){
        listaCorreos.remove(k);

    }

    static void amosar(int k) {
        JOptionPane.showMessageDialog(null, "Tu correo trata de: "+listaCorreos.get(k).getContenido());
    }

}
