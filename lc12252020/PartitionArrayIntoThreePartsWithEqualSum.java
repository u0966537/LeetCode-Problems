package lc12252020;

public class PartitionArrayIntoThreePartsWithEqualSum{
	public boolean canThreePartsEqualSum(int[] arr) {
        if(arr == null || arr.length < 3) return false;
        
        int sum = 0;
        for(int i : arr) sum += i;
        
        // if the total sum does not divide into three, then return false.
        if(sum % 3 != 0) return false;
        
        int each = sum / 3, tempSum = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
        		tempSum += arr[i];
        		
        		if(tempSum== each){
        			tempSum = 0;
        			count++;	
        		}
        }
        return count >= 3;
    }
}