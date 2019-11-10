package biblioteca;


public class Libro implements Comparable<Libro> {
    int isbn;
    String autor, genero;
    int edicion;

    public Libro(int isbn, String autor, String genero, int edicion) {
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.edicion = edicion;
    }

    @Override
    public int compareTo(Libro l) {
        return this.getIsbn().compareTo(l.getIsbn());
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro: \n-ISBN: "+isbn+"\n-Autor: "+autor+"\n-Genero: "+genero+"\n-Autor: "+autor+"\n-Año de Edición: "+edicion;
    }
}
