package lc11252020;

public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
    	if(ops == null || ops.length == 0) {
    		return m * n;
    	}
    	
    	// find the smallest x and y value.
    	int minX = Integer.MAX_VALUE;
    	int minY = Integer.MAX_VALUE;
    	for(int i = 0; i < ops.length; i++) {
    		minX = Math.min(minX, ops[i][0]);
    		minY = Math.min(minY, ops[i][1]);
    	}
    	
    	return minX * minY ;
    }
   
}
