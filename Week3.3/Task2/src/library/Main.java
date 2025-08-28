package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    static Library newLibrary = new Library();
    public static void main(String[] args) {
        newLibrary.addBooks(new Book("Harry Potter", "Rowling", 123456));
        newLibrary.addBooks(new Book("The song of ice and fire", "Martin", 123457));
        newLibrary.addBooks(new Book("The lord of the rings", "Tolkien", 123458));
        newLibrary.addBooks(new Book("The Hobbits", "Tolkien", 123459));
        newLibrary.addBooks(new Book("Metro 2033", "Gluhovski", 123460));
        newLibrary.addBooks(new Book("1984", "Orwell", 123461));

        LibraryMember member1 = newLibrary.addMembers("Elias");
        LibraryMember member2 = newLibrary.addMembers("Sakari");
        LibraryMember member3 = newLibrary.addMembers("Juho");
        LibraryMember member4 = newLibrary.addMembers("Leevi");

        newLibrary.getStock();

        newLibrary.borrowBook("Harry Potter", member1);
        newLibrary.borrowBook("The song of ice and fire", member1);
        newLibrary.borrowBook("The lord of the rings", member2);
        newLibrary.borrowBook("The Hobbits", member3);
        newLibrary.borrowBook("1984", member4);

        newLibrary.getStock();

        newLibrary.returnBook(member1.getBook("Harry Potter"), member1);

        newLibrary.getStock();

        newLibrary.returnBook(member1.getBook("The song of ice and fire"), member1);

        newLibrary.getStock();

    }
}
