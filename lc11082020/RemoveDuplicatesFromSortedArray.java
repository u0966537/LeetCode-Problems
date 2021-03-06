package lc11082020;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        
		for(int i = 1; i < nums.length; i++) {
			if (nums[res] != nums[i]) {
				nums[++res] = nums[i];
			}
		}
		
		return res + 1;
    }
}
