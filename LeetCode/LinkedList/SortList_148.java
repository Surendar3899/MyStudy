public class SortList_148 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1,new ListNode(5,new ListNode(3,new ListNode(4,new ListNode(0,null)))));
        ListNode result = sortList(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find middle
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;  // break list into two halves

        // Step 2: Recursively sort
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: Merge
        return merge(left, right);
    }

    private static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;  // slow will be mid
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
