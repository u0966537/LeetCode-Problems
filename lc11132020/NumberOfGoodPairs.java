package lc11132020;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        if(nums == null || nums.length == 0){
        	return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		result += map.get(nums[i]);
        	}
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        return result;
    }
}
