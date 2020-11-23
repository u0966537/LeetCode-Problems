package lc11222020;

public class ArragingCoins {
   
	public int arrangeCoins(int n) {
		if(n <= 0 ) {
			return 0;
		}
		
    	int i = 1;
    	for(;n >= i; i++) {
    		n -= i;
    	}
    	
    	return i - 1;
    }
}
