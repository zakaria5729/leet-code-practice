import java.util.HashMap;
import java.util.Map;

// problem link: https://leetcode.com/problems/two-sum/

public class TwoNum_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int[] ints = twoSum(nums, 6);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(i > 0) hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(hashMap.containsKey(diff)) {
                int secondIndex = hashMap.get(diff);

                if(i != secondIndex) {
                    return new int[]{i, secondIndex};
                }
            }
        }

        return new int[]{};
    }
}
