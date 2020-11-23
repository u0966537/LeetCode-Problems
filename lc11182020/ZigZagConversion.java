package lc11182020;

public class ZigZagConversion {

	public static void main(String[]args) {
		convert("PAYPALISHIRING", 3);
	}
	public static String convert(String s, int numRows) {

		if (numRows == 1) {
			return s;
		}

		StringBuilder[] dp = new StringBuilder[numRows];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = new StringBuilder();
		}

		for (int i = 0; i < s.length(); i++) {
			int index = i % (2 * numRows - 2);
			index = index < numRows ? index : 2 * numRows - 2 - index;
			dp[index].append(s.charAt(i));
		}

		for (int i = 1; i < dp.length; i++) {
			dp[0].append(dp[i]);
		}

		return dp[0].toString();

	}

	public static String convert2(String s, int numRows) {

		if (numRows == 1)
			return s;

		StringBuilder ret = new StringBuilder();
		int n = s.length();
		int cycleLen = 2 * numRows - 2;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < n; j += cycleLen) {
				ret.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
					ret.append(s.charAt(j + cycleLen - i));
			}
		}

		return ret.toString();
	}

}
