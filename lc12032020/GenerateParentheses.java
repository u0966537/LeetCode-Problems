package lc12032020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, n);
		return result;
	}

	public void backtrack(List<String> result, String cur, int open, int close, int max) {
		// base case:
		// when n = 1, the length of string can only be 2, 
		// when n = 2, then length of string can only be 4, and so on.
		// length = n * 2
		if (cur.length() == max * 2) {
			result.add(cur);
			return;
		}

		if (open < max)
			backtrack(result, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(result, cur + ")", open, close + 1, max);
	}

}
