package lc12242020;

public class BinarySearch{
	
    public int search(int[] nums, int target) {
    	if(nums == null || nums.length == 0) return -1;
    	
    	int left = 0, right = nums.length;
		while(left < right){
			int mid = left + (right - left) / 2;
			if(nums[mid] < target) left = mid + 1;
			else if(nums[mid] > target) right = mid;
			else return mid;
		}
		
		return -1;
    }
}