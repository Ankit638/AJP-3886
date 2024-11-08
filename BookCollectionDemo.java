import java.util.ArrayList;

// Book class definition
class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods for accessing book details
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}

public class BookCollectionDemo {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding Book objects to the ArrayList
        bookList.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(2, "1984", "George Orwell"));
        bookList.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));

        // Display all book details using advanced for loop
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
}
