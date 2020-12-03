package lc12022020;

import java.util.Arrays;

public class ThreeSumClosest {
	
	  public int threeSumClosest(int[] nums, int target) {
	       
		if(nums == null || nums.length <= 2) {
			return -1;
		}
		
		/**
		 * Split problem into one number with two sum problem.
		 */
		Arrays.sort(nums);
		
		// default result
		int closest = nums[0] + nums[1] + nums[2];
		int diff = Math.abs(closest - target);
		
		for(int i = 0; i < nums.length - 2; i++) {
			
			// since the array is sorted, so the number after current number is going to be bigger.
			// so if current number 3 times i bigger than target, then we just compare it with our default result.
			if(nums[i] * 3 > target ) {
				return Math.min(closest, nums[i] + nums[i + 1] + nums[i + 2]);
			}
			
			// hop over duplicate
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			
			int left = i + 1, right = nums.length - 1;
			while(left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				int newDiff = Math.abs(sum - target);
				
				if(newDiff < diff) {
					diff = newDiff;
					closest = sum;
				}
				
				if(sum < target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		return closest;
	}
}
