package DSA.CircularLinkedList;

public class Demo {
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList<>();
        cl.insertAtBeginning(23);
        cl.insertAtBeginning(22);
        cl.insertAtBeginning(54);
        cl.insertAtEnd(65);
        cl.insertAtEnd(100);
        cl.insertAtEnd("Surendar");
        //cl.deleteAtBegining();
        cl.deleteAtEnd();
        cl.deleteAtEnd();

        cl.display();
    }
}
