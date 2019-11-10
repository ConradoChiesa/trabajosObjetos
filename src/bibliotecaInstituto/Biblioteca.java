package bibliotecaInstituto;


import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Book> books =new ArrayList<>();

    public Biblioteca() {
        Book libro01 = new Book("Titulo1", "Bueno");
        Book libro02 = new Book("Titulo2", "Regular");
        Book libro03 = new Book("Titulo3", "Nuevo");
        Book libro04 = new Book("Titulo4", "Regular");
        Book libro05 = new Book("Titulo5", "Regular");
        Book libro06 = new Book("Titulo6", "Bueno");
        Book libro07 = new Book("Titulo7", "Nuevo");
        Book libro08 = new Book("Titulo8", "Regular");
        Book libro09 = new Book("Titulo9", "Bueno");
        Book libro10 = new Book("Titulo10", "Nuevo");
        Book libro11 = new Book("Titulo11", "Regular");

        books.add(libro01);
        books.add(libro02);
        books.add(libro03);
        books.add(libro04);
        books.add(libro05);
        books.add(libro06);
        books.add(libro07);
        books.add(libro08);
        books.add(libro09);
        books.add(libro10);
        books.add(libro11);

    }

    public static ArrayList<Book> getBooks() {
        return books;
    }


    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();

    }

}
