package lc12272020;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsetsll {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    if (nums == null || nums.length == 0)
      return res;

    helper(res, nums, 0, new ArrayList<>());
    return res;
  }

  private void helper(List<List<Integer>> res, int[] nums, int start, List<Integer> comb) {
    res.add(new ArrayList<>(comb));

    for (int i = start; i < nums.length; i++) {

      // remove duplicate subsets.
      if (i > start && nums[i] == nums[i - 1])
        continue;
      comb.add(nums[i]);
      helper(res, nums, i + 1, comb);
      comb.remove(comb.size() - 1);

    }
  }
}
