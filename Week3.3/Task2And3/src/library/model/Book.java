package library.model;

public class Book {
    private final String title;
    private final String author;
    private final int isbn;
    private boolean reserved = false;

    public Book (String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public boolean isReserved() {
        return this.reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
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
