package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubArray_3487 {
    public static void main(String[] args) {
        int[] nums = {-100};
        int result = maxSum(nums);
        System.out.println("result is "+result);

    }

    public static int maxSum(int[] nums) {
        int currentmax = 0;
        int minusmax = Integer.MIN_VALUE;
        Set<Integer> se = new HashSet<>();
        

        for(int i=0;i<nums.length;i++){
            if(!se.contains(nums[i]) && nums[i] > 0){
                currentmax += nums[i];
                se.add(nums[i]);
            }else{
                minusmax = Math.max(minusmax, nums[i]);
            }
        }
        if(se.size() == 0){
           return minusmax;
        }
        return currentmax;
    }

}
