package lc11112020;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		int left = (m + n + 1) / 2, right = (m + n + 2) / 2;

		return (findKth(nums1, nums2, left) + findKth(nums1, nums2, right)) / 2.0;
	}

	public int findKth(int[] nums1, int[] nums2, int k) {
		int m = nums1.length, n = nums2.length;

		if (m == 0) {
			return nums2[k - 1];
		}

		if (n == 0) {
			return nums1[k - 1];
		}

		if (k == 1) {
			return Math.min(nums1[0], nums2[0]);
		}

		int i = Math.min(m, k / 2), j = Math.min(n, k / 2);
		if (nums1[i - 1] > nums2[j - 1]) {
			return findKth(nums1, Arrays.copyOfRange(nums2, j, n), k - j);
		} else {
			return findKth(Arrays.copyOfRange(nums1, i, m), nums2, k - i);
		}
	}

	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int num1Index = 0;
		int num2Index = 0;
		int sum = (nums1.length + nums2.length);
		int medianIndex = sum / 2 + 1;
		double preVal = 0;
		double val = 0;
		
		for (int i = 0; i < medianIndex; i++) {
			preVal = val;
			if (num1Index >= nums1.length) {
				val = nums2[num2Index];
				num2Index++;
			} else if (num2Index >= nums2.length) {
				val = nums1[num1Index];
				num1Index++;
			} else if (nums1[num1Index] < nums2[num2Index]) {
				val = nums1[num1Index];
				num1Index++;
			} else {
				val = nums2[num2Index];
				num2Index++;
			}
		}
		if (sum % 2 == 0) {
			val = (preVal + val) / 2;
		}
		return val;
	}
}
