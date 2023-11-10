public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var frequencyMap = new HashMap<Integer, Integer>();
        var buckets = new ArrayList<List<Integer>>();
        buckets.add(new ArrayList<>(0));
        
        for (int num: nums) {
            buckets.add(new ArrayList<>(0));
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // bucket sort technique
        for (int key: frequencyMap.keySet()) {
            buckets.get(frequencyMap.get(key)).add(key);
        }

        int[] results = new int[k];
        
        for (int i = buckets.size() -1; i >= 0; i--) {
            if (k == 0) break;
            
            if (!buckets.get(i).isEmpty()) {
                for (var element: buckets.get(i)) {
                    results[--k] = element;
                }
            }
        }
        
        return results;
    }
}