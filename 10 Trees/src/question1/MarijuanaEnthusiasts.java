package question1;

public class MarijuanaEnthusiasts {
	static BSTree tree = new BSTree();
	public static void main(String[] args) {
		int[] ints = {28, 14, 21, 35, 7, 84, 56, 42};
		for (int i : ints) {
			tree.add(i);
		}
		
		tree.inOrderPrint();
		tree.preOrderPrint();
		tree.postOrderPrint();
	}

}
