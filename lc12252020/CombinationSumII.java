package lc12252020

import java.util.List;
import java.util.ArrayList;

public class CombinationSumII{
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		if(candidates ==  null || candidates.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        int[] values = new int[target];
        helper(candidates, target, 0, 0, result, values);
        return result;
    }
    
    private void helper(int[] cand, int target, int start, int level, List<List<Integer>> result, int[]values){
    	if(target == 0){
    		List<Integer> count = new ArrayList<>();
    		for(int i = 0; i < level; i++){
    			count.add(values[i]);	
    		}	
    		result.add(count);
    	}
    	
    	else if(target > 0){
    		for(int i = start; i < cand.length; i++){
    			// check if the previous number is the same as current number, avoid duplicates
    			if(i > start && cand[i] == cand[i - 1]) continue;
    			values[level] = cand[i];
    			helper(cand, target - cand[i], i + 1, level + 1, result, values);
    		}	
    	}
    }
}