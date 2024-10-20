package DSA.DoublyLinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        
    
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtBeginning(3);
        list.insertAtBeginning(9);
        list.insertAtBeginning(7);
       

        //list.displayReverse();

        list.insertAtPosition(3,8);

        list.deleteAtPos(3);

        System.out.println("List -->");
        for(Object a:list){
          System.out.print(a +" ");
        }
        System.out.println();
        list.displayReverse();
    }
    
}
