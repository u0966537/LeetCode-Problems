package lc11092020;

import java.util.Stack;
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        
        int length = S.length() > T.length() ? S.length() : T.length();
        
        for(int i = 0; i < length; i++) {
        	if(i < S.length()) {
        		if(S.charAt(i) != '#') {
        			s.push(S.charAt(i));
        		}
        		else {
        			if(!s.isEmpty()) {
        				s.pop();
        			}
        		}
        	}
        	
        	if(i < T.length()) {
        		if(T.charAt(i) != '#') {
        			t.push(T.charAt(i));
        		}
        		else {
        			if(!t.isEmpty()) {
        				t.pop();
        			}
        		}
        	}
        }
        
        return s.toString().equals(t.toString());
    }
    
    
    public boolean backspaceCompare2(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { 
        	
            while (i >= 0) { 
                if (S.charAt(i) == '#') {
                	skipS++; 
                	i--;
                	}
                else if (skipS > 0) {
                	skipS--; 
                	i--;
                }
                else {
                	break;
                }
            }
            
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                	skipT++; 
                	j--;
                }
                else if (skipT > 0) {
                	skipT--; 
                	j--;
                }
                else {
                	break;
                }
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)) {
                return false;
            }
            // If one index is positive, and another index is negative
            if ((i >= 0) != (j >= 0)) {
                return false;
            }
            
            i--; 
            j--;
        }
        return true;
    }
}
