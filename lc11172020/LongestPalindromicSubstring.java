package lc11172020;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		if(s == null || s.length()== 0) {
			return s;
		}
		
		String res = "";
		boolean [][] dp = new boolean[s.length()][s.length()];
		int max = 0;
		for(int j = 0; j < s.length(); j++) {
			for(int i = 0; i <= j; i++) {
				dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i <= 2) || dp[i+1][j-1]);
				if(dp[i][j]) {
					if(j - i + 1 > max) {
						max = j - i + 1;
						res = s.substring(i, j + 1);
					}
				}
			}
		}
		return res;
	}
	
	
	String res = "";
	public String longestPalindrome2(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		
		for(int i = 0; i < s.length(); i++) {
			helper(s, i, i); // odd, single
			helper(s, i, i+1); // even, double
		}
		return res;
	}
	
	private void helper(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		// because we just left-- and right++, so we need to plus 1 to left, but not right since it's exclusive.
		String current = s.substring(left + 1, right);
		if(current.length() > res.length()) {
			res = current;
		}
	}
}
