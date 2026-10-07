import java.util.Arrays;

public class NodesBetweenCriticalPoints_2058 {

    public static void main(String[] args) {
        ListNode head = new ListNode(5,new ListNode(3,new ListNode(1,new ListNode(2,new ListNode(5,new ListNode(1,new ListNode(2)))))));
        int[] result = nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1;
        int prevCritical = -1;
        int min = Integer.MAX_VALUE;

        int index = 1;
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) {
                    first = index;
                } else {
                    min = Math.min(min, index - prevCritical);
                }

                prevCritical = index;
            }

            prev = curr;
            curr = next;
            index++;
        }

        if (first == -1 || first == prevCritical) {
            return new int[]{-1, -1};
        }

        int max = prevCritical - first;

        return new int[]{min, max};
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(){

    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
