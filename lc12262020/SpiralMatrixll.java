package lc12262020;

public class SpiralMatrixll{
    public int[][] generateMatrix(int n) {
        if(n <= 0) return new int[0][0];
        
        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;
 		sint[][] res = new int[n][n];
        
        int count = 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
        	for(int i = colBegin; i <= colEnd; i++) res[colBegin][i] = count++;
        	rowBegin++;
        	
        	for(int i = rowBegin; i <= rowEnd; i++) res[i][colEnd] = count++;
        	colEnd--;
        	
        	if(rowBegin <= rowEnd)
        		for(int i = colEnd; i >= colBegin; i--)	res[rowEnd][i] = count++;
        		rowEnd--;
        	
        	if(colBegin <= colEnd)
        		for(int i = rowEnd; i >= rowBegin; i--)	 res[i][colBegin] = count++;
        		colBegin++;
        } 
        return res;
    }
}