package lc11222020;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ls = new ArrayList<>();
		
		/*
		 * get current the abs value of current item,
		 * treat the value as index (value - 1) and lookup the value,
		 * if position, then mark negative.
		 * if negative, then it's already marked.
		 */
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0)
				nums[index] = -nums[index];
		}
		
		/*
		 * since we already visited all the numbers (indices), 
		 * then we look up the position values (i + 1).
		 */
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				ls.add(i + 1);
		}
		return ls;

	}
}
