package DSA.DoublyLinkedList;

import java.util.Iterator;

import DSA.DoublyLinkedList.Node;

public class DoublyLinkedList<T> implements Iterable {

    Node head;
    Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
          
    }

    public void add(T val){
        Node newNode = new Node<T>(val);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            return;
        }else{
            Node temp = head;
            Node temp1 = tail;
            while(temp != null){
                
                if(temp.next == null){
                    temp.next = newNode;
                    tail = newNode;
                    tail.prev = temp1;
                    return;
                }
                temp = temp.next;
                
            }
            
        }
        

    }

    @Override
    public Iterator iterator() {
       return new ConstructIterator();

    }

    class ConstructIterator implements Iterator<T>{
        Node temp = head;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public T next() {
            T val = (T) temp.data;
           temp = temp.next;
           return val;
        }

    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node<T>(val);
        newNode.next = head;
        if(head == null){
            tail = newNode;
            head = newNode;
        }else{
           head.prev = newNode;
        }

        head = newNode;
       
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    public void insertAtPosition(int pos, T val) {

        if(pos == 0){
            insertAtBeginning(val);
            return;
        }
       Node newNode = new Node<T>(val);
       Node temp = head;
       for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp == null){
                System.out.println("Invalid position entered");
                return;
            }
       }
       //Node next = temp.next;
       newNode.next = temp.next;
       if(tail == temp){
          tail = newNode; 
       }else{
          temp.next.prev = newNode;
       }
       newNode.prev= temp;
       temp.next = newNode;


    }

    public void deleteAtPos(int pos) {
        if(head == null){
            System.out.println("Invalid delete position");
            return;
        }
        if(pos == 0){
            head = head.next;
            head.prev = null;
            return;

        }
        
        Node temp = head;
        Node prev = null;
        for(int i=1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
            if(temp == null){
                System.out.println("Large delete position entered");
                return;
            }
            

            

        }
        prev.next = temp.next;
        if(temp != tail){
          temp.next.prev = prev;
        }else{
            tail = prev;
        }
    }
    
}
