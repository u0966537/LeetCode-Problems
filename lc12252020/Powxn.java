package lc12252020

public class Powxn{
	public double myPow(double x, int n) {
        if(n > 0) return pow(x, n);
        return 1.0 / pow(x, n);
    }
    
    private double pow(double x, int n){
    	// n = 0 return 1
    	// n = 1 return 1 * x
    	// n = 2 return 1 * x * 1 * x
    	// n = 3 return 1 * x * 1 * x * x
    	if(n == 0) return 1;
		double y = pow(x, n / 2);
		// even
    	if((n & 1) == 0) return y * y;
    	return y * y * x;
    }
}