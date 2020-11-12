package lc11112020;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArr = new int[nums.length];   
        
        for(int i = 0 , j = 0; i < nums.length ; i+=2){
            shuffledArr[i]=nums[j];
            j++;
            
            shuffledArr[i+1]=nums[n + (i >> 1)];
        }
        return shuffledArr;
    }
}
