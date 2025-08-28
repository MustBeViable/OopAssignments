package library.system;

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

    public Book borrowBook (String title, LibraryMember member) {
        Book bookToBeBorrowed;
        for (Book book : this.libraryBooks) {
            if (Objects.equals(book.getTitle().toLowerCase(), title.toLowerCase())) {
                bookToBeBorrowed = book;
                this.libraryBooks.remove(book);
                member.addborrowedBook(book);
                return bookToBeBorrowed;
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
                System.out.printf("Title: %s Author: %s ISBN: %d\n",
                        book.getTitle(), book.getAuthor(), book.getIsbn());
            }
        }
    }

}
