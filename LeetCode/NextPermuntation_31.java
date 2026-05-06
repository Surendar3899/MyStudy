package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermuntation_31 {
    public static void main(String[] args) {
       int[] arr = {1,2,5,4,3};
       nextPermutation(arr);
       System.out.println(Arrays.toString(arr));
        
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        while(i>=0&&nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);

        
    }

    private static void reverse(int[] nums, int start) {
        int e = nums.length-1;
        while(start < e){
            swap(nums,start,e);
            start++;
            e--;
            break;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
