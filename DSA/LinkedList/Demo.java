package DSA.LinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(9);
        list.deleteAtPos(0);

        list.insertAtBeginning(7);
        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtBeginning(3);

        list.insertAtPosition(2,6);
        list.deleteAtPos(1);
        list.display();
        Object value = list.getPos(3);
        System.out.println("get Pos value is "+value);

        list.update(2,89);

       Iterator it = list.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }


       for(Object a:list){
           System.out.println(a);
       }



       System.out.println();


        LinkedList list1 = new LinkedList();
        list1.add(8);
        list1.add(7);
        list1.add(6);
        list1.display();


        



    }
}
