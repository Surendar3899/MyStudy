import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {
    public static void main(String[] args) {
        // ImplementStackUsingQueues_225 mystack = new ImplementStackUsingQueues_225();
        // mystack.push(4);
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.offer(4));

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);


    }





    Queue<Integer> queue;
    public ImplementStackUsingQueues_225() {
       queue = new LinkedList<>(); 
    }
    
    public void push(int x) {
        queue.offer(x);

        int size = queue.size();

        // Move previous elements behind the new element
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }

}
