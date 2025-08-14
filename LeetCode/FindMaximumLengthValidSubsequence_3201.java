import java.util.Arrays;

public class FindMaximumLengthValidSubsequence_3201 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int result = maximumLength(nums);
        System.out.println("result is "+result);
    }
    
    public static int maximumLength(int[] nums) {
        // dp[i][j] := the maximum length of a valid subsequence, where the last
        // number mod 2 equal to i and the next desired number mod 2 equal to j
        int k = 2;
        int[][] dp = new int[k][k];

        // Extend the pattern xyxyxy...xy.
        for (final int x : nums){
            for (int y = 0; y < 2; ++y){
                dp[x % 2][y] = dp[y][x % 2] + 1;
                System.out.println("ee "+dp[x % 2][y]);
            }    
        }
        
        System.out.println(Arrays.deepToString(dp));

        return Arrays.stream(dp).flatMapToInt(Arrays::stream).max().getAsInt();
    }

    public static int maximumLength2(int[] nums) {
      int ans  = 0;
      for(int i=1;i<nums.length;i++){
        
      }

      return ans;   
    }

}
