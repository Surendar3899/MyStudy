package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsequtiveSequence_128 {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int result = longestConsecutive(nums);
        System.out.println("result is "+result);
    }

    public static int longestConsecutive(int[] nums) {
       int ans = 0;
       Set<Integer> se = Arrays.stream(nums).boxed().collect(Collectors.toSet());
       for(int num:se){
         if(se.contains(num-1)){
            continue;
         }
         int length = 1;
        
            while(se.contains(++num)){
                length++;
            }
         ans = Math.max(ans,length);
       }
       return ans; 
    }

}
