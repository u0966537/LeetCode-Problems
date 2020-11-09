package lc11092020;

public class FactorialTrailingZeroes {

	   public int trailingZeroes(int n) {
		   if(n == 0) {
			   return 0;
		   }
		   
		   int result = n / 5;
		   return result + trailingZeroes( result);
		   
	   }
	   
}
