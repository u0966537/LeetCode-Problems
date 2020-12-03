package lc12022020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums == null || nums.length <= 2) {
			return new ArrayList<>();
		}

		/**
		 * Split problem into one number with two sum problem.
		 */
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < nums.length - 2; i++) {
			
			// if current index is at positive number, then stop since all the number after it is positive.
			if(nums[i] > 0) {
				break;
			}
			
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			int left = i + 1, right = nums.length - 1;
			while(left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				if(sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					
					// hop over the duplicate element (left)
					while(left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					
					// hop over the duplicate element (right)
					while(left < right && nums[right] == nums[right - 1]) {
						right--;
					}
					
					left++;
					right--;
				}
				
				else if(sum < 0) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		
		return result;
	}
}
