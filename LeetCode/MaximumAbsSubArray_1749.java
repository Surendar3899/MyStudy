package LeetCode;

public class MaximumAbsSubArray_1749 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,-9,-14,20};
        int result = maxAbsoluteSum(nums);
        System.out.println("result is "+result);
    }

    public static int maxAbsoluteSum(int[] nums) {
        int currentmax = nums[0];
        int globalmax = nums[0];
        int currentmin = nums[0];
        int globalmin  = nums[0];

        // kadane's algorithm
        for(int i=1;i<nums.length;i++){
            currentmax = Math.max(nums[i],currentmax+nums[i]);
            globalmax  = Math.max(globalmax,currentmax);

            currentmin = Math.min(nums[i],currentmin+nums[i]);
            globalmin  = Math.min(globalmin,currentmin);

        }

        globalmin = Math.abs(globalmin);
        globalmax = Math.max(globalmax,globalmin);
        System.out.println("globalmax is "+globalmax);

        return globalmax;
    }

}
