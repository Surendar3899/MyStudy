import java.util.Scanner;

public class DPQUESTION {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     long[] A = new long[n + 1]; // 1-based

    //     for (int i = 1; i <= n; i++) {
    //         A[i] = sc.nextLong();
    //     }

    //     long[] dp = new long[n + 1];

    //     // Start from index 1 (score = 0 initially)
    //     dp[1] = 0;

    //     for (int i = 1; i <= n; i++) {

    //         // If reachable
    //         if (i != 1 && dp[i] == 0) continue;

    //         for (int j = 2 * i; j <= n; j += i) {
    //             dp[j] = Math.max(dp[j], dp[i] + A[j]);
    //         }
    //     }

    //     long ans = 0;
    //     for (int i = 1; i <= n; i++) {
    //         ans = Math.max(ans, dp[i]);
    //     }

    //     System.out.println(ans);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n + 1]; // 1-based indexing

        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextLong();
        }

        long[] dp = new long[n + 1];

        // Traverse from back
        for (int i = n; i >= 1; i--) {

            long best = 0; // best dp among multiples

            for (int j = 2 * i; j <= n; j += i) {
                best = Math.max(best, dp[j]);
            }

            dp[i] = A[i] + best;
        }

        System.out.println(dp[1]);
    }

}
