class Solution {
    public int[] twoSum(int[] nums, int target) {
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