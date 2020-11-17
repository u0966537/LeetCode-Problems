package lc11162020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Map<String, Boolean> memory = new HashMap<>();
        return wordBreak(s, memory, dict);
    }
 
    private boolean wordBreak(String s, Map<String, Boolean> mem, Set<String> dict) {
        if(mem.containsKey(s)){
            return mem.get(s);
        }
        
        if(dict.contains(s)){
            mem.put(s, true);
            return true;
        }
        
        for(int i = 1; i < s.length(); i++){
            if(dict.contains(s.substring(i)) && wordBreak(s.substring(0, i), mem, dict)){
                return true;
            }
        }
        
        
        mem.put(s, false);
        return false;
        
    }
}
