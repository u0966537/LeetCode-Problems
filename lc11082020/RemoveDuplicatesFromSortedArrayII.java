package lc11082020;

public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		int i = 1;
		for (int j = 1; j < nums.length; j++) {
			if (i < 2 || nums[j] > nums[i - 2]) {
				nums[i++] = nums[j];
			}
		}
		return i;

	}
}
