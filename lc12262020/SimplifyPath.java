package lc12262020;

import java.util.Stack;

public class SimplifyPath{
	public String simplifyPath(String path) {
        if(path == null || path.length() == 0) return "";
        
        Stack<String> stack = new Stack<>();
        String[] chars = path.split("/");
        
        for(int i = 0; i < chars.length; i++){
        	String current = chars[i].trim();
        	
        	if(current == null || current.length() == 0 || current.equals(".")) continue;
        	
        	if(current.equals("..")){
        		if(!stack.isEmpty()){
        			stack.pop();
        		}
        	}
        	else{
        		stack.push(current);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        	sb.insert(0, "/" + stack.pop());
        	
        return sb.length() == 0 ? "/" : sb.toString();
    }
}