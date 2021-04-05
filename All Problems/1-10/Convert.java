class Solution {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || s.length() < numRows || numRows <= 1)
            return s;
        
        StringBuilder sb = new StringBuilder();
        int formula = numRows + numRows - 2;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; i + j < s.length(); j += formula){
                sb.append(s.charAt( i + j));
                
                if(i > 0 && i < numRows - 1 && j + formula - i < s.length()){
                    sb.append(s.charAt(j + formula -i));
                }
            }
        }
        
        return sb.toString();
    }
}
