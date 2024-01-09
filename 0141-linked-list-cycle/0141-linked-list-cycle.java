public class Solution {
    
    public boolean hasCycle(ListNode head) {
        var fastPointer = head;
        var slowPointer = head;
        
        // if both pointer meet each other then its cycle
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        
        return false;
    }
}

class Solution2 {
    
    public boolean hasCycle(ListNode head) {
        var hashSet = new HashSet<Integer>();
        
        while (head != null && head.next != null) {
            if (hashSet.contains(head.val)) {
                return true;
            }
            
            hashSet.add(head.val);
            head = head.next;
        }
        
        return false;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
