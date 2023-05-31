package Uebung_6;

import java.util.Objects;

class Book {

    // --------------------------------------

    private final String title;
    private final String author;
    private final int year;
    private boolean borrowed;

    // --------------------------------------

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    // --------------------------------------

    public String getTitle() {
        return title;
    }

    // --------------------------------------

    public String getAuthor() {
        return author;
    }

    // --------------------------------------

    public int getYear() {
        return year;
    }

    // --------------------------------------

    @Override
    public String toString() {
        return title + " von " + author + " (" + year + ")";
    }

    // --------------------------------------

    public boolean isBorrowed() {
        return borrowed;
    }

    // --------------------------------------

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // --------------------------------------

    @Override
    public boolean equals(Object obj) {
        Book bookToCompare;
        if(!this.getClass().isInstance(obj))
            return false;
        else
            bookToCompare = (Book) obj;

        if(!Objects.equals(this.author, bookToCompare.author))
            return false;
        if(this.year != bookToCompare.year)
            return false;
        return Objects.equals(this.title, bookToCompare.title);
    }

    // --------------------------------------

}
