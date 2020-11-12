package lc11112020;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			throw new NullPointerException("array is empty");
		} else {
			Map<Integer, Integer> numbers = new HashMap<>();

			for (int i = 0; i < nums.length; i++) {
				int diff = target - nums[i];
				if (numbers.containsKey(diff)) {
					return new int[] { numbers.get(diff), i };
				} else {
					numbers.put(nums[i], i);
				}
			}
		}

		return null;
	}
}
