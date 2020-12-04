package lc12032020;

public class FindFirstAndLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};

        int left = findLeft(nums, target);
        int right =  findRight(nums,target);

        return new int[]{left, right};
    }


    // left range is first.
    private int findLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        
        // minimum 3 elements to perform
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            
            // if mid is bigger, shift to left range.
            if(nums[mid] >= target){
                right = mid;
            } else {
                left = mid;
            }
        }
        
        if(nums[left] == target){
            return left;
        } else if(nums[right] == target){
            return right;
        } else {
            return -1;
        }
    }


    // right range is first.
    private int findRight(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        // minimum 3 elements to perform
        while(left + 1 < right){
            int mid = left + (right - left) / 2;

            // if mid is smaller, shift to right range.
            if(nums[mid] <= target){
                left = mid;
            } else {
                right = mid;
            }
        }

        if(nums[right] == target){
            return right;
        } else if(nums[left] == target){
            return left;
        } else {
            return -1;
        }
    }
}
