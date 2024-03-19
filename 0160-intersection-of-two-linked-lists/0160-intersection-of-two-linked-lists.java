/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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
            
            System.out.println("headA: " + tempHeadA + ", headB: " + tempHeadB + " " + (tempHeadA == tempHeadB) + " ");
            
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