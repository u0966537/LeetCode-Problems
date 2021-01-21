package prime;

public class OneEditDistance {
	public static void main(String[]args) {
		System.out.println(isOneEditDistance("ab", "acb"));
		System.out.println(isOneEditDistance("cab", "ad"));
		System.out.println(isOneEditDistance("1203", "1213"));
	}
	 public static boolean isOneEditDistance(String s, String t) {
		 // check every character is the same
		 for(int i = 0; i < Math.min(s.length(), t.length()); i++) {
			 if(s.charAt(i) != t.charAt(i)) {
				 // they have the same length, then compare rest characters.
				 // s has less character, then delete one character from t.
				 // s has greater character, then delete one character from s.
				 if(s.length() == t.length()) 
					 return s.substring(i + 1).equals(t.substring(i + 1));
				 else if(s.length() < t.length())
					 return s.substring(i).equals(t.substring(i + 1));
				 else 
					 return s.substring(i + 1).equals(t.substring(i));
			 }
		 }
		 
		 return Math.abs(s.length() - t.length()) == 1;
	 }
}
