package LeetCode;

public class MaximumSubCircularSubArray_918 {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-3};
        int result = maxSubarraySumCircular(nums);
        System.out.println("result is "+result);
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0;
        int globalMax = Integer.MIN_VALUE;
        int currentMin = 0;
        int globalMin = Integer.MAX_VALUE;

        int totalSum = 0;

        for(int num:nums){
            totalSum = totalSum+num;

            currentMax = Math.max(num,currentMax+num);
            globalMax = Math.max(currentMax,globalMax);

            currentMin = Math.min(num,currentMin+num);
            globalMin = Math.min(currentMin,globalMin);
        }

        if(globalMin == totalSum){
            return globalMax;
        }

        return Math.max(globalMax,totalSum-globalMin);

    }

}
