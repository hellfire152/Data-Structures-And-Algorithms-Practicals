package question2;

import java.util.ArrayList;

public class MammalNoise {
	public static void main(String[] args) {
		ArrayList<Mammal> m = new ArrayList<>();
		
		m.add(new Dog());
		m.add(new Cat());
		

		System.out.println("Dog noise is : " +m.get(0).makeNoise());
		System.out.println("Cat noise is : " +m.get(1).makeNoise());

	}
}
