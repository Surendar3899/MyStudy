public class ClimbingStairs_01 {
    static int ans2 = 0;
    // public static void main(String[] args) {
    //     int n =44;
    //     int count = 0;
    //     int[] ans = new int[1];
    //     int start = 1;
    //     int lastused =1;
    //     int lastused2 = 2;
    //     int total =0;
    //     check(n,lastused,total);
    //     check(n,lastused2,total);
    //     System.out.println("ans is "+ans[0]);
    //     System.out.println(ClimbingStairs_01.ans2);
    // }

    // private static void check(int n,int lastused,int total) {
    //         total = total+lastused;
    //         if(total == n){
    //           System.out.println("if passed");
    //           ClimbingStairs_01.ans2++;
    //           return;
    //         }

    //         if (total > n) {
    //             return;  // overshoot, stop recursion
    //         }
            
            

    //         check(n,1,total);
    //         check(n,2,total);
            
    // }

    
   
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = check(n, 0,"start");
    //     System.out.println("ans is " + ans);
    // }

    // private static int check(int n, int total,String which) {
    //     System.out.println("which is "+which);
    //     if (total == n) {
    //         return 1;
    //     }
    //     if (total > n) {
    //         return 0;
    //     }
    //     // choose 1 step or 2 steps
    //     return check(n, total + 1,"first") + check(n, total + 2,"second");
    // }




    public static void main(String[] args) {
        int n = 4;
        int result = climbStairs2(n);
        System.out.println("result is "+result);
    }



    // space o(n)
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
        
    }




    //space o(1)
    public static int climbStairs2(int n) {
        int a = 1;
        int b = 1;

        for(int i=2;i<=n;i++){
            int c = a+b;
            b = a;
            a = c;

        }
        return a;
    }


     

}
