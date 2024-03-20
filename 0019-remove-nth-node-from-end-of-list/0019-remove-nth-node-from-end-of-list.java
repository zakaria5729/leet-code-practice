public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var fastPointer = head;
        var slowPointer = head;
        
        while (n-- > 0) {
            fastPointer = fastPointer.next;
            if (fastPointer == null) return head.next;
        }
        
        while (fastPointer.next != null) {            
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        
        slowPointer.next = slowPointer.next.next;        
        return head;
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