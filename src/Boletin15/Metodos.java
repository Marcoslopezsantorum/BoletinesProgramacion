package Boletin15;

import javax.swing.*;

public class Metodos {
    public void amosarArray(int[]lista){

        int[]numeros=new int[6];
        int x=0,aux;
        for(int i=0;i<numeros.length;i++){

            x=(int)(Math.random()*(50-1)+1);
            numeros[i]=x;

        }
        for(int i=0;i<numeros.length-1;i++){

            for(int j=0;j<numeros.length-1;j++){

                if(numeros[j]<numeros[j+1]){

                    aux=numeros[j+1];
                    numeros[j+1]=numeros[j];
                    numeros[j]=aux;
                }
            }

        }
        for(int i=0;i<numeros.length;i++){
            System.out.println("Aleatorio= "+numeros[i]);
        }






    }
    public void notasArray(){

        int[]notas=new int[30];

        int x=0;
        for(int i=0;i<notas.length;i++){

            x=(int)(Math.random()*(10-1)+1);
            notas[i]=x;



        }

        int countAprobado=0;
        int countSuspenso=0;
        int countMedia=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>5){

                countAprobado+=1;

            }else{
                countSuspenso+=1;
            }
            countMedia+=notas[i];



        }
        System.out.println("aprodos: "+countAprobado);
        System.out.println("suspensos: "+countSuspenso);
        int media;
        media=countMedia/notas.length;
        System.out.println("media= "+media);
        int aux;
        for(int i=0;i<notas.length-1;i++){

            for(int j=0;j<notas.length-1;j++){

                if(notas[j]<notas[j+1]){

                    aux=notas[j+1];
                    notas[j+1]=notas[j];
                    notas[j]=aux;
                }
            }

        }
        System.out.println("Nota mas alta = "+notas[0]);

    }
    public void nomeArray(){

        Alumnos[]Alumnos=new Alumnos[5];
        Alumnos[0] = new Alumnos("Marcos" , 2 , "45982571P");
        Alumnos[1] = new Alumnos("Lara", 3 , "95762584Y");
        Alumnos[2] = new Alumnos("Pedro" , 4 , "15384952H");
        Alumnos[3] = new Alumnos("Paulo" ,  5 , "25456987L");
        Alumnos[4] = new Alumnos("Fiona" ,6 , "25879642N");

        int countAprobado=0;
        int countSuspenso=0;
        int countMedia=0;
        for(Alumnos ele:Alumnos){
            if(ele.getNota()>=5){

                countAprobado+=1;

            }else{
                countSuspenso+=1;
            }
            countMedia+=ele.getNota();



        }
        System.out.println("aprobados: "+countAprobado);
        System.out.println("suspensos: "+countSuspenso);
        int media;
        media=countMedia/Alumnos.length;
        System.out.println("media= "+media);
        int aux;
        String auxnm;
        for(int i=0;i<Alumnos.length-1;i++){

            for(int j=0;j<Alumnos.length-1;j++){

                if(Alumnos[j].nota<Alumnos[j+1].nota){

                    aux=Alumnos[j+1].nota;
                    auxnm=Alumnos[j+1].nombre;
                    Alumnos[j+1].nota=Alumnos[j].nota;
                    Alumnos[j+1].nombre=Alumnos[j].nombre;
                    Alumnos[j].nota=aux;
                    Alumnos[j].nombre=auxnm;
                }
            }

        }
        System.out.println("Nota mas alta = "+Alumnos[0].nota);

        System.out.println("Nota del alumno de 1: "+Alumnos[0].nota);

        System.out.println("Lista de aprobados:");
        for(Alumnos ele:Alumnos){

            if(ele.nota>=5){
                System.out.println(ele.nombre);
            }

        }

        Alumnos aux1;
        for(int i=0; i<Alumnos.length-1;i++){
            for (int j=i+1;j<Alumnos.length;j++){
                if(Alumnos[i].getNota()>Alumnos[j].getNota()){
                    aux1=Alumnos[i];
                    Alumnos[i]=Alumnos[j];
                    Alumnos[j]=aux1;

                }
            }
        }
        System.out.println("lista ordenada");

        String nombre= JOptionPane.showInputDialog("Introduce el nombre del  alumno :");

        boolean atopado = false;

        for(Alumnos ele:Alumnos){

            if(nombre.equals(ele.getNombre())){
                System.out.println("El alumno  "+ele.nombre+" su nota es:"+ele.nota+" y su dni es: "+ele.dni);
                atopado = true;
            }

        }
        if(atopado == false)
            System.out.println("Non esta");
//

    }

}
