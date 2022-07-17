class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] sums = new int[length];
        
        for(int i = 0; i < length; i++) {
            int sum = nums[i];
            
            if(i > 0) {
                sum = sum + sums[i - 1]; 
            }
            
            sums[i] = sum;
        }
        
        return sums;
    }
}