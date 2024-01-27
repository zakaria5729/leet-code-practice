class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode currentHead = new ListNode(head.val);
        ListNode newHead = currentHead;
        
        while(head != null) {
            if (head.next != null && head.val != head.next.val) {
                currentHead.next = new ListNode(head.next.val);
                currentHead = currentHead.next;
            }
            
            head = head.next;
        }
        
        return newHead;
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
 *     public String toString() { return val; } 
 *
 * }
 */