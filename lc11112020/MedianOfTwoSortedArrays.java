package lc11112020;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int num1Index = 0;
		int num2Index = 0;
		int sum = (nums1.length + nums2.length);
		
		// stop after the middle index, so plus 1
		int medianIndex = sum / 2 + 1;
		
		// If the total length is even, then we need 2 values and get their average.
		// If the total length is odd, then we only need val.
		double preVal = 0;
		double val = 0;
		
		for (int i = 0; i < medianIndex; i++) {
			preVal = val;
			
			if (num1Index >= nums1.length) {
				val = nums2[num2Index++];
				
			} else if (num2Index >= nums2.length) {
				val = nums1[num1Index++];
				
			} else if (nums1[num1Index] < nums2[num2Index]) {
				val = nums1[num1Index++];
				
			} else {
				val = nums2[num2Index++];
			}
		}

		return sum % 2 == 0 ? (preVal + val) / 2 : val;
	}
}
