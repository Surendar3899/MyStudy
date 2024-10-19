package DSA.LinkedList;

import java.util.Iterator;

/*
 * Linked List
 * 
 * Insert at Beginning
 * Display
 * Insert at any pos
 * Delete at any pos
 * 
 * generics
 */



public class LinkedList<T> implements Iterable {

    public Node head;


    // public class Node{
    //     public int data;
    //     public Node next;

    //     public Node(int val){
    //         this.data = val;
    //         this.next = null;

    //     }
    
    // }


        /*try the following methods
        * 
        * get(pos) - get(2)
        * update(pos,val)
        * deleteAtEnd
        * insertAtEnd(val)
        * search(val) - return index, -1
        * contains(val) - return true or false
        * length
        */

    public LinkedList(){
        head = null;
    }

    public void add(int i){
        Node newNode = new Node(i);


        if(head == null){
            head = newNode;
        }else{
            Node temp = head;

            while(temp.next!= null){
                temp = temp.next;
                // if(temp == null){
                //     temp = newNode;
                // }
            }
            temp.next = newNode;
        }
    }

    public void insertAtBeginning(T i) {
        Node newNode = new Node(i);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;

        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }




    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertAtPosition(int pos, T val) {

        if(pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp == null){
                System.out.println("Invalid argument");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtPos(int pos) {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        if(pos == 0){
            head = temp.next;
            return;
        }
        Node prev = null;
        for(int i=0;i<pos;i++){
            prev = temp;
            temp = temp.next;

            if(temp == null){
                System.out.println("invalid argument delete ");
                return;
            }
            
        }
        prev.next = temp.next;

        
    }

    public T getPos(int pos) throws Exception {
        Node temp = head;
        if(temp != null){
            if(pos == 0){
                return (T) temp.data;
            }else{
                for(int i = 0;i<pos;i++){
                    temp = temp.next;
                    if(temp == null){
                        // System.out.println("Invalid position entered");
                        // return null;
                        throw new Exception("Invalid position entered");
                    }
                }
                return (T)temp.data;
            }
        }
        return null;
        
    }

    public void update(int pos, T val) {
       
    }

    @Override
    public Iterator<T> iterator() {

        System.out.println("call iterator method");

        //return new LinkedListIterator();
        return new Iterator<T>() {
            //anonymous class
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
            
        };

        
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public void reverse() {
       Node temp = head;
       Node temp1 = head;

         Node prev = null;
         Node current = head;
         Node next = null;

         while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;



         }
         head = prev;


       
    }
    
}


