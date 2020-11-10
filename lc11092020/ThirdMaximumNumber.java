package lc11092020;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {

		Integer first = null, second = null, third = null;
		for (Integer n : nums) {
			if (n.equals(first) || n.equals(second) || n.equals(third)) {
				continue;
				
			}
			if (first == null || n > first) {
				third = second;
				second = first;
				first = n;
				
			} else if (second == null || n > second) {
				third = second;
				second = n;
				
			} else if (third == null || n > third) {
				third = n;
			}
		}
		
		// if third max value does not exist, then return first. 
		return third == null ? first : third;

	}
}
