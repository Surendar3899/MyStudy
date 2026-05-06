package LeetCode.LinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/*
public ListNode reverseBetween(ListNode head, int left, int right) {

    // Dummy handles edge case when left = 1
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Move prev to node before left
    ListNode prev = dummy;
    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    // curr is first node in sublist
    ListNode curr = prev.next;

    // Reverse nodes using head insertion
    for (int i = 0; i < right - left; i++) {
        ListNode temp = curr.next;
        curr.next = temp.next;
        temp.next = prev.next;
        prev.next = temp;
    }

    return dummy.next;
}
     */

public class ReverseLinkedListII_92 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        int left = 1;
        int right = 5;
        ListNode result = reverseBetween(head,left,right);
        while(result != null){
            System.out.println("val   "+result.val);
            result = result.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=1;i<left;i++){
          prev = prev.next;
        }

        ListNode curr = prev.next;

        for(int i=0;i<right-left;i++){
            ListNode temp = curr.next;
            // ListNode test = temp;
            // while(test != null){
            //     System.out.println("---- "+test.val);
            //     test = test.next;
            // }
            // System.err.println();
            
            curr.next = temp.next;

            // ListNode test2 = curr;
            // while(test2 != null){
            //     System.out.println("curr---- "+test2.val);
            //     test2 = test2.next;
            // }
            // System.err.println();


            temp.next = prev.next;

            //  ListNode test3 = temp;
            // while(test3 != null){
            //     System.out.println("temp---- "+test3.val);
            //     test3 = test3.next;
            // }
            // System.err.println();


            prev.next = temp;
        }




        return dummy.next;
    }

}
