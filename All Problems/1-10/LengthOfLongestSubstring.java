class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        if(s == null || s.length() == 0)
            return res;
            
        Set<Character> set = new HashSet<>();
        int first = 0, second = 0;
        while(second < s.length()){
            if(set.contains(s.charAt(second))){
                set.remove(s.charAt(first));
                first++;
                
            }
            else{
                set.add(s.charAt(second));
                second++;
                res = Math.max(res, set.size());
            }
        }
        
        return res;
    
    }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        if(s == null || s.length() == 0)
            return res;
        
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }
                else{
                    break;
                }
            }
            res = Math.max(res, set.size());
        }
        return res;
    }
}

