public class Solution {

    public void moveZeroes(int[] nums) {   
        int j = 0;
        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0 && nums[j] == 0) {    
                //swapping values
                nums[j] = nums[i] + nums[j];
                nums[i] = nums[j] - nums[i];
                nums[j] = nums[j] - nums[i];
            }
            
            if (nums[j] != 0) {
                j++;
            }
        }
    }
}