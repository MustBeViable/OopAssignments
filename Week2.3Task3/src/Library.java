import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int index = 1;
        for (Book book : books) {
            System.out.printf("%d. Title: %s, Author: %s, pub. year: %d\n",
                    index, book.getBookTitle(), book.getAuthor(), book.getPublicationYear());
            index++;
        }
    }

    public void findBooksByAuthor(String author) {
        int index = 1;
        System.out.println("Book(s) from author " + author);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("%d. Title: %s, pub. year: %d\n",
                        index, book.getBookTitle(), book.getPublicationYear());
                index++;
            }
        }
    }

    public void borrowBook(String title) {
        Book borrowedBook = null;
        for (Book book : books) {
            if (book.getBookTitle().equals(title)) {
                borrowedBook = book;
            }
        }
        if (borrowedBook != null) {
            books.remove(borrowedBook);
        } else {
            System.out.println("No books with title \"" + title + "\" in the library.");
        }
    }

    public void returnBook(Book book) {
        if (!books.contains(book)) {
            addBook(book);
        }
    }

    public boolean isBookAvailable(String title) {
        boolean titleFound = false;
        for (Book book : books) {
            if (book.getBookTitle().equals(title)) {
                titleFound = true;
            }
        } return titleFound;
    }
}
