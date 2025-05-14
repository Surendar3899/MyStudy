package LeetCodeRevise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Leet_3396 {
   public static void main(String[] args) {
       int arr[] = {1,2,3,4,2,3,3,3,5,7};
       int result = minimumOperations(arr);
       System.out.println("result is "+result);
   }

   public static int minimumOperations(int[] nums) {
       int result = 0;
       Set<Integer> seen = new HashSet<>();
       for(int i=nums.length-1;i>=0;i--){
                if(!seen.add(nums[i])){
                    return (i+3)/3;
                }
       }
       return result;
   }
}
