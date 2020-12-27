package lc12272020;

public class SortColors {
  public void sortColors(int[] nums) {
    if (nums == null || nums.length == 0)
      return;

    int point0 = 0, point2 = nums.length - 1;
    int index = 0;

    while (index <= point2) {
      if (nums[index] == 0) {
        swap(nums, index, point0);
        index++;
        point0++;
      } else if (nums[index] == 1) {
        index++;
      } else {
        // dont increase index since we still need to check the swapped element value.
        swap(nums, index, point2);
        point2--;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
