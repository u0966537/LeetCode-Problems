package lc11092020;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}

		int[] arr = new int[26];
		for (char c : magazine.toCharArray()) {
			arr[c - 'a'] += 1;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			arr[ransomNote.charAt(i) - 'a'] -= 1;
			if (arr[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
