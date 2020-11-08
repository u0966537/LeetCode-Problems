package lc11082020;

public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		// start at 1 since duplicates can exist most twice/
		int res = 1;
		for (int i = 1; i < nums.length; i++) {
			// always compare the current pointer's previous 2 index element.
			if (res < 2 || nums[i] > nums[res - 2]) {
				nums[res++] = nums[i];
			}
		}
		return res;

	}
}
