package lc12262020;

import java.util.List;
import java.util.ArrayList;

public class Subsets{
	public List<List<Integer>> subsets(int[] nums) {
		if(nums == null || nums.length == 0) return new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		helper(res, nums, 0, new ArrayList<>());
		return res;
    }
    
    private void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> comb){
    	res.add(new ArrayList<>(comb));
    	
    	for(int i = index; i < nums.length; i++){
    		comb.add(nums[i]);
    		helper(res, nums, i + 1, comb);
    		comb.remove(comb.size() - 1);
    	}
    }
}