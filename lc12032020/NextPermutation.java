package lc12032020;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return;
        }
        
        
        // from right to left, find the first decreasing number
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i] ) {
        	i--;
        }
        
        // if index = -1, then array is sorted descending.
        if(i == -1) {
        	reverseArray(nums, 0);
        	return;
        }
        
        // from right to left, find the first number that is greater than the number we found above.
        int j = nums.length - 1;
        while(j >= 0 && nums[j] <= nums[i] ) {
        	j--;
        }
        
        // swap them.
        swap(nums, i, j);
        
        // sort the array after the number we first found.
        // number behind the first number we found is decreasing order.
        reverseArray(nums, i + 1);
    }
    
    private void reverseArray(int[] nums, int i) {
    	int left = i, right = nums.length - 1;
    	while(left < right) {
    		swap(nums, left, right);
    		left++;
    		right--;
    	}
    }
    
    private void swap(int[] nums, int left, int right) {
    	int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
