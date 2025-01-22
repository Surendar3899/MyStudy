package LeetCode;

import java.util.Arrays;

public class TwoSum_01 {
   public static void main(String[] args) {
    int arr[] = {2,7,11,15};
        int target = 9;
        int newarr[] = twoSum(arr,target);
        System.out.println(Arrays.toString(newarr));
   } 

   public static int[] twoSum(int[] nums, int target) {
        int newarr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(a+nums[j] == target){
                    newarr[0] = i;
                    newarr[1] = j;

                }
            }
        }
        return newarr;
    }
}
