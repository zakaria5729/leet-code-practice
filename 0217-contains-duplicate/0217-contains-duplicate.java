class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSets = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (numSets.contains(nums[i])) {
                return true;
            }
            
            numSets.add(nums[i]);
        }
        
        return false;
    }
}