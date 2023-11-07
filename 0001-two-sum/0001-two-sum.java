public class Solution {
    public int[] twoSum(int[] nums, int target) {   
        final Map<Integer, Integer> numsMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {                        
            Integer secondIndex = numsMap.get(target - nums[i]);
            
            if (secondIndex != null && secondIndex != i) {
                return new int[] {i, secondIndex};
            }
        }

        return new int[] {};
    }
}