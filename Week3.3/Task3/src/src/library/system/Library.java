package src.library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private final ArrayList<LibraryMember> libraryMembers = new ArrayList<>();
    private final ArrayList<Book> libraryBooks = new ArrayList<>();

    public void addBooks (Book book) {
        this.libraryBooks.add(book);
    }

    public LibraryMember addMembers (String name) {
        LibraryMember newMember = new LibraryMember(name);
        this.libraryMembers.add(newMember);
        return newMember;
    }

    public boolean reserveBook (String title, LibraryMember member) {
        Book book;
        boolean reserveable = false;
        for (Book b : libraryBooks) {
            if (Objects.equals(b.getTitle().toLowerCase(), title.toLowerCase())) {
                book = b;
                reserveable = true;
                member.reserveBook(book);
                book.setReserved(true);
                return reserveable;
            }
        }
        if (!reserveable) {
            return reserveable;
        } else {
            return reserveable;
        }
    }

    public void cancelReservation(LibraryMember member, String title) {
        for (Book b : libraryBooks) {
            if (Objects.equals(b.getTitle().toLowerCase(), title.toLowerCase())) {
                if (b.isReserved() && member.isHasReservedBooks()) {
                    b.setReserved(false);
                    member.cancelReservation(b);
                    break;
                }
            }
        }
    }

    public Book borrowBook (String title, LibraryMember member) {
        for (Book book : this.libraryBooks) {
            if (Objects.equals(book.getTitle().toLowerCase(), title.toLowerCase())) {
                if (!book.isReserved() || member.isReservedForThisMember(book)) {
                    member.addborrowedBook(book);
                    libraryBooks.remove(book);
                    return book;
                } else {
                    System.out.println("Book " + book.getTitle() + " is reserved to someone.");
                    return book;
                }
            }
        } return null;
    }

    public void returnBook (Book book, LibraryMember member) {
        member.returnBorrowedBook(book);
        this.libraryBooks.add(book);
    }

    public void getStock () {
        if (!libraryBooks.isEmpty()) {
            System.out.println("\nList of available books:\n");
            for (Book book : libraryBooks) {
                System.out.printf("Title: %s Author: %s ISBN: %d",
                        book.getTitle(), book.getAuthor(), book.getIsbn());
                if (!book.isReserved()) {
                    System.out.println(" Available");
                } else {
                    System.out.println(" Not available");
                }
            }
        }
    }

}
