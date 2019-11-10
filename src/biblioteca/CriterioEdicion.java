package biblioteca;

import java.util.Comparator;

public class CriterioEdicion implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getEdicion().compareTo(l2.getEdicion());
    }
}
