package lc11082020;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // base case:
        if(nums == null || nums.length == 0){
            return false;
        }
        
        /**
         * when current index is bigger than k, then remove it from the set
         * since we're only looking for difference between i and j at most k.
         * 
         * set.add() returns false when it already exists inside of the set, then return true.
         */
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
