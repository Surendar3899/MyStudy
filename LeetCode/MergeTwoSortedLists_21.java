package LeetCode;
import java.util.List;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
        ListNode result = mergeTwoLists(l1, l2);
        while(result != null){
            System.out.println("res "+result.val);
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            System.out.println(list1.val);
            System.out.println(list2.val);
           if(list1.val > list2.val){
            System.out.println("if");
             current.next = list2;
             list2 = list2.next;

           }else{
            System.out.println("else");
            current.next = list1;
            list1 = list1.next;
           }
           current = current.next;
        }

        if(list1 != null){
            current.next = list1;
            current = current.next;
        }
        if(list2 != null){
            current.next = list2;
            current = current.next;
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
