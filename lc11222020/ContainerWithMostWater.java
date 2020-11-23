package lc11222020;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	if(height == null || height.length <= 1) {
    		return 0;
    	}
        // height * distance.
    	int max = 0;
        for(int i = 0; i < height.length; i++) {
        	for(int j = i + 1; j <height.length; j++) {
        		// get the intersection of two heights (the value of the smaller height), 
        		// and multiply by their distance.
        		max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
        	}
        }
        
        return max;
    }
    
    public int maxArea2(int[] height) {
    	if(height == null || height.length <= 1) {
    		return 0;
    	}
        // height * distance.
    	
    	int left = 0, right = height.length - 1, max = 0;
    	
    	while(left < right) {
    		
    		max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
    		
    		if(height[left] < height[right]) {
    			left++;
    		}
    		else {
    			right--;
    		}
    	}
    	
    	return max;
    }
}
