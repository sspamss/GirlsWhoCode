import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books;

    // Constructor, ArrayList is best because add and remove operations are O(1)
    public Library()
    {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void removeBook(String remove)
    {
        // Check if the book is even in the library first before removing it
        if (searchBook(remove) != null)
        {
            this.books.remove(searchBook(remove));
            System.out.println("  >>> Book found. Book removed successfully <<<");
        }
        else
        {
            System.out.println("  >>> Book not found. Book not removed <<<");
        }
    }

    public void bookList()
    {
        for (Book book : books)
            System.out.println(book.bookInformation());
    }

    public Book searchBook(String search)
    {
        for (Book book : books)
            // Use equals() instead of compare() to get the exact match instead of a partial match
            if (book.getIsbn().equals(search) || book.getTitle().equals(search) || book.getAuthor().equals(search))
                return book;

        // Book not found
        return null;
    }

    public void printBookInformation(String search)
    {
        if (searchBook(search) != null)
            System.out.println(searchBook(search).bookInformation());
        else
            System.out.println("  >>> Book not found <<<");
    }

    public void checkoutBook(String toggle)
    {
        // Check if the book is even in the library first before checking it out
        if (searchBook(toggle) != null)
        {
            searchBook(toggle).toggleAvailability();
            if (searchBook(toggle).getIsAvailable().equals("on shelf"))
                System.out.println("  >>> Book found. Book checked in successfully <<<");
            else
                System.out.println("  >>> Book found. Book checked out successfully <<<");}
        else
        {
            System.out.println("  >>> Book not found. Book not checked in or out <<<");
        }
    } 
}