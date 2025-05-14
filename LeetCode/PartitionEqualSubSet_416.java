package LeetCode;

import java.util.Arrays;

public class PartitionEqualSubSet_416 {
    
    public static void main(String[] args) {
        int[] nums = {2,3,2,3};
        boolean result = canPartition(nums);
        System.out.println("result is "+result);
    }


    public static boolean canPartition(int[] nums) {
        final int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1){
            return false;
        }
        return knapsack(nums, sum / 2);
    }

    private static boolean knapsack(int[] nums, int subsetSum) {
        final int n = nums.length;
        System.out.println("n is "+n);
        System.out.println("subsetsum is "+subsetSum);
        //dp[i][j] := true if j can be formed by nums[0..i)
        boolean[][] dp = new boolean[n + 1][subsetSum + 1];
        dp[0][0] = true;
        
        System.out.println(Arrays.deepToString(dp));
        
        for (int i = 1; i <= n; ++i) {
          final int num = nums[i - 1];
          for (int j = 0; j <= subsetSum; ++j){
            if(j < num){
                dp[i][j] = dp[i - 1][j];
                //Arrays.deepToString(dp[i][j]);
            }  
            else{
                System.out.println("dp[i - 1][j] "+dp[i - 1][j]);
                System.out.println("dp[i - 1][j - num] "+dp[i - 1][j - num]);
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - num];
                System.out.println("-----");
                System.out.println(dp[i][j]);
            }  
          }    
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        
        return dp[n][subsetSum];
    }

}
