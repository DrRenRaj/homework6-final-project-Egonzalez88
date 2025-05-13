package hw6;

import java.util.ArrayList;

public class Library {
    // ArrayList to store Book objects
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a new book to the library
    public void addBook(Book book) {

        // check for duplicate ISBN
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with this ISBN already exists.");
                return; // Exit the method if a duplicate is found
            }
        }
        // If no duplicate ISBN is found, add the book to the list
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Method to remove a book from the library based on ISBN
    public void removeBook(String isbn) {
        // Iterate through the books to find the book with the given ISBN
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b); // Remove the book if found
                System.out.println("Book removed.");
                return; // Exit the method after removing the book
            }
        }
        // If no book with the given ISBN is found
        System.out.println("Book not found.");
    }

    // Method to display all books currently in the library
    public void displayAllBooks() {
        // Check if the library is empty
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\n--- All Books in the Library ---");
            // Iterate through the books and print each book's details
            for (Book b : books) {
                System.out.println(b); // Assuming the Book class has a proper toString() method
                System.out.println("----------------------------");
            }
        }
    }

    // Method to search for books by title (case-insensitive)
    public void searchByTitle(String title) {
        boolean found = false; // Flag to track if any book is found
        System.out.println("\n--- Search Results (by Title: " + title + ") ---");
        // Iterate through the books
        for (Book b : books) {
            // Check if the book's title (in lowercase) contains the search title (in
            // lowercase)
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b);
                found = true; // Set the flag to true if a book is found
                System.out.println("------------------------------------");
            }
        }
        // If no book with the given title is found
        if (!found)
            System.out.println("No book found with that title.");
    }

    // Method to search for books by author (case-insensitive)
    public void searchByAuthor(String author) {
        boolean found = false; // Flag to track if any book is found
        System.out.println("\n--- Search Results (by Author: " + author + ") ---");
        // Iterate through the books
        for (Book b : books) {
            // Check if the book's author (in lowercase) contains the search author (in
            // lowercase)
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(b);
                found = true; // Set the flag to true if a book is found
                System.out.println("-------------------------------------");
            }
        }
        // If no book by the given author is found
        if (!found)
            System.out.println("No book found with that author.");
    }

    // Method to check out a book based on ISBN
    public void checkOutBook(String isbn) {
        // Iterate through the books to find the book with the given ISBN
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                // Check if the book is already checked out
                if (!b.isAvailable()) {
                    System.out.println("Book is already checked out.");
                } else {
                    b.setAvailable(false); // Mark the book as not available
                    System.out.println("Book checked out.");
                }
                return; // Exit the method after processing the book
            }
        }
        // If no book with the given ISBN is found
        System.out.println("Book not found.");
    }

    // Method to return a book based on ISBN
    public void returnBook(String isbn) {
        // Iterate through the books to find the book with the given ISBN
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                // Check if the book is already available
                if (b.isAvailable()) {
                    System.out.println("Book is already available.");
                } else {
                    b.setAvailable(true); // Mark the book as available
                    System.out.println("Book returned.");
                }
                return; // Exit the method after processing the book
            }
        }
        // If no book with the given ISBN is found
        System.out.println("Book not found.");
    }
}