package LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumErasureValue_1695 {
    public static void main(String[] args) {
        int[] nums = {5,2,1,2,5,2,1,2,5};
        int result = maximumUniqueSubarray(nums);
        System.out.println("result is "+result);
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int left = 0;
        int currentSum = 0;
        Set<Integer> se = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
           while(se.contains(nums[i])){
            se.remove(nums[left]);
            currentSum -= nums[left];
            left++;
           }
           se.add(nums[i]);
           currentSum += nums[i];
           ans = Math.max(ans, currentSum);
           
        }

        return ans;
    }

}
