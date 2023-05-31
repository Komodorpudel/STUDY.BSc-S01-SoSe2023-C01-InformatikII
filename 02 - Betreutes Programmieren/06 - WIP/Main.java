import Uebung_6.Book;
import Uebung_6.BookNotFoundException;
import Uebung_6.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // TODO Kommentar
        List<Book> newBooks = List.of(
                new Book("Java Programming", "John Doe", 2010),
                new Book("Python Basics", "Jane Smith", 2015),
                new Book("C# in Depth", "John Doe", 2018),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960)
        );
        library.addBooks(newBooks);

        // TODO Kommentar
        library.addBook(new Book("1984", "George Orwell", 1949));

        // TODO Kommentar
        System.out.println("Alle Bücher der Bibliothek:");
        library.displayBooks();

        // TODO Kommentar
        String author = "John Doe";
        List<Book> booksByAuthor = library.findBooksByAuthor(author);
        System.out.println("\nBücher von " + author + ":");
        booksByAuthor.forEach(System.out::println);

        // TODO Kommentar
        int year = 2012;
        List<Book> booksPublishedAfterYear = library.findBooksPublishedAfter(year);
        System.out.println("\nBücher veröffentlicht nach " + year + ":");
        booksPublishedAfterYear.forEach(System.out::println);

        // TODO Kommentar
        Book book = new Book("Java Programming", "John Doe", 2010);
        try {
            book = library.borrowBook(book);
        } catch (BookNotFoundException e) {
            System.err.println("\nFehler: " + e.getMessage());
        }

        // TODO Kommentar
        try {
            book = library.returnBook(book);
        } catch (BookNotFoundException e) {
            System.err.println("\nFehler: " + e.getMessage());
        }

        // TODO Kommentar
        System.out.println("\nAlle Bücher der Bibliothek nach der Rückgabe:");
        library.displayBooks();
    }
}
