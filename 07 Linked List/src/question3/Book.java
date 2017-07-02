package question3;

//--------------------------------------------------------
// Practical  7 Question 2 (Given)
// Sample code for creating and printing the linked list.
// A node in the linked list consists of data item and
// a reference to next node in a singly-linked list
// An object to be used in the linked list.
//--------------------------------------------------------
public class Book implements Comparable<Book>{
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
	
	/**
	 * Comapares based on the author's name first, then the isbn number
	 */
	@Override
	public int compareTo(Book b) {
		int result = author.compareTo(b.getAuthor());
		if(result == 0) {
			return isbn.compareTo(b.getIsbn());
		} else return result;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
