package lc11222020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersecgtionOfTwoArraysll {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
        	return new int[] {};
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums1) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i : nums2) {
        	if(map.containsKey(i) && map.get(i) >= 1) {
        		map.put(i, map.get(i) - 1);
        		list.add(i);
        	}
        }
        
        int[] res=new int[list.size()]; 
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        
        return res;
    	
    }
    

}
