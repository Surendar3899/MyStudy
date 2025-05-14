package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountNumberGoodSubArrays_2537 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2,2,4};
        int k = 2;
        long result = countGood(nums,k);
        System.out.println("result is "+result);
    }

    public static long countGood(int[] nums, int k) {
        long ans = 0;
        int pairs = 0;
        int l = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            System.out.println("nums[r] "+nums[r]);
            System.out.println("countmap "+countMap.toString());
            int freq = countMap.getOrDefault(nums[r], 0);
            pairs += freq;
            countMap.put(nums[r], freq + 1);
            
            while (pairs >= k) {
                System.out.println("while running");
                System.out.println("l is "+l);
                System.out.println("nums[l] is "+nums[l]);
                System.out.println("pairs is "+pairs);
                int leftFreq = countMap.get(nums[l]);
                System.out.println("leftFreq "+leftFreq);
                countMap.put(nums[l], leftFreq - 1);
                pairs -= (leftFreq - 1);
                l++;
            }
            ans += l;
            System.out.println("ans is "+ans);
        }

        return ans;
    }

    public static long countGood(int[] nums, int k,int l) {
        int pairCount = 0, left = 0;
        long goodCount = 0;
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            int val = nums[right];
            pairCount += freqMap.getOrDefault(val, 0);
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);

            while (pairCount >= k) {
                goodCount += (n - right);
                int leftVal = nums[left];
                freqMap.put(leftVal, freqMap.get(leftVal) - 1);
                pairCount -= freqMap.get(leftVal);
                left++;
            }
        }

        return goodCount;
    }


    
}
