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
    }
}
