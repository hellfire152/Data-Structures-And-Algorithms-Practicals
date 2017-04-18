package question2;

import java.util.ArrayList;

import sun.applet.Main;

public class AnyMammalNoise {
	public static void main(String[] args) {
		ArrayList<Mammal> m = new ArrayList<>();
		
		m.add(new Dog());
		m.add(new Cat());
		
		for (Mammal mam : m) {
			System.out.println("Mammal noise is : " +mam.makeNoise());
		}
	}
}
