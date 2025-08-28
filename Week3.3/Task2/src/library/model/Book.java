package library.model;

public class Book {
    private final String title;
    private final String author;
    private final int isbn;

    public Book (String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getIsbn() {
        return this.isbn;
    }

}
