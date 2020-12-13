package Boletin9;

import javax.swing.*;

public class Dinero {
    private int trabajador=0,suelmin=0,suelmax=0;
    public void trabajadores(){
        float sueldo;
        do{
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Introduce sueldo trabajador"));
            if(sueldo!=0){
                trabajador++;
            }if(sueldo<1000&&sueldo>0){
                suelmin++;
            }else if(sueldo>=1000&&sueldo<=1750)
                suelmax++;
        }while(sueldo!=0);

        System.out.println("Cantidad de trabajadores que cobran entre 1000 y 1750 es de "+suelmax);
        System.out.println("El porcentaje de trabajadores que cobran menos de 1000 es del "+(suelmin*100/trabajador)+"%");
    }

    @Override
    public String toString() {
        return "Dinero{" + "trabajador=" + trabajador + ", suelmin=" + suelmin + ", suelmax=" + suelmax + '}';
    }
}
