package lc11082020;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");

		if (pattern.length() != words.length) {
			return false;
		}

		Map<Object, Integer> map = new HashMap<>();

		for (Integer i = 0; i < words.length; i++) {
			if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
				return false;
			}
		}

		return true;
	}

}
