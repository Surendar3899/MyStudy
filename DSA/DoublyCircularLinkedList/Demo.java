package DSA.DoublyCircularLinkedList;

public class Demo {


    public static void main(String[] args) {
        DoublyCitcularLinkedList dcl = new DoublyCitcularLinkedList<>();
        dcl.insertAtBeginning(2);
        dcl.insertAtBeginning(3);
        dcl.insertAtBeginning(4);
        dcl.insertAtBeginning(5);
        dcl.insertAtBeginning(6);
         
        dcl.insertAtEnd(9);
        dcl.insertAtEnd(19);
        dcl.insertAtEnd(29);
        dcl.insertAtEnd(39);


        dcl.display();

        dcl.displayReverse();
    }
   
    

    

}
