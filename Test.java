import java.util.InputMismatchException;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int option = 0;
        Library library = new Library();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Library Management System");
        System.out.println("-------------------------");
        do
        {
            try
            {
                System.out.println("Options:");
                System.out.println("  (1) Add a book");
                System.out.println("  (2) Remove a book");
                System.out.println("  (3) List all books");
                System.out.println("  (4) Search for a book");
                System.out.println("  (5) Checkout a book");
                System.out.println("  (6) Exit");
                System.out.print("Option selected: ");
                option = scan.nextInt();

                // Check if input is valid, do not use "throw new" exception because it will terminate the program
                if (option < 1 || option > 6)
                {
                    System.out.println("~~~ Invalid option. Options are from 1 to 5 ~~~");
                    scan.next();
                    continue;
                }
            }
            catch (InputMismatchException error)
            {
                System.out.println("~~~ Invalid option. Option must be a number ~~~");
                scan.next();
                continue;
            }

            // Add a book
            if (option == 1)
            {
                String isbn;
                scan.nextLine();
                do
                {
                    System.out.print("  Enter ISBN: ");
                    isbn = scan.nextLine();
                    if (!isbn.matches("\\d{13}")) System.out.println("  ~~~ ISBN must be 13 digits long ~~~");
                }
                while(!isbn.matches("\\d{13}"));
                System.out.print("  Enter title: ");
                String title = scan.nextLine();
                System.out.print("  Enter author: ");
                String author = scan.nextLine();
                Book book = new Book(isbn, title, author);
                library.addBook(book);
                System.out.println();
            }
            // Remove a book
            else if (option == 2)
            {
                scan.nextLine();
                System.out.print("  Enter ISBN, title, or author: ");
                String search = scan.nextLine();
                library.removeBook(search);
                System.out.println();
            }
            // List all books
            else if (option == 3)
            {
                library.bookList();
                System.out.println();
            }
            // Search for a book
            else if (option == 4)
            {
                scan.nextLine();
                System.out.print("  Enter ISBN, title, or author: ");
                String search = scan.nextLine();
                library.printBookInformation(search);
                System.out.println();
            }
            // Checkout a book (toggle availability)
            else if (option == 5)
            {
                scan.nextLine();
                System.out.print("  Enter ISBN, title, or author: ");
                String search = scan.nextLine();
                library.checkoutBook(search);
                System.out.println();
            }
            // Exit
            else
            {
                break;
            }
        }
        while(true);

        scan.close();

        System.out.println("Program terminated");
    }
}
