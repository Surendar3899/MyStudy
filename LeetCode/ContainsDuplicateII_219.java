package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII_219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums,k);
        System.out.println("result is "+result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> se = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(!se.add(nums[i])){
            return true;
           }
           if(i>=k){
            se.remove(nums[i-k]);
           }
        }
        return false;
    }

}
