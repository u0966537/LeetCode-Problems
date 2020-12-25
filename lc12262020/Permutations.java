package lc12262020;

import java.util.List;
import java.util.ArrayList;

public class Permutations{
	
	public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length < 1) return new ArrayList<>();
        
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    
    private void helper(List<List<Integer>> res, int[] nums, List<Integer> comb, boolean[] visited){
    	if(comb.size() == nums.length){
        	res.add(new ArrayList(comb));
    	}
    	else{
    		for(int i = 0; i < nums.length; i++){
    			if(visited[i]) continue;
    			visited[i] = true;
    			comb.add(nums[i]);
    			helper(res, nums, comb, visited);
    			comb.remove(comb.size() - 1);
    			visited[i] = false;
    		}
    	}
    }
}