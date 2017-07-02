package question3;

import java.util.Collections;

public class BookLinkedList {
	// reference to first item in list
	private BookListNode pHead;

	// constructor
	public BookLinkedList() {
		pHead = null;
	}
	
	public void insertFirst(Book value) {
		BookListNode newNode = new BookListNode(value);
		newNode.next = pHead;
		pHead = newNode;
	}

	public void displayList() {
		System.out.print("Linked List: ");
		BookListNode current = pHead; // start of list

		// loop through until end of list

		while (current != null) {
			System.out.print("{" +current.data +'}' + " ");
			current = current.next; // move to next link
		}
		System.out.println();
	}

	// This method returns true if list if empty, false
	// otherwise
	public boolean isEmpty() {
		return (pHead == null);
	}

	// This method removes the first node from the linked
	// list and returns the reference to the deleted node.
	public BookListNode deleteFirst() {
		BookListNode p = null;
		// check if list is not empty
		if (!isEmpty()) {
			p = pHead;
			pHead = pHead.next;
			p.next = null;
		}
		return p;
	}

	// This method searches the linked list for a node
	// with a specified key value and returns a reference
	// to that node
	public BookListNode find(Book key) {
		BookListNode p = pHead;
		// if list is empty
		if (p == null)
			return null;

		while (!p.data.equals(key)) {
			if (p.next == null) // if end of list
				return null; // not found
			else
				p = p.next;
		}
		return p; // find it
	}

	// This method will first search the linked list
	// for the node with a specified key value, using
	// the find method, and insert a new node with
	// the given value.
	public BookListNode insertAfter(Book key, Book value) {
		BookListNode p = find(key);
		// if list is empty or key not found,
		// insert fail
		if (p == null)
			return null;
		BookListNode newNode = new BookListNode(value);
		newNode.next = p.next;
		p.next = newNode;
		return newNode;
	}

	// This method deletes the node from the linked
	// link with the specified key value.
	public BookListNode delete(Book key) {
		BookListNode curr = pHead;
		BookListNode prev = pHead;

		if (curr == null) // if list is empty
			return null;

		while (!curr.data.equals(key)) {
			if (curr.next == null) // if end of list
				return null; // not found
			else {
				prev = curr;
				curr = curr.next;
			}
		}
		// find it
		if (curr == pHead) // if the first node
			pHead = pHead.next;
		else
			prev.next = curr.next;
		// set the next ref to null
		curr.next = null;
		return curr;
	}
	
	public void insertInOrder(Book b) {
		BookListNode current = pHead;
		if(current == null) { //if empty list
			pHead = new BookListNode(b); //set inserted Book as head
			return;
		}
		if(b.compareTo(current.data) <= 0) {//if before pHead
			insertFirst(b);
			return;
		}
		//keeps going until it reaches the end OR reaches an Book that is "after" the inserted book
		while(current.next != null && b.compareTo(current.next.data) > 0) {
			current = current.next;
		}
		//insertion (using the insertAfter method)
		System.out.println("INSERT AFTER");
		insertAfter(current.data, b);
	}
	
	public Book get(int index) {
		try {
			{	
				BookListNode current = pHead;
				for(int i = 0; i < index; i++) {
					current = current.next;
				}
				return current.data;
			}
		} catch(NullPointerException e) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public int size() {
		if(pHead == null) return 0;
		int size = 1;
		for(BookListNode current = pHead;
				current.next != null; current = current.next) {
			size++;
		}
		return size;
	}
	
	public static BookLinkedList sort(BookLinkedList bList) {
		BookLinkedList sortedList = new BookLinkedList();
		//using insertInOrder to place books in order
		for(int i = 0; i < bList.size(); i++) {
			sortedList.insertInOrder(bList.get(i));
		}
		//link this head to the sortedList head, leaving
		//the unsorted list to the garbage collector
		return sortedList;
	}
}
