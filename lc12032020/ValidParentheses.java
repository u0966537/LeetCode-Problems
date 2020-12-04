package lc12032020;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s == null || s.length() <= 1) {
			return false;
		}

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == '(' || temp == '{' || temp == '[') {
				stack.push(temp);
			} else {

				if (stack.isEmpty()) {
					return false;
				} else if (temp == '}' && stack.peek() != '{') {
					return false;
				} else if (temp == ')' && stack.peek() != '(') {
					return false;
				} else if (temp == ']' && stack.peek() != '[') {
					return false;
				}

				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
