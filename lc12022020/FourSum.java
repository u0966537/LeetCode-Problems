package lc12022020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public  List<List<Integer>> fourSum(int[] nums, int target) {
		if(nums == null || nums.length < 4) {
			return new ArrayList<>();
		}
		
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < nums.length - 3; i++) {
			
			// if current number * 4 is bigger than target, then stop
			// since any number after current number is going to be bigger than current number.
			if(nums[i] >= 0 && nums[i] << 2 > target) {
				break;
			}
			
			// avoid duplicates
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			
			for(int j = i + 1; j < nums.length - 2; j++) {
				// not the number next to i, 
				// but the number after that, and avoid duplicates
				if(j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
			
				int left = j + 1, right = nums.length - 1;
				while(left < right) {
					int sum =  nums[i] + nums[j] + nums[left] + nums[right];
					
					if(sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						
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
					else if(sum < target) {
						left++;
					}
					else {
						right--;
					}
				}
			}
		}
		
		return result;
	}
}
