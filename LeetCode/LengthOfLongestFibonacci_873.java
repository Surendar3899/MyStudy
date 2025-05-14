package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestFibonacci_873 {
    /*
     * Input: arr = [1,3,7,11,12,14,18]
        Output: 3
        Explanation: The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].
     */
    public static void main(String[] args) {
       int[] arr = {1,3,7,11,12,14,18};
       int result = lenLongestFibSubseq(arr);
    }

    public static int lenLongestFibSubseq(int[] arr) {

        /*  List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){  
            int prev = arr[i];
            boolean isAlready = false;
            for(int j=i+1;j<arr.length-1;j++){
               int current = arr[j];
               int target = prev+arr[j];
               List<Integer> temp = new ArrayList<>();
               if(target == arr[j+1]){
                  if(!isAlready){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    isAlready = true;
                    prev = arr[j];
                  }
                  temp.add(arr[j]);
               }

            }
        }*/


        final int n = arr.length;
        int ans = 0;
        int[][] dp = new int[n][n];
        Arrays.stream(dp).forEach(A -> Arrays.fill(A, 2));
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < n; ++i)
        numToIndex.put(arr[i], i);

        for (int j = 0; j < n; ++j)
        
        for (int k = j + 1; k < n; ++k) {
            System.out.println("j is "+j);
            System.out.println("k is "+k);
            final int ai = arr[k] - arr[j];
            System.out.println("ai is "+ai);
            if (ai < arr[j] && numToIndex.containsKey(ai)) {
                System.out.println("if passed");
                final int i = numToIndex.get(ai);
                dp[j][k] = dp[i][j] + 1;
                ans = Math.max(ans, dp[j][k]);
            }
        }

        return ans;



    }
}
