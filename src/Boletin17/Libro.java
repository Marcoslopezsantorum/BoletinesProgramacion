package Boletin17;

    public class Libro implements Comparable<Libro>{

        private String titulo;
        private String autor;
        private String ISBN;
        private float prezo;
        private int unidades;

        public Libro() {
        }

        public Libro(String titulo, String autor, String ISBN, float prezo, int unidades) {
            this.titulo = titulo;
            this.autor = autor;
            this.ISBN = ISBN;
            this.prezo = prezo;
            this.unidades = unidades;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public float getPrezo() {
            return prezo;
        }

        public void setPrezo(float prezo) {
            this.prezo = prezo;
        }

        public int getNunidades() {
            return unidades;
        }

        public void setNunidades(int Nunidades) {
            this.unidades = Nunidades;
        }

        @Override
        public String toString() {
            return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades;
        }

        @Override
        public int compareTo(Libro libro) {
            return this.titulo.compareToIgnoreCase(libro.titulo);
        }
}
