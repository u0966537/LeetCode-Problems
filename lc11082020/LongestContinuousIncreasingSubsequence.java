package lc11082020;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return 0;
    	}
    	
    	int max = 0, count = 1, prev = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		if(nums[i] > prev) {
    			count++;
    		}
    		else {
    			max = Math.max(max, count);
    			count = 1;
    		}
			prev = nums[i];
    	}
    	
    	return max < count ? count : max;
    }

}
