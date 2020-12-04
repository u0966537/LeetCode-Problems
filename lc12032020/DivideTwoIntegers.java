package lc12032020;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == 0 ) {
        	return 0;
        }
        
        // if both of them are negative, then position
        // if one of them is negative, then negative.
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        long ldd = Math.abs((long) dividend);
        long lds = Math.abs((long) divisor);
        
        long res = 0;
        while(ldd >= lds) {
        	long temp = lds;
        	long mul = 1;
        
        	while(ldd >= (temp << 1)) {
        		temp <<= 1;
        		mul <<= 1;
        	}
        	
        	res += mul;
        	ldd -= temp;
        }
        
        res *= sign;
        return res >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)res;
    }
}
