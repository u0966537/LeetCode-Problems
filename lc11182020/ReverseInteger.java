package lc11182020;

public class ReverseInteger {
	public int reverse(int x) {
		boolean negative = false;
		if (x < 0) {
			negative = true;
			x *= -1;
		}

		long result = 0;
		while (x != 0) {
			
			// get the lowest position digit.
			result = (result * 10) + (x % 10); 
			// check over flow when reversing.
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				return 0;
			}
			
			// cut off the lowest position digit.
			x = x / 10;
		}

		return negative ? (int) result * -1 : (int) result;
	}

}
