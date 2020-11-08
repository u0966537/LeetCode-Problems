package lc11082020;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // base case:
        if(nums == null || nums.length == 0){
            return false;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k){
                set.remove(nums[i - k - 1]);
            }
            
            if (!set.add(nums[i])){
                return true;       
            }
        }
        return false;
    }
}
