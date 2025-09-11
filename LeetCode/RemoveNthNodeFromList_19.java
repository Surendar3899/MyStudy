public class RemoveNthNodeFromList_19 {

    public static void main(String[] args) {
        //ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        ListNode head = new ListNode(1,null);
        ListNode result = removeNthFromEnd(head,1);
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: implement logic
        ListNode slow = head;
        ListNode fast = head;

        while(n > 0){
            n--;
            fast = fast.next;
            if(fast == null){
                return head.next;
            }
        }

        while(fast.next != null){
            System.out.println(fast.val);
            fast = fast.next;
            slow = slow.next;

        }

        slow.next = slow.next.next;

        

        return head;
    }

    
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
