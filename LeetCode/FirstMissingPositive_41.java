package LeetCode;

import java.util.Arrays;

public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int result = firstMissingPositive(nums);
        System.out.println("result is "+result);
    }

    public static int firstMissingPositive(int[] nums) {
        int ans = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));



        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            int a = Math.abs(nums[i]);
            if(a <= 0 || a > nums.length){
                continue;
            }

            if(nums[a-1] == 0){
                nums[a-1] = Integer.MIN_VALUE;
            }else if(nums[a-1] > 0){
                nums[a-1] *= -1;
            }
            
            
        }

        System.out.println(Arrays.toString(nums));

        for(int i=1;i<nums.length+1;i++){
            if( nums[i-1] >= 0){
                System.out.println("if passed");
                ans = i;
                break;
            }
            ans = i+1;
        }
        System.out.println(Arrays.toString(nums));

        
        return ans;

    }

}
