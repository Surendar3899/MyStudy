package LeetCode;

public class RotateList_61 {

    public static void main(String[] args) {
       ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
       int k = 4;
       ListNode result2 = rotateRight(head,k);

       ListNode result = result2;
       while(result != null){
        System.out.println(result.val);
        result = result.next;
       }

    }

    public static  ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length and tail
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        if(k == 0){
            return head;
        }

        System.out.println("length is "+length);

        // Step 2: make circular list
        tail.next = head;

      

        // Step 3: reduce k
        k = k % length;
        if(k == 0){
            return head;
        }


        int stepsToNewTail = length - k - 1;

        // Step 4: find new tail
        ListNode newTail = head;


        int a = 1;

        // while(newTail != null){
        //     System.out.println("nn "+newTail.val);
        //     newTail = newTail.next;
        //     a++;
        //     if(a==7){
        //         break;
        //     }
        // }


        for (int i = 0; i < stepsToNewTail; i++) {
            System.out.println("steps "+i);
            newTail = newTail.next;
        }

        // Step 5: new head
        ListNode newHead = newTail.next;

        // Step 6: break circle
        newTail.next = null;

        return newHead;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
