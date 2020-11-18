package lc11112020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;

		Set<Character> set = new HashSet<Character>();
		int res = 0, start = 0, end = 0;

		while (end < s.length()) {
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
	
	public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); 
        
        for (int j = 0, i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
            	// s.charAt(i) + 1 means after the duplicated character
            	// j means the previous longest substring's starting point
                j = Math.max(map.get(s.charAt(i)) + 1, j);
            }
            // put its current index
            map.put(s.charAt(i), i);
            
            // calculate the new substring's distance.
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
	}

}
