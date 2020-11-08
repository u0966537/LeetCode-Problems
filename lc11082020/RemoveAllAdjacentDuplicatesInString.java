package lc11082020;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	/**
	 * Stack: push every character into stack and pop out.
	 * 
	 * @param S
	 * @return
	 */
	public String removeDuplicates(String S) {
		// base case:
		if (S == null || S.length() == 0) {
			return "";
		}

		Stack<Character> stack = new Stack<>();
		Stack<Character> popStack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			stack.push(S.charAt(i));
		}

		while (!stack.isEmpty()) {
			char current = stack.pop();

			if (!popStack.isEmpty() && current == popStack.peek()) {
				popStack.pop();
			}
			else {
				popStack.push(current);
			}
		}
		
		while(!popStack.isEmpty()) {
			sb.append(popStack.pop());
		}
		
		return sb.toString();
	}
}
