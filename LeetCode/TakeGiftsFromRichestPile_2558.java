import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromRichestPile_2558 {

    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        long result = pickGifts(gifts,k);
        System.out.println("result is "+result);

    }

    public static long pickGifts(int[] gifts, int k) {
        long ans = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int gift:gifts){
            que.add(gift);
        }

        while(k-- > 0){
          que.add((int)Math.sqrt(que.poll()));
        }

        while(que.size() > 0){
            ans = ans+que.poll();
        }

        return ans;
    }

}
