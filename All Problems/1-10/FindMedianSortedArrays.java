class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int medianIndex = (nums1.length + nums2.length) / 2;
        
        // odd even
        int nums1Index = 0, nums2Index = 0;
        double val = 0, preVal = 0;
        for(int i = 0; i <= medianIndex; i++){
            preVal = val;
            if(nums1Index >= nums1.length){
                val = nums2[nums2Index];
                nums2Index++;
            }
            else if(nums2Index >= nums2.length || nums2[nums2Index] > nums1[nums1Index]){
                val = nums1[nums1Index];
                nums1Index++;
            }
            else{
                val = nums2[nums2Index];
                nums2Index++;
            }
            
        }
        return (nums1.length + nums2.length) % 2 == 0 ? (val + preVal) / 2: val;
    }
}
