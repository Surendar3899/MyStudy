package MyPractice;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int k=3;
       rotate(nums,k); 
       System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
         k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k );
        reverse(nums, k+1, nums.length - 1);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r){
            swap(nums, l++, r--);
        }
    }

    private static void swap(int[] nums, int l, int r) {
        final int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
