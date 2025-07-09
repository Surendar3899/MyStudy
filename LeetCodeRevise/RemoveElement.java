package LeetCodeRevise;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,5,6,3};
        int val = 3;

        int i =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
