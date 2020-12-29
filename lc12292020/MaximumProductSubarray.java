package lc12292020;

public class MaximumProductSubarray {
  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;

    int max = nums[0], min = nums[0], res = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int temp = max;
      // max * nums[i], positive number * positive number = positive number
      // min * nums[i], negative number * negative number = positive number
      // current number is the biggest number
      max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);

      min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
      res = Math.max(max, res);
    }
    return res;
  }
}
