package lc11102020;

import java.util.HashSet;

public class ContainsDuplicate {
	   public boolean containsDuplicate(int[] nums) {
			// 2 ways.
			// Put them into hashset.
			// Sort the array, and compare current index with the previous index.
		
			
			HashSet<Integer> set = new HashSet<>();
			for(int i = 0; i < nums.length; i++) {
				if(set.contains(nums[i])) {
					return true;
				}
				else {
					set.add(nums[i]);
				}
			}
			
			return false;
	    }
}
