package lc11252020;

import java.util.Stack;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
    	if(s == null || s.length() == 0) {
    		return "";
    	}
    	
    	Stack<Character> stack = new Stack<>();
    	StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
        	char current = s.charAt(i);
        	if(current == ' ') {
        		while(!stack.isEmpty()) {
        			sb.append(stack.pop());
        		}
        		sb.append(' ');
        	}
        	else {
        		stack.push(current);
        	}
        	
        }
        
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
        return sb.toString();
    }
    
    
    public String reverseWords2(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words) {
        	res.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
}
