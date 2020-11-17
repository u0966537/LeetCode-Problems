package lc11162020;

public class ClimbingStairs {
	public int climbStairs(int n) {
		
        /*
		 * We do not need an array to track all the points.
		 * However, we can use two integers to track the two values.
		 */
		if( n <= 1){
            return 1;
        }
        
		int prevTwo = 1;
		int prevOne = 2;
		
		for(int i = 2; i < n; i++) {
			// (i - 1) + (i - 2) will become i - 1 in the next iteration.
			prevOne += prevTwo;
			
			// (i - 1) will become i - 2 in the next iteration.
			// However prevOne value has been covered, but we can 
			// use the future prevOne - prevTwo to get it.
			prevTwo = prevOne - prevTwo; 
		}
		return prevOne;
	}
}
