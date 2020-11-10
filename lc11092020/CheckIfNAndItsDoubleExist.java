package lc11092020;

import java.util.Set;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length <= 1) {
        	return false;
        }
        
        Set<Integer> nums = new HashSet<>(); 

        for (int i : arr) { 

          if (nums.contains(i << 1)) { 
            return true;
          }

          if (i % 2 == 0 && nums.contains(i >> 1)) { 
            return true;
          }

          nums.add(i);
        }

        return false; 
      }
}
