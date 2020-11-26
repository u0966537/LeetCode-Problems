package lc11252020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
	   public String[] findRestaurant(String[] list1, String[] list2) {
	        // 将较少的list放入到hashmap中节省时间（put操作消耗较大）
	        if(list1.length > list2.length) {
	            return findRestaurant(list2, list1);
	        }
	        
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        // put each restaurant's name as key and index as value into hash map.
	        int i = 0;
	        for (String restaurant : list1) {
	        	map.put(restaurant, i++);
	        }
	        
	        int tIndex = Integer.MAX_VALUE;
	        List<String> res = new ArrayList<>();
	        
	        // j <= tIndex, because we're looking for least list index sum
	        // so if j is bigger than current least index, then we stop.
	        for (int j = 0; j < list2.length && j <= tIndex; j++) {
	            String restaurant = list2[j];
	            if (map.containsKey(restaurant)) {
	                int index = j + map.get(restaurant);
	                
	                if (index == tIndex) {
	                    res.add(restaurant);
	                } else if (index < tIndex) {
	                	// found new smaller index.
	                    res.clear();
	                    res.add(restaurant);
	                    tIndex = index;
	                }
	            }
	        }
	        return res.toArray(new String[res.size()]);
	    }
}
