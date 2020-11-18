package lc11172020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null || nums1.length == 0 || nums1.length == 0) {
			return new int[0];
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i : nums1) {
			set.add(i);
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums2.length; i++) {
			if(set.contains(nums2[i])) {
				set.remove(nums2[i]);
				list.add(nums2[i]);
			}
		}
		
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
}
