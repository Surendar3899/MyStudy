import java.util.HashMap;
import java.util.Map;

class Node{
    Node next;
    Node prev;
    int key;
    int value;
    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
        
}

public class LRUCache_146 {
    class Node{
        Node next;
        Node prev;
        int key;
        int value;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
        
    }
    
    int capacity = 0;
    Node head;
    Node tail;
    Map<Integer,Node> map = new HashMap<>();

    public LRUCache_146(int capacity) {
       this.capacity = capacity;
       head = new Node(0, 0);
       tail = new Node(0, 0);
       head.next = tail;
       tail.prev = head;
        
    }  
       
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        int value1 = node.value;
        remove(node);
        Node newNode = new Node(key, value1);
        map.put(key, newNode);
        insertToFront(newNode);
        return value1; 
    }  
      
    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    } 
       
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == this.capacity){
            remove(tail.prev);
        }
      
        Node node = new Node(key, value);
        map.put(key, node);
        insertToFront(node);
    } 
      
    public void insertToFront(Node node){

      node.next = head.next;
      node.prev = head;
      head.next.prev = node;
      head.next = node;

    }
    public static void main(String[] args) {
        LRUCache_146 cache = new LRUCache_146(2);
        System.out.println(cache.get(2));

        cache.put(2, 6);
        System.out.println(cache.get(1));
        cache.put(1, 5);

        Node dummy = cache.head;
        while(dummy != null){
            System.out.println("key  "+dummy.key);
            System.out.println("value is "+dummy.value);
            dummy = dummy.next;
        }

        Node dummy1 = cache.tail;
        while(dummy1 != null){
            System.out.println("key  "+dummy1.key);
            System.out.println("value is "+dummy1.value);
            dummy1 = dummy1.prev;
        }


        cache.put(1, 2);


        System.out.println(cache.get(1));
        System.out.println(cache.get(2));

        

        // while(cache.head != null){
        //     System.out.println(cache.head.key);
        //     cache.head = cache.head.next;
        // }
    }

}
