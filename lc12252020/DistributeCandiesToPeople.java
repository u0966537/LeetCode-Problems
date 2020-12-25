package lc12252020;

public class DistributeCandiesToPeople{
	public int[] distributeCandies(int candies, int num_people) {
        if(candies <= 1 || num_people <= 0) return new int[]{};
        
        int nextCount = 1, index = 0;
        int [] result = new int[num_people];
        while(nextCount < candies){
        	result[index] = result[index] + nextCount;
        	candies -= nextCount;
        	index++;
        	nextCount++;
        	if(index >= num_people) index = 0;
        }
        
        if(candies != 0){
        	result[index] = result[index] + candies;
        }
        
        return result;
    }
}