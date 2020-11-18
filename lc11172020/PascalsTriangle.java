package lc11172020;

import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
	public static void main(String[] args) {
		generate(5);
	}

	public static List<List<Integer>> generate(int numRows) {
		// base case:
		if (numRows <= 0) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);

		for (int i = 1; i < numRows; i++) {
			List<Integer> current = new ArrayList<>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					current.add(1);
				} else if (j == i) {
					current.add(1);
				} else {
					current.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
				}
			}
			result.add(current);
		}

		return result;
	}
}
