package lc11092020;

public class PerfectNumber {

	/**
	 * Brute Force
	 * 
	 * @param num
	 * @return
	 */
	public boolean checkPerfectNumber(int num) {
		if (num <= 0) {
			return false;
		}

		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count += i;
			}

			if (count > num) {
				return false;
			}
		}

		return count == num;
	}

	public boolean checkPerfectNumber2(int num) {
		if (num <= 0) {
			return false;
		}
		
		int count = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				count += i;
				
				// num % i = 0, then we can take num / i to get another half. 
				// note: distinct, so i * i only be consider once. 
				if (i * i != num) {
					count = count + (num / i);
				}

			}
		}
		
		// subtract itself because of 1, 1 is every positive number's divisor. 
		return count - num == num;
	}

}
