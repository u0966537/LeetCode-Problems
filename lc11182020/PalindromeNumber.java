package lc11182020;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String value = String.valueOf(x);
		int start = 0, end = value.length() - 1;
		
		while(start < end) {
			if(value.charAt(start) != value.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		return true;

	}
}
