public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] results = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            results[i] = temp;
            temp *= nums[i];
        }
        
        temp = 1;
        
        for (int j = nums.length -1; j >= 0; j--) {
            results[j] *= temp;
            temp *= nums[j];
        }
        
        return results;
    }
}
