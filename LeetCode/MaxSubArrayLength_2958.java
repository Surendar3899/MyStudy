import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayLength_2958 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        int result = maxSubarrayLength(nums, k);
        System.out.println("result is "+result);
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        int ans  = 0 ;
        int left = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            while(map.get(nums[right]) > k){
                map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

}
