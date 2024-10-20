package DSA.DoublyLinkedList;

public class Node<T> {
    public T data;
    public Node next;
    public Node prev;
    public Node(T val){
       this.data = val;
       this.next = null;
       this.prev = null;
    }
}
