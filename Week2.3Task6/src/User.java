import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks = new ArrayList<>();

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addBorrowedBook(String title) {
        borrowedBooks.add(title);
    }

    public void removeBorrowedBook(String title) {
        borrowedBooks.remove(title);
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}
