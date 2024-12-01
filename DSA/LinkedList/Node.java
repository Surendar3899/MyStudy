package DSA.LinkedList;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T val){
        this.data = val;
        this.next = null;

    }

    public Node(T val,Node node){
        this.data = val;
        this.next = node;
    }
}
