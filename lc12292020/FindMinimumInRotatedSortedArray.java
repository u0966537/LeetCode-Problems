package lc12292020;

public class FindMinimumInRotatedSortedArray {
  public int findMin(int[] nums) {
    if (nums == null || nums.length == 0)
      return -1;

    int left = 0, right = nums.length - 1;
    while (left + 1 < right) {
      int mid = (right + left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid;
      } else if (nums[mid] < nums[right]) {
        right = mid;
      }
    }

    return nums[left] < nums[right] ? nums[left] : nums[right];
  }
}
