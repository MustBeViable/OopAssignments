package src.library.model;

import library.model.Book;

import java.util.ArrayList;
import java.util.Objects;

public class LibraryMember {
    static private int memberIdIndex = 1000;
    private boolean hasReservedBooks = false;
    private String name;
    private final int memberId;

    private final ArrayList<Book> borrowedBooks = new ArrayList<>();
    private final ArrayList<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = memberIdIndex;
        memberIdIndex++;
    }

    public void addborrowedBook (Book book) {
        if (!book.isReserved()) {
            this.borrowedBooks.add(book);
        }
    }

    public boolean isHasReservedBooks() {
        return hasReservedBooks;
    }

    public void cancelReservation (Book book) {
        reservedBooks.removeIf(b -> Objects.equals(book.getTitle().toLowerCase(), b.getTitle().toLowerCase()));
    }

    /* removeIf for looppina mitä eka pistin
            for (Book b : reservedBooks) {
            if (Objects.equals(book.getTitle().toLowerCase(), b.getTitle().toLowerCase())) {
                reservedBooks.remove(b);
            }
        }
     */

    public boolean isReservedForThisMember (Book book) {
        if (!reservedBooks.isEmpty()){
            for (Book b : reservedBooks) {
                if (Objects.equals(book.getTitle().toLowerCase(), b.getTitle().toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        } return false;
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void reserveBook(Book book) {
            reservedBooks.add(book);
            if (!this.hasReservedBooks) {
                this.hasReservedBooks = true;
            }
    }

    public void returnBorrowedBook (Book book) {
        this.borrowedBooks.remove(book);
        if (reservedBooks.isEmpty()) {
            this.hasReservedBooks = false;
        }
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
