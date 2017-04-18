package question1;

import java.util.Scanner;
import java.util.Stack;

public class Staaaaaaaack {
	static Stack<String> stack = new Stack<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Staaaaaaaaaaaack");
		
		while(true) {
			System.out.print("Enter a word: ");
			
			String input = sc.next();
			if (input.equalsIgnoreCase("quit")) {
				break;
			}
			stack.push(input);
		}
		System.out.println("Display in reverse order...\n");
		
		System.out.println("Words in reverse order...");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
