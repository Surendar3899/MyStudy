package LeetCode;

public class RemoveNthNodeFromList_19 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        // ListNode head = new ListNode(1,null);
        // ListNode result = removeNthFromEnd(head,2);
        ListNode result = removeNthFromEndMyTry(head,2);
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
    }

    public static ListNode removeNthFromEndMyTry(ListNode head, int n) {
          int length = findLength(head);
          System.out.println("length is "+length);
          int sub = length-n;

          ListNode dummy = head;

          for(int i=0;i<sub-1;i++){
            dummy = dummy.next;
          }

          dummy.next = dummy.next.next;


          return head;
    }

    private static int findLength(ListNode head) {
        int i = 0;

        ListNode dummy = head;
        while(dummy != null){
            i++;
            dummy = dummy.next;
        }

        return i;
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
