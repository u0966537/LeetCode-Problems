package lc11232020;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
    	int result = 0;
    	int[] count = new int[58];
    	for(char c : s.toCharArray()) {
    		if(++count[c - 'A'] == 2) {
    			count[c - 'A'] = 0;
    			result += 2;
    		}
    	}
    	
    	return result == s.length() ? result : result + 1;
    	
    }	
}
