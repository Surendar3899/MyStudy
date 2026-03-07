package LeetCode.LinkedList;


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
       this.data = data;
       next = null;
    }
    ListNode(int data,ListNode next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedListCycle_141 {

    public static void main(String[] args) {
        ListNode head = new ListNode(4,new ListNode(3,new ListNode(3,new ListNode(4,null))));
        boolean result = hasCycle(head);     
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
