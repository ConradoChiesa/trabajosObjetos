package biblioteca;

import java.util.Comparator;

public class CriterioGenero implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getGenero().compareTo(l2.getGenero());
    }
}
