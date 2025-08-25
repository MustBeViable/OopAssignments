public class Book {
    private String bookTitle;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int year){
        this.bookTitle = title;
        this.author = author;
        this.publicationYear = year;
    }
    public String getBookTitle (){
        return this.bookTitle;
    }

    public void setBookTitle (String newTitle){
        if (!newTitle.isEmpty()) {
            this.bookTitle = newTitle;
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        if (!newAuthor.isEmpty()) {
            this.author = newAuthor;
        }
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int newYear) {
        if (newYear > 0 && newYear <= 2025) {
            this.publicationYear = newYear;
        }
    }
}
