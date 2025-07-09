package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumNumEvents_1353 {

    public static void main(String[] args) {
       int[][] events = {{1,2},{2,3},{3,5},{2,3},{2,3},{2,3}};
       int result = maxEventsmyTry(events);
       System.out.println("result is "+result);
    }

    public static int maxEventsmyTry(int[][] events){
        int res = 0;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        int day = 1;
        int maxDay = 0;

        Arrays.sort(events,(a,b) -> a[0]-b[0]);

        for(int[] a:events){
           maxDay = Math.max(maxDay,a[1]);
        }

        int i =0;

        while(day <= maxDay){
            System.out.println("day is "+day);
          while(i<events.length && events[i][0] == day){
            pq1.add(events[i][1]);
            i++;
          }

          while(!pq1.isEmpty() && day > pq1.peek()){
            System.out.println("unwanted deletes");
              pq1.poll();
          }

          if(!pq1.isEmpty()){
            pq1.poll();
            res++;
          }
          day++;
        }

        return res;
    }


    public static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]); // Step 1: Sort by start day
        Arrays.sort(events, Comparator.comparingInt(event -> event[0])); // use any one sort because both are same

        System.out.println(Arrays.deepToString(events));

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-heap of endDays

        int i = 0;
        int res = 0;
        int day = 1;

        // Find the max day to bound the loop
        int maxDay = 0;
        for (int[] e : events) {
            maxDay = Math.max(maxDay, e[1]);
        }

        System.out.println("maxday is "+maxDay);

        while (day <= maxDay) {
            System.out.println("1st while "+day);
            // Step 2: Add all events starting today
            while (i < events.length && events[i][0] == day) {
                System.out.println("second while "+day);
                pq.offer(events[i][1]); // Add endDay
                i++;
            }
            System.out.println("pq is "+pq +" day "+day);
            // Step 3: Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                System.out.println("unwanted pg deleted "+pq.peek());
                pq.poll();
            }

            // Step 4: Attend event that ends earliest
            if (!pq.isEmpty()) {
               
                pq.poll(); // Attend one event
                res++;     // Count one attendance
            }
            System.out.println("res is "+res);

            day++; // Move to next day
        }

        return res;
    }

}
