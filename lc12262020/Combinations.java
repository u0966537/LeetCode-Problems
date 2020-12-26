package lc12262020;

import java.util.List;
import java.util.ArrayList;

public class Combinations{
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		helper(res, n, new ArrayList<>(), 1, k);
		return res;
    }
    
    private void helper(List<List<Integer>> res, int n, List<Integer> comb, int index, int k){
    	if(k == 0){
    		res.add(new ArrayList<>(comb));
    	}
    	else{
    		for(int i = index; i <= n - k + 1; i++){
    			comb.add(i);
    			helper(res, n, comb, i + 1,k - 1);
    			comb.remove(comb.size() - 1);	
    		}
    	}
    }
}