package MyTrys;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCheck {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque();
        q.add(40);
        q.add(56);
        q.poll();
        q.add(32);
        q.add(19);
        q.poll();
        q.add(87);
        q.poll();

        System.out.println(q.toString());

    }
}
