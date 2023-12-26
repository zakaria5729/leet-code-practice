class Solution {
    public int missingNumber(int[] nums) {
        
        var n = nums.length;
        var sumOfNums = (n * (n + 1)) / 2;
        
        for (var num: nums) {
           sumOfNums -= num; 
        }
        
        return sumOfNums;
    }
}