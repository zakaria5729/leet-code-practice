public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        int[] results = new int[2];
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                results[0] = left + 1;
                results[1] = right + 1;
                break;
            }
            
            if (sum < target) left++; else right--;
        }
        
        return results;
    }
}