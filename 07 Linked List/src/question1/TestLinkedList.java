package question1;

// Sample code for creating and printing the linked list.
public class TestLinkedList{
	public static void main (String argv[]){
		LinkedList ll = new LinkedList();
		for (int i = 0; i < 10; i++) {
			ll.insertFirst(java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 21));
		}
		
		ll.displayList();
		
		ll.deleteFirst();
		
		if (ll.find(5) == null) {
			System.out.println("No node with 5!");
		} else {
			System.out.println("There's a 5!");
		}
		if (ll.find(20) == null) {
			System.out.println("No node with 20!");
		} else {
			System.out.println("There's a 20!");
		}
		
		if (ll.insertAfter(5, 20) == null) {
			System.out.println("No node with 5!");
		} else {
			System.out.println("Done!");
		}
		
		ll.displayList();
	}
}
