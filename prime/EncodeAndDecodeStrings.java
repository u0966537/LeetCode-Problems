package prime;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
	public String encode(List<String> strs) {
		if(strs == null || strs.size() == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		for(String s : strs) {
			sb.append(s.length());
			sb.append("/");
			sb.append(s);
		}
		
		return sb.toString();
	}
	
	public List<String> decode(String s){
		List<String> res = new ArrayList<>();
		if(s == null || s.length() == 0)
			return res;
		
		int i = 0;
		while(i < s.length()) {
			int slashIndex = s.indexOf('/');
			int length = Integer.parseInt(s.substring(i, slashIndex));
			
			res.add(s.substring(slashIndex + 1, slashIndex + length + 1));
			i += slashIndex + length + 1;
		}
		
		return res;
	}

}
