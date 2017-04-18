package question3;

import java.util.Stack;

public class Staaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaack {
	public static void main(String[] args) throws Exception {
		String input = args[0];
		
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(') {
				s.push('(');
			} else {
				if (c == ')') {
					if (s.empty()) {
						throw new Exception("lmaoooooooooooo");
					} else {
						s.pop();
					}
				}
			}
		}
		if (!s.empty()) {
			throw new Exception();
		}
	}
}
