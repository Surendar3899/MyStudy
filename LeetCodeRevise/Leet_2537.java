package LeetCodeRevise;

import java.util.HashMap;
import java.util.Map;

public class Leet_2537 {
     public static void main(String[] args) {
         int[] nums = {2,1,3,1,2,2,3,3,2,2,1,1,1,3,1};
        int k = 11;
        long result = countGood(nums,k);
        System.out.println("result is "+result);
     }

     public static long countGood(int[] nums, int k) {
        long ans = 0;
        int pairs = 0;
        int l = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            int freq = countMap.getOrDefault(nums[r], 0);
            pairs += freq;
            countMap.put(nums[r], freq + 1);
            
            while (pairs >= k) {
                int leftFreq = countMap.get(nums[l]);
                countMap.put(nums[l], leftFreq - 1);
                pairs -= (leftFreq - 1);
                l++;
            }
            ans += l;
        }

        return ans;
    }
}
