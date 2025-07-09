package LeetCode.arraystring;

import java.util.ArrayList;
import java.util.List;

public class FindAllkDistantIndices_2200 {

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,5};
        int key = 2;
        int k = 2;
        List<Integer> result = findKDistantIndices(nums,key,k);
        System.out.println(result);
    }

   public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int j = 0;
            
        for (int i = 0; i < n; ++i) {
            System.out.println(i+"   "+j);
            while (j < n && (nums[j] != key || j < i - k)) {
                System.out.println("while "+nums[i] +" "+nums[j]);
                j++;
            }
            if (j == n) {
                System.out.println("break called");
                break;
            }
            System.out.println("jjjjjj "+j);    
            if (Math.abs(i - j) <= k) {
                ans.add(i);
            }
           
        }

        return ans;
    }

}
