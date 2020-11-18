package lc11182020;

import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char current = s.charAt(i);
			char next = s.charAt(i + 1);
			if (current == 'I') {
				if (next == 'V' || next == 'X') {
					result -= 2;
				}
			}

			else if (current == 'X') {
				if (next == 'L' || next == 'C') {
					result -= 20;
				}
			} else if (current == 'C') {
				if (next == 'D' || next == 'M') {
					result -= 200;
				}
			}

			result += map.get(current);
		}

		return result + map.get(s.charAt(s.length() - 1));
	}

}
