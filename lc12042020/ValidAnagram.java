package lc12042020;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s == null && t == null) {
        	return true;
        }
        
        if(s == null || t == null){
        	return false;
        }
        
        if(s.length() != t.length()) {
        	return false;
        }
        
        char[] sArr = new char[26];
        for(int i = 0; i < s.length(); i++) {
        	sArr[s.charAt(i) - 'a']++;
        	sArr[t.charAt(i) - 'a']--;
        	
        }
        
        for(int i = 0; i < sArr.length; i++) {
        	if(sArr[i] !=0) {
        		return false;
        	}
        }
        
        return true;
        
        
        
    }
}
