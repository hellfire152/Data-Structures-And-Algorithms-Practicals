package question2;

//--------------------------------------------------------
// Practical  7 Question 2 (Given)
// Sample code for creating and printing the linked list.
// A node in the linked list consists of data item and
// a reference to next node in a singly-linked list
// An object to be used in the linked list.
//--------------------------------------------------------
public class Book {
	private String isbn;
	private String author;

	// Constructor
	public Book(String i, String a) {
		isbn = i;
		author = a;
	}

	// Override toString() in Object class
	public String toString() {
		return isbn + " " + author;
	}

	// Override equals() in Object class
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		return (this.isbn.equals(b.isbn));
	}
}
