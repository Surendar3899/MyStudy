package DSA.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(9);
        list.deleteAtPos(0);


        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtPosition(2,6);
        list.deleteAtPos(1);
        list.display();


        LinkedList list1 = new LinkedList();
        list1.add(8);
        list1.add(7);
        list1.add(6);
        list1.display();
    }
}
