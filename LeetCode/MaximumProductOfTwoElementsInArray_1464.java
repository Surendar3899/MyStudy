import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumProductOfTwoElementsInArray_1464 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,2,1,0};
        int result = maxProduct(nums);
        System.out.println("result is "+result);

    }

    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<nums.length;i++){
          q.add(nums[i]);
          
        }
        

        max1 = q.poll();
        max2 = q.poll();


        return (max1-1)*(max2-1);
    }

}
