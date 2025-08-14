package BTVN_BUOI_6;

public class Book {

    private static int idCounter = 1;
    private int bookId  ;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = idCounter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book (String title, String author, double price){
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public void displayInFo(){
        System.out.println("BookID: " + this.bookId);
        System.out.println("Title: " + this.title );
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public void displayInFo(boolean showPublisher){
        displayInFo();
        if (showPublisher){
            System.out.println("Publisher: " + this.publisher);
        }
        else {
            System.out.println("Publisher: Unknown" );
        }
    }


    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Book.idCounter = idCounter;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookID) {
        this.bookId = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
