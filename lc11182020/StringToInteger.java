package lc11182020;

public class StringToInteger {
	public int myAtoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		String[] w = str.trim().split("\\s+");
		if (w.length <= 0) {
			return 0;
		}

		String current = w[0];
		long result = 0;
		boolean negative = false;
		for (int i = 0; i < current.length(); i++) {
			if (i == 0) {
				if (current.charAt(0) == '-') {
					negative = true;
					continue;
				} else if (current.charAt(0) == '+') {
					continue;
				}
			}

			if (!Character.isDigit(current.charAt(i))) {
				return inRange(result, negative);
			} else {
				result = result * 10 + (current.charAt(i) - '0');
			}
		}

		return inRange(result, negative);
	}

	private int inRange(long result, boolean negative) {
		result = negative ? result * -1 : result;
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else {
			return (int) result;
		}
	}
	
	
	   public int myAtoi2(String str) {
	        int i = 0;
	        int sign = 1;
	        int result = 0;
	        if (str.length() == 0) return 0;

	        //Discard whitespaces in the beginning
	        while (i < str.length() && str.charAt(i) == ' ')
	            i++;

	        // Check if optional sign if it exists
	        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
	            sign = (str.charAt(i++) == '-') ? -1 : 1;

	        // Build the result and check for overflow/underflow condition
	        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
	            if (result > Integer.MAX_VALUE / 10 ||
	                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
	                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            result = result * 10 + (str.charAt(i++) - '0');
	        }
	        return result * sign;

	    }

}
