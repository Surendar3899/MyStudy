package DSA.DoublyCircularLinkedList;

import java.util.Iterator;

public class DoublyCitcularLinkedList<T> {
    
    Node last;
    class Node{
        T data;
        Node next;
        Node prev;
        Node(T data){
           this.data = data;
           next = null;
           prev = null;
        }

    }

    DoublyCitcularLinkedList(){
        last = null;
    }

    void insertAtBeginning(T val){
        Node newNode = new Node(val);
        if(last == null){
            last = newNode;
            last.next = newNode;
            last.prev = newNode;

        }else{
            //last.prev = newNode;
            newNode.next = last.next;
            newNode.next.prev = newNode;
            newNode.prev = last;
            last.next = newNode;

        }
    }


    void insertAtEnd(T val){
        Node newNode = new Node(val);
        if(last == null){
            last = newNode;
            last.next = newNode;
            last.prev = newNode;

        }else{
            Node temp = last;
            newNode.next = last.next;
            last.next.prev = newNode;
            newNode.prev = last;
            temp.next = newNode;
            last = newNode;
        }

    }

    public void display() {
       if(last != null){
        Node temp = last;
        do{
            System.out.println(temp.next.data);
            temp = temp.next;
        }while(temp != last);
       }
    }

    public void displayReverse() {
        if(last != null){
            Node temp = last;
            do{
                System.out.println(temp.data);
                temp = temp.prev;
            }while(temp != last);
           } 
        }
    }

   








  

