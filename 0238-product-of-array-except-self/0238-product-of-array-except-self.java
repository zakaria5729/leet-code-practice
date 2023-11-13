class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, mult = 1;
    int[] ans = new int[n];
        
    for(int i = 0; i<n; i++){
        ans[i] = mult;
        mult*=nums[i];
        
        System.out.println("i: " + i + "ans[i]: " + ans[i] + "mult: " + mult);
    }
        
    System.out.println();
    
    mult = 1;
    for(int j = n-1; j>=0; j--){
        ans[j]*=mult;
        mult*=nums[j];
        
        System.out.println("j: " + j + "ans[j]: " + ans[j] + "second mult: " + mult);
    }
        
    return ans;
        
//         int[] results = new int[nums.length];
        
//         for (int i = 0; i < nums.length; i++) {
//             results[i] = getSum(nums, i);
//         }
        
//         return results;
    }
    
    private int getSum(int[] nums, int j) {
        int sum = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (i != j) {
                sum *= nums[i];    
            }
            
            if (sum == 0) {
                break;
            }
        }
        
        return sum;
    }
}
