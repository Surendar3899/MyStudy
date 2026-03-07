package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedListII_82 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(5))))));
        ListNode result = deleteDuplicates(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head!= null){

            while(head.next != null && head.val == head.next.val){
                head = head.next;
            }

            if(prev.next == head){
                prev = prev.next;
            }else{
                prev.next = head.next;
            }
            
            head = head.next;
        }
        return dummy.next;
        
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
