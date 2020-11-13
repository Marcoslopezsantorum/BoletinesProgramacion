package Boletin4;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;


    public Libro(){

    }
    public Libro (String t,String au,int an,short np,float val){

        titulo = t;
        autor = au;
        ano = an;
        numPaginas = np;
        valoracion = val;

    }


    public void setTitulo(String t){
        titulo = t;

    }
    public String getTitulo(){
        return titulo;

    }
    public void setAutor (String au){
        autor = au;

    }
    public String getAutor(){
        return autor;
    }
    public void setAno(int an){
        ano =an;
    }
    public int getAno(){
        return ano;
    }
    public void setNumPaginas (short np){
        numPaginas = np;
    }
    public short getNumPagina(){
        return numPaginas;
    }
    public void setValoracion (float val){
        valoracion = val;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void amosar () {
        System.out.println ("título = " + titulo + "\nautor = "+ autor + "\nano = " + ano + "\nnumPaginas = " + numPaginas+ "\nvaloracion = " + valoracion+"\n-----");
    }
}
