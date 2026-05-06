package LeetCode;

import java.util.Arrays;

public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
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

    public static int firstMissingPositive2(int[] nums) {
    int n = nums.length;

    // Step 1: Place elements in correct position
    for (int i = 0; i < n; i++) {
        while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
            swap(nums, i, nums[i] - 1);
        }
    }

    // Step 2: Find first missing positive
    for (int i = 0; i < n; i++) {
        if (nums[i] != i + 1) {
            return i + 1;
        }
    }

    return n + 1;
}

private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

}
