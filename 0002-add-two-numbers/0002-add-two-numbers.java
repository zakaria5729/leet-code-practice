import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode firstListNode, ListNode secondListNode) {
        BigInteger placeValue = BigInteger.ONE;
        BigInteger firstListValue = BigInteger.ZERO;
        BigInteger secondListValue = BigInteger.ZERO;

        while (firstListNode != null || secondListNode != null) {
            if (firstListNode != null) {
                firstListValue = firstListValue.add(BigInteger.valueOf(firstListNode.val).multiply(placeValue));
                firstListNode = firstListNode.next;
            }

            if (secondListNode != null) {
                secondListValue = secondListValue.add(BigInteger.valueOf(secondListNode.val).multiply(placeValue));
                secondListNode = secondListNode.next;
            }

            placeValue = placeValue.multiply(BigInteger.TEN);
        }

        ListNode headListNode = null;
        ListNode currentListNode = null;
        BigInteger sumOfNodeValues = firstListValue.add(secondListValue);

        while (!sumOfNodeValues.equals(BigInteger.ZERO)) {
            BigInteger reminder = sumOfNodeValues.mod(BigInteger.TEN);
            sumOfNodeValues = sumOfNodeValues.divide(BigInteger.TEN);

            ListNode newListNode = new ListNode(reminder.intValue());

            if (currentListNode == null) {
                currentListNode = newListNode;
                headListNode = currentListNode;
            }

            currentListNode.next = newListNode;
            newListNode.next = null;
            currentListNode = newListNode;
        }

        return headListNode != null ? headListNode : new ListNode(0);
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


// public class Solution {
//     public ListNode addTwoNumbers(ListNode firstListNode, ListNode secondListNode) {
        
//         long placeValue = 1;
//         BigInteger firstListValue = new BigInteger("0");
//         long secondListValue = 0;
        
//          while (firstListNode != null || secondListNode != null) {
//             if (firstListNode != null) {
//                 firstListValue += (firstListNode.val * placeValue);
//                 firstListNode = firstListNode.next;
//             }
            
//             if (secondListNode != null) {
//                 secondListValue += (secondListNode.val * placeValue);
//                 secondListNode = secondListNode.next;
//             }

//             placeValue *= 10;
//         }
        
//         ListNode headListNode = null;
//         ListNode currentListNode = null;
//         long sumOfNodeValues = firstListValue + secondListValue;
        
//         while(sumOfNodeValues != 0) {
//             long reminder = sumOfNodeValues % 10;
//             sumOfNodeValues /= 10;
            
//             ListNode newListNode = new ListNode((int) reminder);
            
//             if (currentListNode == null) {
//                 currentListNode = newListNode;
//                 headListNode = currentListNode;
//             }
            
//             currentListNode.next = newListNode;
//             newListNode.next = null;
//             currentListNode = newListNode;
//         }
        
//         return headListNode != null ? headListNode : new ListNode(0);
//     }
// }

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */