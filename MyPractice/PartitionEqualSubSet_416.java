package MyPractice;

import java.util.Arrays;

public class PartitionEqualSubSet_416 {
    public static boolean canPartition(int[] nums) {
        int total = 0;
        total = Arrays.stream(nums).sum();

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; 

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 6,23,0};
        System.out.println("Can partition: " + canPartition(nums)); // Output: true
    }
}
