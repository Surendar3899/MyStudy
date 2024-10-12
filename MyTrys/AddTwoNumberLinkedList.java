package MyTrys;

import DSA.LinkedList.*;
import DSA.LinkedList.Node;;


public class AddTwoNumberLinkedList {
  
    public static void main(String[] args) {
        
    LinkedList list1 = new LinkedList();
    list1.insertAtBeginning(3);
    list1.insertAtBeginning(4);
    list1.insertAtBeginning(2);

    LinkedList list2 = new LinkedList();
    list2.insertAtBeginning(4);
    list2.insertAtBeginning(6);
    list2.insertAtBeginning(5);

    Node result  = addTwoNumbers(list1,list2);

    while(result != null){
        System.out.println("vals "+result.data);
        result = result.next;
    }


    }

    private static Node addTwoNumbers(LinkedList list1, LinkedList list2) {

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while(temp1 != null || temp2 != null || carry != 0){
            int sum = temp1.data+ temp2.data+carry;
            carry = sum/10;
            System.out.println("sum "+sum);
            
            current.next = new Node(sum%10);
            current = current.next;

            if(temp1 != null){
              temp1 = temp1.next;
            }

            if(temp2 != null){
              temp2 = temp2.next;
            }
           

        }

        return dummy;
        
        
       
    }
    


    
}
