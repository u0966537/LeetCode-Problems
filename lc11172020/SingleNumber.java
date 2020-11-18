package lc11172020;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
        	return nums[0];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.keySet()) {
        	if(map.get(i) == 1) {
        		return i;
        	}
        }
        
        return -1;
    }
    
    public int singleNumber2(int[] nums) {
        if(nums.length == 1) {
        	return nums[0];
        }
        
        int resultInSet = 0, resultAll = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
        	if(!set.contains(i)) {
        		set.add(i);
        		resultInSet += i;
        	}
        	resultAll += i;
        }
        
        return (resultInSet << 1) - resultAll;
    }
}
