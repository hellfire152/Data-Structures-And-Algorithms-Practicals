package question2;

// A node in the linked list consists of integer 
// data item and a reference to next node 
// in a singly-linked list

public class BookListNode {		
	Book data;				
	BookListNode next;		 	
	
	// Constructor	
	public BookListNode (Book value) {		
		data = value;		
		next = null;	
	}
}
