package LeetCodeRevise;

public class Leet_02 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode result = addTwoNumbers(l1,l2);
        printResult(result);
    }

    private static void printResult(ListNode result) {
        while(result != null){
            System.out.println("result "+result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode();
       dummy.val = 0;
       ListNode result = dummy;
       //result.val = 0;
       int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null)?l1.val:0;
            int y = (l2 != null)?l2.val:0;
            
            int sum = (x+y+carry);
            System.out.println("sum value "+sum%10);

            carry = sum/10;

            //result.val = sum%10;
            System.out.println("result val "+result.val);
            result.next = new ListNode(sum%10);
            result = result.next;
            System.out.println("result1 val "+result.val);

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            
        }
        return dummy.next;
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
