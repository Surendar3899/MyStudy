package DSA.LinkedList;


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



public class LinkedList {

    public Node head;


    // public class Node{
    //     public int data;
    //     public Node next;

    //     public Node(int val){
    //         this.data = val;
    //         this.next = null;

    //     }
    
    // }

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

    public void insertAtBeginning(int i) {
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

    public void insertAtPosition(int pos, int val) {

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
    
}


