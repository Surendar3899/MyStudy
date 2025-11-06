package LeetCode;
public class ConvertBinaryNumber_1290 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        //ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode ln = new ListNode(4, new ListNode(5, new ListNode(7, null)));
        ListNode ln1 = new ListNode();
        int result = getDecimalValue(ln);
        System.out.println("result is "+result);
              
    }

    public static int getDecimalValue(ListNode head) {
        int ans  = 0;

        while(head != null){
            ans = ans * 2+head.val;
            head = head.next;
        }

        return ans;
        
    }

}
