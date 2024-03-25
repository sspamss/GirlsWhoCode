public class Book
{
    // Instance variables
    boolean isAvailable;
    String isbn;
    String title;
    String author;

    // Constructor
    public Book(String isbn, String title, String author)
    {
        this.isbn = isbn; 
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getIsbn() { return this.isbn; }

    public String getTitle() { return this.title; }

    public String getAuthor() { return this.author; }

    public String getIsAvailable() { return this.isAvailable ? "on shelf" : "checked out"; }

    public void toggleAvailability() { this.isAvailable = !this.isAvailable; }

    public String bookInformation()
    {
        return
            "ISBN: " + this.getIsbn() + ", " +
            "Title: " + this.getTitle() + ", " +
            "Author: " + this.getAuthor() + ", " +
            "Available: " + this.getIsAvailable();
    }
}