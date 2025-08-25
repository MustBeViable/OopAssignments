public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Lotr", "Tolkien", 1940);
        Book book2 = new Book("Hobbits", "Tolkien", 1939);
        Book book3 = new Book("Potter", "Rowling", 1990);
        Book book4 = new Book("GoT", "Martin", 1996);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBooks();

        library.findBooksByAuthor("Tolkien");

        System.out.println("Borrowin book " + book1.getBookTitle());

        library.borrowBook(book1.getBookTitle());

        System.out.println("List of books now: \n");

        library.displayBooks();

        System.out.println("\nReturning book " + book1.getBookTitle() + "\n");

        System.out.println("List of books now: \n");

        library.returnBook(book1);

        library.displayBooks();

        library.borrowBook("Muumit");
    }
}
