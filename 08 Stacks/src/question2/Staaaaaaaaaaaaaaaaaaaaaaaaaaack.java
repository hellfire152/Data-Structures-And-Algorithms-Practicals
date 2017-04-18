package question2;

import java.util.Scanner;
import java.util.Stack;

public class Staaaaaaaaaaaaaaaaaaaaaaaaaaack {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		Stack<Character> s = new Stack();
		for (int i = 0; i < input.length(); i++) {
			s.push(input.charAt(i));
		}
		Stack<Character> s2 = (Stack<Character>)s.clone();
		//(i)
		while(!s.empty()) {
			System.out.println(s.pop());
		}
		//(ii)
		String str = "";
		while(!s2.empty()) {
			str += s2.pop();
		}
		System.out.println(str);
	}
}
