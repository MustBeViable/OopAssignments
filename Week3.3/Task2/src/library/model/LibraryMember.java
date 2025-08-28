package library.model;

import java.util.ArrayList;
import java.util.Objects;

public class LibraryMember {
    static private int memberIdIndex = 1000;
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = memberIdIndex;
        memberIdIndex++;
    }

    public void addborrowedBook (Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBorrowedBook (Book book) {
        this.borrowedBooks.remove(book);
    }

    public Book getBook(String bookTitle) {
        for (Book b: borrowedBooks) {
            if (Objects.equals(b.getTitle().toLowerCase(), bookTitle.toLowerCase())) {
                borrowedBooks.remove(b);
                return b;
            }
        }
        return null;
    }
}
