public class SwapNodesPairs_24 {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        ListNode result = swapPairsMyTry(ln);
        for(ListNode current=result;current!=null;current = current.next){
            System.out.println("res "+current.val);
        }


    }

    private static ListNode swapPairsMyTry(ListNode ln) {
        int length = getLength(ln);
        ListNode dummYNode = new ListNode(0,ln);
        
        ListNode prev = dummYNode;
        ListNode current = ln;

        for(int i=1;i<=length/2;i++){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = current;
            prev.next = temp;
            prev = current;
            current = current.next;

        }

        return dummYNode.next;



    }

    public static ListNode swapPairs(ListNode head) {
        int length = getLength(head);
        System.out.println("length is "+length);
        ListNode dummy = new ListNode(0, head);
        System.out.println(dummy.val);
        ListNode prev = dummy;
        System.out.println(prev.val);
        ListNode curr = head;
        System.out.println(curr.val);

        for (int i = 0; i < length / 2; ++i) {
            ListNode next = curr.next;
            System.out.println("nextval "+next.val);
            curr.next = next.next;
            System.out.println("curr.next "+curr.val);
            next.next = curr;
            System.out.println("next.next "+next.val);
            prev.next = next;
            System.out.println("prev.next "+prev.val);
            prev = curr;
            printNode(prev);
            System.out.println("prev length is "+getLength(prev));
            System.out.println("prev "+prev.val);
            curr = curr.next;
            if(curr != null){
                System.out.println("curr "+curr.val);
            }
        }

        return dummy.next;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        for(ListNode current=head;current!=null;current = current.next){
            length++;
        }
        return length;
    }


    private static void printNode(ListNode hNode){
        System.out.println(">>>>printNode");
        for(ListNode current=hNode;current!=null;current = current.next){
            System.out.println(current.val);
        }
        System.out.println("<<<<<printNode");

    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
