package lc12232020;

public class SetMismatch {
	public static void main(String[]args){
		int[] test = new int[] {1, 2, 5, 4, 2};
		findErrorNums(test);
		
	}
    public static int[] findErrorNums(int[] nums) {
    	if(nums == null || nums.length == 0) {
    		return new int[] {};
    	}
    	
    	// use index (num - 1) as hash, mark every existing index (num - 1) negative.
        int dup = -1, missing = 1;
        for (int n: nums) {
        	
        	// if the hash is already negative, then we found duplicate num.
            if (nums[Math.abs(n) - 1] < 0) {
                dup = Math.abs(n);
            }
            else
                nums[Math.abs(n) - 1] *= -1;
        }
        
        // if number is positive, then index + 1 is the missing number
        // since we never find it before.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                missing = i + 1;
        }
        return new int[]{dup, missing};
    }
}
