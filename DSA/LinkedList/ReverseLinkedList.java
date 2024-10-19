package DSA.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(5);
        // list.add(6);
        // list.add(7);
        for(Object a:list){
            System.out.println(a);
        }

        list.reverse();

        System.out.println("After reverse");
        list.display();
        list.reverse();
        System.out.println("After reverse");
        list.display();


        
    }
   
}
