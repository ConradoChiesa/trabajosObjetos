package biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro l) {
        libros.add(l);
    }

    public List<Libro> getLibros() {
        List<Libro>aux = new ArrayList<>(libros);
        Collections.sort(aux);
        return aux;
    }

    public List<Libro> getLibrosPorAutor() {
        List<Libro>aux = new ArrayList<>(libros);
        Collections.sort(aux, new CriterioAutor());
        return aux;
    }

    public List<Libro> getLibrosPorGenero() {
        List<Libro>aux = new ArrayList<>(libros);
        Collections.sort(aux, new CriterioGenero());
        return aux;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro(1, "Chespirito", "comedia",1978);
        Libro libro2 = new Libro(2, "McAllister", "deporte",1998);
        Libro libro3 = new Libro(3, "Luis Novaresio", "periodismo",2009);

        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro3);
        System.out.println(biblioteca.getLibros().toString());

        System.out.println(biblioteca.getLibros().toString());
    }

}
