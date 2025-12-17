package LeetCode;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RemoveDuplicatesFromSortedList_83 {
    
    public static void main(String[] args) {
        //ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,null)))));
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,null)));

        ListNode result = deleteDuplicates(head);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        while (head.next != null) {
            System.out.println("while");
            ListNode currNode = head;
            int currentvalue = head.val;
            int nextvalue = head.next.val;
            System.out.println("cv "+currentvalue);

            System.out.println("nv "+nextvalue);
            if(currentvalue == nextvalue){
                System.out.println("if");
               currNode.next = currNode.next.next;
               System.out.println("7");
               head = currNode;
               System.out.println("8");
            }else{
                System.out.println("else");
               head = head.next;
            }
        }

        return dummyNode.next;
        
    }

}
