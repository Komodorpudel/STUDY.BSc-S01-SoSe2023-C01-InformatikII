import Uebung_6.Book;
import Uebung_6.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // --------------------------------------

    private final List<Book> books;

     // --------------------------------------

    public Library() {
        this.books = new ArrayList<>();
    }

    // --------------------------------------

    public void addBook(Book book) {
        books.add(book);
    }

    // --------------------------------------

    public void addBooks(List<Book> newBooks) {
        books.addAll(newBooks);
    }

    // --------------------------------------

    public List<Book> findBooksByAuthor(String author) {
        // TODO Rückgabewert per Stream ermitteln
        return null;
    }

    // --------------------------------------

    public List<Book> findBooksPublishedAfter(int year) {
        // TODO Rückgabewert per Stream ermitteln
        return null;
    }

    // --------------------------------------

    public void displayBooks() {
        // TODO Ausgabe aller Bücher unter Verwendung einer Methoden-Referenz von system.print (eine Codezeile!)

    }

    // --------------------------------------

    public Book borrowBook(Book book) throws BookNotFoundException {
        // TODO's:
        //        - BookNotFoundException werfen wenn das Buch nicht gefunden wurde
        //        - BookNotFoundException werfen, wenn das Buch schon verliehen ist
        //        - Ansonsten Buch als ausgeliehen markieren
        //        - Konsolen-Ausgabe: "Folgendes Buch wurde ausgeliehen: " + book
        //        - book zurück geben
    }

    // --------------------------------------

    public Book returnBook(Book book) throws BookNotFoundException {
        // TODO's:
        //        - BookNotFoundException werfen, wenn das Buch nicht gefunden wurde
        //        - BookNotFoundException werfen, wenn das Buch gar nicht verliehen ist
        //        - Ansonsten Buch als nicht ausgeliehen markieren
        //        - Konsolen-Ausgabe: "Folgendes Buch wurde zurückgegeben: " + book
        //        - book zurück geben
    }

    // --------------------------------------
    
}
