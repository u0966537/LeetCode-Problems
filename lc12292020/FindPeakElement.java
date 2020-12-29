package lc12292020;

public class FindPeakElement {
  public int findPeakElement(int[] nums) {
    if (nums == null || nums.length <= 1)
      return 0;

    // nums[0] is greater than its left neighbor since it does not have
    // left neighbor, so we only need to check right.
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1])
        return i;
    }

    return nums.length - 1;
  }
}
