package lc11252020;

import java.util.Arrays;

public class ArrayPartitionI {

	public int arrayPairSum(int[] nums) {
		// find the smallest, and find the second biggest
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int[] count = new int[20001];
		for(int num : nums) {
			if(num == 0) {
				count[10000]++;
			}
			else if(num > 0) {
				count[num +10000]++;
			}
			else {
				count[num + 10000]++;
			}
		}
		
		int[] newNums = new int[nums.length ];
		int index = 0;
		for(int i = 0; i < count.length; i++) {
			for(int j = 0; j < count[i]; j++) {
					newNums[index++] = i -10000;
			} 
		}
		
        int sum = 0;
        for (int i = 0; i < newNums.length; i += 2) {
            sum += newNums[i];
        }
        return sum;
	}
	
	public int arrayPairSum2(int[] nums) {
		// find the smallest, and find the second biggest
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		Arrays.sort(nums);
		int sum = 0;
		for(int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
		}
		
		return sum;
	}
}
