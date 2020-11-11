package lc11102020;

public class FirstUniqueCharacterInAString {
	public  int firstUniqChar(String s) {
		int[] arr = new int[26];
		
		for(char c :  s.toCharArray()) {
			arr[c - 'a']+=1;
		}
		
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(arr[a-'a'] == 1){return i;}
        }
        return -1;
	}
}
