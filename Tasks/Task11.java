package Tasks;

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    // Constructor to initialize attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Overriding toString() to format the book details
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        // Instantiate three Book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Printing book details using toString() implicitly
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}