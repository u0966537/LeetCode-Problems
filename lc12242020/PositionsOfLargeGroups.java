package lc12242020;

import java.util.List;
import java.util.ArrayList;

public class PositionsOfLargeGroups{
	public List<List<Integer>> largeGroupPositions(String s) {
        if(s == null || s.length() == 0){
        	return  new ArrayList<>();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        // i used to point the starting interval index
        int i = 0, N = s.length(); 
        for (int j = 0; j < N; ++j) {
        	// if current index is at the end, or current index does not equal to the next index
            if (j == N-1 || s.charAt(j) != s.charAt(j+1)) {
                if (j - i + 1 >= 3) ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1; // update starting interval index
            }
        }
        return ans;
    }	
}