public class Solution {
    public ListNode mergeInBetween(ListNode listNode1, int a, int b, ListNode listNode2) {
        
        var currentNode = new ListNode(-1, listNode1);
        var resultNode = currentNode;
        
        // Move to the (a-1)-th node
        for (int i = 0; i < a; i++) {
            currentNode = currentNode.next;
            listNode1 = listNode1.next;
        }
        
        // Connect the (a-1)-th node to the head of listNode2
        currentNode.next = listNode2;
        
        // Move to the end of currentNode
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        // Skip nodes in listNode1 from a-th to b-th
        for (int i = a; i <= b; i++) {
            listNode1 = listNode1.next;
        }
        
        // Connect the remaining listNode1
        currentNode.next = listNode1;
        
        return resultNode.next;
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