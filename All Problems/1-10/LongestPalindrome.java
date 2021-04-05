class Solution {
    String res = "";
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return res;
        
        for(int i = 0; i < s.length(); i++){
            helper(i, i, s);  //odd
            helper(i, i + 1, s); //even
        }
        
        return res;
    }
    
    private void helper(int left, int right, String s){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String temp = s.substring(left + 1, right);
        if(temp.length() > res.length()){
            res = temp;
        }
    }
}
