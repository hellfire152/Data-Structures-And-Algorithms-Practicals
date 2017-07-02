package question3;

public class TestBookList {
	public static void main(String[] args) {
		BookLinkedList list = new BookLinkedList();
		BookListNode p;

		Book john = new Book("1234", "John"); 
		Book eric = new Book("5678", "Eric");
		Book fred = new Book("1111", "Fred");
		Book ang = new Book("5555", "Ang");
		Book phoon = new Book("9999", "Phoon");

		list.insertFirst(john);
		list.insertFirst(eric);
		list.insertAfter(eric, phoon);
		list.insertFirst(ang);
		list.insertFirst(fred);
		
		System.out.println("UNSORTED LIST: ");
		list.displayList();
		
		System.out.println("SORTED LIST: ");
		BookLinkedList.sort(list).displayList();
	}
}
