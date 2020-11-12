package lc11112020;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return new int[0];
    	}
    	
    	
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	sum[i] = sum[i - 1] + nums[i]; 
        }
        
        return sum;
        
    }
}
