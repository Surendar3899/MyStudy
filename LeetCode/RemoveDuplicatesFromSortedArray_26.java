package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int result = removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        int i = 1;

        for(int num:nums){
            System.out.println(nums[i]);
           if(num!=nums[i-1]){
            nums[i++] = num;
           }
        }
        System.out.println(Arrays.toString(nums) +"   "+i);
        return i;
    }
} 
