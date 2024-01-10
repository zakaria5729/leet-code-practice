public class Solution {
     public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        
        var mergedNode = new ListNode(-1);
        var currentNode = mergedNode;
        
        while(listNode1 != null && listNode2 != null) {
            
            if (listNode1.val <= listNode2.val) {
                currentNode.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                currentNode.next = listNode2;
                listNode2 = listNode2.next;
            }
            
            currentNode = currentNode.next;
        }
         
        currentNode.next = (listNode1 != null) ? listNode1 : listNode2;
         
        return mergedNode.next;
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