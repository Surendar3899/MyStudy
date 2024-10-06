package LeetCode;

/*Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]*/

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println("l1 "+l1);
        System.out.println("l2 "+l2);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum of current digits and the carry
            int sum = x + y + carry;
            System.out.println("sum "+sum);

            

            // Update carry for the next iteration
            carry = sum / 10;

            // Create a new node with the digit value of the sum
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in l1 and l2
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Return the resulting list (skip the dummy node)
        return dummy.next;
    }
}

public class AddTwoNumbers_02 {

    public static void main(String[] args) {
        // Example 1: Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result list
        printList(result);  // Expected output: 7 -> 0 -> 8
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}

