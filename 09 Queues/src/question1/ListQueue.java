package question1;

// ====================PUBLIC OPERATIONS========================
// void enqueue(x)		--> Insert x
// Object dequeue()		--> Return and remove least recent item
// boolean isEmpty()	--> Return true if empty; else false
// int size()			--> Return the size of the queue
// Object getFront()	--> Return least recently inserted item
//=======================ERRORS==================================
// getFront or dequeue on empty queue

import java.util.*;

public class ListQueue {
	private ListNode front;
	private ListNode rear;
	private int size;

	// Construct the queue.
	public ListQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	// =========================================================
	// Insert a new item into the queue.
	// =========================================================
	public void enqueue(Object x) {
		if (isEmpty()) {
			// Make queue of one element
			front = new ListNode(x);
			rear = front;
		} else { // Regular case
			rear.next = new ListNode(x);
			rear = rear.next;
		}
		size++;
	}

	// =========================================================
	// Return and remove the least recently inserted item
	// throws NoSuchElementException if the queue is empty.
	// =========================================================
	public Object dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue Empty - " + "dequeue");
		Object returnValue = front.element;
		front = front.next;
		size--;
		return returnValue;
	}

	// ===========================================================
	// Test if the queue is logically empty.
	// ===========================================================
	public boolean isEmpty() {
		return front == null;
	}

	// ===========================================================
	// Return the size of the queue.
	// ===========================================================
	public int size() {
		return size;
	}

	// ===========================================================
	// Get the least recently inserted item in the queue.
	// Does not alter the queue.
	// throws NoSuchElementException if the queue is empty.
	// ===========================================================
	public Object getFront() {
		if (isEmpty())
			throw new NoSuchElementException("Queue Empty -" + "getFront");
		return front.element;
	}

	// ===========================================================
	// View the elements in the queue.
	// part e
	// ===========================================================
	public void viewQueue() {
		int index = 1;
		ListNode cursor = front;
		while (cursor != null) {
			System.out.println("Queue Position " + index + ": "
					+ cursor.element);
			cursor = cursor.next;
			index++;
		}
	}
}
