public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null) return null;
        var frequencyMap = new LinkedHashMap<Integer, Integer>();
        
        while (head != null) {
            frequencyMap.put(head.val, frequencyMap.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        
        var current = new ListNode(-1);
        var newHead = current;
        
        for (var key: frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                current.next = new ListNode(key);
                current = current.next;
            }
        }
        
        return newHead.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
