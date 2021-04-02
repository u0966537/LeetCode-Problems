class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 1)
            return new int[]{};
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rest = target - nums[i];
            
            if(map.containsKey(rest)){
                return new int[]{map.get(rest), i};
            }
            map.put(nums[i], i);
            
        }        
        return new int[]{};

    }
}




class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 1)
            return new int[]{};
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        
        return new int[]{};
    }
}





