package lc12232020;

public class MaximumProductofThreeNumbers {
	public int maximumProduct(int[] nums) {
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
		
		for (int n : nums) {
			
			// move current value to min1
			// and move min1 to min2
			if (n <= min1) {
				min2 = min1;
				min1 = n;
				
			// move current value to min2
			} else if (n <= min2) { 
				min2 = n;
			}
			
			
			if (n >= max1) { // n is greater than max1, max2 and max3
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (n >= max2) { // n lies betweeen max1 and max2
				max3 = max2;
				max2 = n;
			} else if (n >= max3) { // n lies betwen max2 and max3
				max3 = n;
			}
		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
	}
}