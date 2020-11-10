package lc11092020;

public class NumberOfSegmentsInAString {
	
    public int countSegments(String s) {
        if(s == null || s.trim().length() == 0) {
        	return 0;
        }
        
        return s.trim().split("\\s++").length;
    }
    
    public int countSegments2(String s) {
    	if(s == null || s.length() == 0) {
    		return 0;
    	}
    	
    	int count = 0;
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) != ' ') {
    			sb.append(s.charAt(i));
    		}
    		else {
    			if(sb.length() != 0) {
    				count++;
    				sb.setLength(0);
    			}
    		}
    		
    	}
    	
    	return sb.length() == 0 ? count : count + 1;
    }
}
