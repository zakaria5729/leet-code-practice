public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode tempHead = head;
        ListNode prevNode = null;
        ListNode reverseNode = null;

        while (tempHead != null) {
            if (reverseNode == null) {
                reverseNode = new ListNode(tempHead.val);
            } else {
                prevNode.next = reverseNode;
                reverseNode = prevNode;
            }

            tempHead = tempHead.next;
            if (tempHead != null) prevNode = new ListNode(tempHead.val);
        }

        while (head.next != null) {
            if (reverseNode.val != head.val) return false;
            reverseNode = reverseNode.next;
            head = head.next;
        }

        return true;
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