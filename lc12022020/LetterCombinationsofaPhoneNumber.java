package lc12022020;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
		if(digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}
		
		List<String> result = new ArrayList<>();
		result.add("");
		
		String[] keys = new String[] {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		/*
		 * loop through every digit 
		 */
		for(int i = 0; i < digits.length(); i++) {
			List<String> newResult = new ArrayList<>();
			
			// loop up the keys
			String chars = keys[digits.charAt(i) - '0' - 1];
			
			/*
			 * loop through every key's character
			 */
			for(int j = 0; j < chars.length(); j++) {
				
				// use the previous result and append one character to make up new results.
				for(String s : result) {
					newResult.add(s + chars.charAt(j));
				}
			}
			
			// set the new results into result.
			result = newResult;
		}
		return result;
	}	
}