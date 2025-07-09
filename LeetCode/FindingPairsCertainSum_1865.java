package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindingPairsCertainSum_1865 {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> count2 = new HashMap<>();

    public FindingPairsCertainSum_1865(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (final int num : nums2){
            count2.merge(num, 1, Integer::sum);
        }
    }

    public void add(int index, int val) {
        count2.merge(nums2[index], -1, Integer::sum);
        nums2[index] += val;
        count2.merge(nums2[index], 1, Integer::sum);
      
    }

    public int count(int tot) {
        
        int ans = 0;
        for (final int num : nums1){
            ans += count2.getOrDefault(tot - num, 0);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] nums2 =  {1, 4, 5, 2, 5, 4};
        FindingPairsCertainSum_1865 findSumPairs = new FindingPairsCertainSum_1865(nums1,nums2);
        int r1 = findSumPairs.count(7);
        System.out.println("count2 is "+findSumPairs.count2);
        findSumPairs.add(3, 2); 
        System.out.println("r1 is "+r1);
        

    }

}
