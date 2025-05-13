package hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Create an instance of the Library class to manage books
        Library library = new Library();

        int choice; // Variable to store the user's menu choice

        // Do-while loop to continuously display the menu until the user chooses to exit
        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search by Title");
            System.out.println("5. Search by Author");
            System.out.println("6. Check Out Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt(); // Read the user's menu choice
            sc.nextLine(); // Consume the newline character left by nextInt()

            // Switch statement to perform actions based on the user's choice
            switch (choice) {
                case 1: // Add a new book
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    // Create a new Book object and add it to the library
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2: // Remove a book by ISBN
                    System.out.print("Enter ISBN to remove: ");
                    library.removeBook(sc.nextLine());
                    break;
                case 3: // Display all books in the library
                    library.displayAllBooks();
                    break;
                case 4: // Search for books by title
                    System.out.print("Enter title to search: ");
                    library.searchByTitle(sc.nextLine());
                    break;
                case 5: // Search for books by author
                    System.out.print("Enter author to search: ");
                    library.searchByAuthor(sc.nextLine());
                    break;
                case 6: // Check out a book by ISBN
                    System.out.print("Enter ISBN to check out: ");
                    library.checkOutBook(sc.nextLine());
                    break;
                case 7: // Return a book by ISBN
                    System.out.print("Enter ISBN to return: ");
                    library.returnBook(sc.nextLine());
                    break;
                case 8: // Exit the program
                    System.out.println("Exiting...");
                    break;
                default: // Handle invalid menu choices
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8); // Continue the loop until the user chooses to exit (option 8)

        sc.close(); // Close the Scanner object to release system resources
    }
}

/*
 * books to test
 * 
 * Title: The Fellowship of the Ring
 * Author: J.R.R. Tolkien
 * ISBN: 10006
 * Availability: Available
 * 
 * Title: Harry Potter
 * Author: J.K. Rowling
 * ISBN: 10007
 * Availability: Checked Out
 * 
 * Title: To Kill a Mockingbird
 * Author: Harper Lee
 * ISBN: 10008
 * Availability: Available
 * 
 * Title: Star Wars: A New Hope
 * Author: George Lucas
 * ISBN: 10009
 * Availability: Available
 * 
 * Title: The Perks of Being a Wallflower
 * Author: Stephen Chbosky
 * ISBN: 10010
 * Availability: Checked Out
 */