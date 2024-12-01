package DSA.CircularLinkedList;

import java.util.Iterator;


public class CircularLinkedList<T> implements Iterable {

    Node last;

    public class Node<T> {
       T data;
       Node next;
       Node(T val){
           data = val;
           next = null;
       }
    }

    CircularLinkedList(){
       last = null;
          
        
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    public void insertAtBeginning(T val){
        Node newNode = new Node<T>(val);
        if(last == null){
            
            last = newNode;
            last.next = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;

        }
    }

    public void insertAtEnd(T val){
        Node newNode = new Node<T>(val);
        if(last == null){
            
            last = newNode;
            last.next = newNode;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;

        }
    }


    public void display(){
        // Node temp = last;
        // while(temp.next != null){
        //     System.out.println(temp.next.data);
        //     if(temp.next == last){
        //         break;
        //     }
        //     temp = temp.next;
            
        // }

        if(last == null){
            throw new IndexOutOfBoundsException("You tried display from empty list");
        }
        Node temp = last.next;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != last.next);





    }

    public void deleteAtBegining() {
        if(last == null){
            throw new IndexOutOfBoundsException("You tried delete from empty list");
        }



        if(last.next == last){
            last = null;
        }else{
            //Node temp = last.next.next;
            last.next = last.next.next;;
        }

    }

    public void deleteAtEnd() {
        if(last == null){
            throw new IndexOutOfBoundsException("You tried delete from empty list");
        }



        if(last.next == last){
            last = null;
        }else{
            Node temp = last;
            while(temp.next != last){
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
            
        }
    }

    
    
}
