package lc11112020;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public  int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;

		Set<Character> set = new HashSet<Character>();
		int res = 0, start = 0, end = 0;

		while (res < s.length() && end < s.length()) {
			if (set.contains(s.charAt(end))) {
				set.remove(s.charAt(start));
				start++;
			} else {
				set.add(s.charAt(end));
				res = Math.max(res, set.size());
				end++;
			}
		}
		return res;
	}

}
