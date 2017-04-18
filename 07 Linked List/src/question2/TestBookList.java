package question2;

public class TestBookList {
	public static void main(String[] args) {
		BookLinkedList list = new BookLinkedList();
		BookListNode p;

		Book john = new Book("1234", "John"); 
		Book eric = new Book("5678", "Eric");
		Book phoon = new Book("9999", "Phoon");
		
		list.insertFirst(john);
		list.insertFirst(eric);
		list.insertAfter(eric, phoon);
		list.displayList();
		
		p = list.find(phoon);
		if (p != null) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
		System.out.println(list.find(new Book("5678", "John")).data);
	}
}
