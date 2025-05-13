package hw6;

public class Book {
	// Fields
	private String title, author, isbn;
	private boolean isAvailable;
	
	// Constructor
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true;
	}
	
	// Getters
	public String getTitle() {
		return title;}
	public String getAuthor() {
		return author;}
	public String getIsbn() {
		return isbn; }
	public boolean isAvailable() {
		return isAvailable; }
	
	// Setter
	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}
	
	// toString Method
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: "+ isbn + ",Available: "+ isAvailable;
	
	}

}