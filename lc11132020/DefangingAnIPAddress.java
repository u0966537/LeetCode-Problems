package lc11132020;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
    	if(address == null || address.length() == 0) {
    		return "";
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < address.length(); i++) {
    		if(address.charAt(i) == '.') {
    			sb.append("[.]");
    		}
    		else {
    			sb.append(address.charAt(i));
    		}
    		
    	}
        
    	return sb.toString();
    }
}
