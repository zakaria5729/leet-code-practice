public class Solution {
    public ListNode middleNode(ListNode head) {
        
        if (head.next == null) {
            return head;
        }
        
        var fastPointer = head;
        var slowPointer = head;
        
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        return slowPointer;
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