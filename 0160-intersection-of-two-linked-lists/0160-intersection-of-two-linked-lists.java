public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode tempHeadA = headA;
        ListNode tempHeadB = headB;
        
        while (tempHeadA != tempHeadB) {
            tempHeadA = tempHeadA.next;
            tempHeadB = tempHeadB.next;
                        
            if (tempHeadA == tempHeadB) {
                return tempHeadA;
            }
            
            if (tempHeadA == null) {
                tempHeadA = headB;
            }
            
             if (tempHeadB == null) {
                tempHeadB = headA;
            }
        }
        
        return tempHeadA;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 */
