package lc11182020;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] w) {
		if (w == null || w.length == 0) {
			return "";
		}

		String result = w[0], current;
		for (int i = 1; i < w.length; i++) {
			if (w[i].length() < result.length()) {
				result = result.substring(0, w[i].length());
			}

			// if current index is bigger, then result is the max we can go
			current = w[i].substring(0, result.length());

			// if not match, decrease length by 1 (character), and compare again.
			if (!result.equals(current)) {
				result = result.substring(0, result.length() - 1);
				i--;
			}
		}

		return result;

	}
}
