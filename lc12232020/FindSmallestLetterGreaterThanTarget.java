package lc12232020;

public class FindSmallestLetterGreaterThanTarget {
	public char nextGreatestLetter(char[] letters, char target) {
		if(letters == null || letters.length == 0) {
			return ' ';
		}
		
        int lo = 0, hi = letters.length;
        
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) {
            	lo = mi + 1;
            }
            else {
            	hi = mi;
            }
        }
        
        // if target is the biggest char from the letters, then return letters[0]
        return letters[lo % letters.length];
		
	}
}
