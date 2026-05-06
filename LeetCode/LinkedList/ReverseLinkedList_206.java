public class ReverseLinkedList_206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        ListNode result = reverseList(head);
        while(result != null){
            System.out.println("val   "+result.val);
            result = result.next;
        }
    }

    public static  ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        int length = findLength(head);
        System.out.println("length is "+length);

        ListNode curr = dummy.next;
        for(int i=1;i<length;i++){
          ListNode temp = curr.next;
          curr.next = temp.next;
          temp.next = dummy.next;
          dummy.next = temp;


        }

        return dummy.next;
    }

    private static int findLength(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
