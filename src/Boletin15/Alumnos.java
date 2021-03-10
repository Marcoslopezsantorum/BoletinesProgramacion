package Boletin15;

public class Alumnos {
    String nombre;
    int nota;
    String dni;

    public Alumnos() {
    }

    public Alumnos(String nombre, int nota, String dni) {
        this.nombre = nombre;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", nota=" + nota + ", dni=" + dni;
    }

}
