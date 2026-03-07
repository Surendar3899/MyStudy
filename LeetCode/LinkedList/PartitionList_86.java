
public class PartitionList_86 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5,new ListNode(2,null))))));
        int x = 3;
        ListNode result = partition(head,x);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode after = afterHead;

        for (; head != null; head = head.next){
            if (head.val < x) {
                before.next = head;
                before = head;
            } else {
                after.next = head;
                after = head;
            }
        }

        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
