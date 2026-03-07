import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement_215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 3;
        int result = findKthLargest(nums,k);
        System.out.println("result is "+result);
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(pq.size() < k){
                pq.add(num);
            }else{
                if(pq.peek() < num){
                    pq.poll();
                    pq.add(num);
                }
            }
        }

        return pq.peek();
    }

}
