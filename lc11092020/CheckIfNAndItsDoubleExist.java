package lc11092020;

import java.util.Set;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
	public static void main(String[]args) {
		
		checkIfExist(new int[] {
				-2,0,10,-19,4,6,-8});
	}
    public static boolean checkIfExist(int[] arr) {
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

          nums.add(i); // if no matches to doubles or halves, just add to the set and continue for loop

        }

        return false; // if we weren't able to return true from the for loop, return false
      }
    

}
