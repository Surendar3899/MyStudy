import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(12);
        pq.add(8);
        
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        


    }

}
