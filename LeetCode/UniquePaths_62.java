package LeetCode;

import java.util.Arrays;

public class UniquePaths_62 {

    public static void main(String[] args) {
        int m = 3, n = 7;
        int result = uniquePaths(m,n);
        System.out.println("result is "+result);

    }

    public static  int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; ++i){
            for (int j = 1; j < n; ++j){
                dp[j] += dp[j - 1];
            }
        }    

        return dp[n - 1];
    }

}
