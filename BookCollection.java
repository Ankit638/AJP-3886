import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String displayDetails() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Adding Book objects to the ArrayList
        books.add(new Book(1, "Software Testing", "Aditya P. Mathur"));
        books.add(new Book(2, "Internet of Things", "Raj Kamal"));
        books.add(new Book(3, "Theory of Computation", "Micheal Sipser"));
        books.add(new Book(4, "FLAT", "John E. Hopcroft"));

        // Displaying all book details using enhanced for loop
        for (Book book : books) {
            System.out.println(book.displayDetails());
        }
    }
}