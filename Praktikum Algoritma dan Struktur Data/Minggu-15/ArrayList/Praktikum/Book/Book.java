package Praktikum.Book;

public class Book {
    public String isbn, title;

    public Book() {}
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    public String toString() {
        return String.format("ISBN: %s Title: %s", this.isbn, this.title);
    }
}
