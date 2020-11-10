package lc11092020;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
    	if(nums == null || nums.length <= 2) {
    		return true;
    	}
    	
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                
                
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i]; // modify nums[i-1] of a priority
                }
                else {
                    nums[i] = nums[i - 1]; // have to modify nums[i]
                }
            }
        }
        return count <= 1;
    }
    
}
