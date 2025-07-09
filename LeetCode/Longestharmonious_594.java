package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Longestharmonious_594 {
    public static void main(String[] args) {
       int[] nums = {3,1,3,2,2,5,2,3,7,3,6,6,6,6,6,6,6,6,6,6};
       int result = findLHS(nums);
       System.out.println("result is "+result);
    }

    public static int findLHS(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (final int num : nums){
            count.merge(num, 1, Integer::sum);
            System.out.println(count);
        }

        for (final int num : count.keySet()){
            System.out.println("nn  "+num);
            if (count.containsKey(num + 1)){
                ans = Math.max(ans, count.get(num) + count.get(num + 1));
            }    
        }    

        return ans;
    }

    public static int findLHSSimple(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> count = new LinkedHashMap();

        for (final int num : nums){
            //count.put(num,count.getOrDefault(num,0)+1);
            count.put(num,count.getOrDefault(num,0)+1);
            System.out.println(count);
        }

        for (final int num : count.keySet()){
            if (count.containsKey(num + 1)){
                ans = Math.max(ans, count.get(num) + count.get(num + 1));
            }    
        }    

        return ans;
    }

}
