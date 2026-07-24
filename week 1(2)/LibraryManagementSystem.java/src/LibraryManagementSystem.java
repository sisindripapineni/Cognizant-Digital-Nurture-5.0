class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void display() {
        System.out.println(
                "ID: " + bookId +
                        ", Title: " + title +
                        ", Author: " + author +
                        ", Status: " + (available ? "Available" : "Issued")
        );
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Design Patterns", "Erich Gamma")
        };

        System.out.println("Library Books:");
        for (Book book : books) {
            book.display();
        }

        System.out.println("\nIssuing Book ID 102:");
        books[1].issueBook();

        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            book.display();
        }

        System.out.println("\nReturning Book ID 102:");
        books[1].returnBook();

        System.out.println("\nFinal Library Books:");
        for (Book book : books) {
            book.display();
        }
    }
}