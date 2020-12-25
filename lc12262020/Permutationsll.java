package lc12262020;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Permutationsll{
	public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums == null || nums.length ==0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    
    private void helper(List<List<Integer>> res, int[] nums, List<Integer> comb, boolean[] visted){
    	if(comb.size() == nums.length) res.add(new ArrayList(comb));
    	else{
    		for(int i = 0; i < nums.length; i++){
    			if(visted[i] || (i > 0 && nums[i] == nums[i - 1] && ! visted[i - 1])) continue;
    			visted[i] = true;
    			comb.add(nums[i]);
    			helper(res, nums, comb, visted);
    			comb.remove(comb.size() - 1);
    			visted[i] = false;
    		}
    	}
    }
}