public class GetIntersectionNode_160 {

    public static void main(String[] args) {
       ListNode common = new ListNode(8,new ListNode(4,new ListNode(5,null)));
       ListNode listA = new ListNode(4,new ListNode(1,common));
       ListNode listB = new ListNode(5,new ListNode(6,new ListNode(1,common)));

       ListNode result = getIntersectionNode(listA, listB);

        System.out.println(result.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

}

class ListNode{

    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }


}
