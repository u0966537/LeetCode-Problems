package lc11132020;

public class ToLowerCase {
    public String toLowerCase(String str) {
        if(str == null || str.length() == 0) {
        	return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
        	char current = str.charAt(i);
        	if(current >= 65 && current <= 90) {
        		sb.append((current + 32));
        	}
        	else {
        		sb.append(current);
        	}
    
        }
        
        return sb.toString();
    }
}
