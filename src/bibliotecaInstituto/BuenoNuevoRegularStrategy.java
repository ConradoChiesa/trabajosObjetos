package bibliotecaInstituto;

import java.util.ArrayList;
import java.util.Iterator;

public class BuenoNuevoRegularStrategy implements LibroStrategy {

    @Override
    public Book findBook(String title) {
        boolean find = false;
        Book book, aux;
        ArrayList<Book> books = Biblioteca.getBooks();
        ArrayList<Book> matchBooks = new ArrayList<>();
        Iterator<Book> filter = books.iterator();
        while (filter.hasNext()) {
            aux = filter.next();
            if (aux.getTitle().equalsIgnoreCase(title)) {
                if (aux.getState().equalsIgnoreCase("bueno")){
                    return aux;
                } else if (aux.getState().equalsIgnoreCase("nuevo")) {
                    matchBooks.add(0, aux);
                } else if (aux.getState().equalsIgnoreCase("regular")) {
                    matchBooks.add(1, aux);
                }
            }
            if (matchBooks.get(0) == null) {
                matchBooks.remove(0);
            }
        }
        book = matchBooks.get(0);
        return book;
    }
}
