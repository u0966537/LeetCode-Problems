package lc11132020;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		if (candies == null || candies.length == 0) {
			return new ArrayList<Boolean>();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < candies.length; i++) {
			max = Math.max(candies[i], max);
		}
	
		List<Boolean> result = new ArrayList<>();
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] + extraCandies >= max) {
				result.add(true);
			}
			else {
				result.add(false);
			}
		}
		
		return result;
	}
}
