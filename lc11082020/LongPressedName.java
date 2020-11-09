package lc11082020;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if(typed == null || typed.length() == 0 || name == null) {
        	return false;
        }
        
        if(name.length() > typed.length()) {
        	return false;
        }
        	
        int nIndex = 0, tIndex = 0;
        while(tIndex < typed.length()) {
        	if(nIndex < name.length() && name.charAt(nIndex) == typed.charAt(tIndex)) {
        		nIndex++;
        		tIndex++;
        	}
        	else if(nIndex > 0 && name.charAt(nIndex - 1) ==  typed.charAt(tIndex)){ 
        		tIndex++;
        	}
        	else {
        		return false;
        	}
        }
        
        return nIndex == name.length();
    }
}
