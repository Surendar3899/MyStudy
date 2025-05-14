package MyTrys;

import java.util.Arrays;

public class TwoDimensionProblem {
    public static void main(String[] args) {
        int[][] pro = {{1,2,3,4}, {4,5,6,9} };
        int result = adjacent(pro);
        System.out.println("result is "+result);
        /*int maxNum = 0;
        for(int i=0;i<pro.length;i++){
            for(int j=0;j<pro[i].length;j++){
                int temp = 0;
                for(int k=0;k<pro.length;k++){
                    for(int l=0;l<pro[i].length;l++){
                        if(i==k && j == l){
                            maxNum += pro[k][l];
                            System.out.println("1st if "+pro[i][j]);
                        }
                        if(!(i==k && j == l) && !(i==k && j+1 == l) && !(i==k && j-1 == l) && !(i+1 == k && j == l) && !(i-1 == k && j == l) ){
                            System.out.println("dd "+i+"     "+j+"         "+k+"             "+l);
                            if(maxNum< maxNum+pro[i][j]){
                                maxNum += pro[k][l];
                                System.out.println("2nd if "+pro[k][l]);
                            }
                        }
                    }
                }
            }
        }*/


        

    }


    public static int adjacent(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0){
         return 0;
        } 
        int n = A[0].length;
        if (n == 1) {
            return Math.max(A[0][0], A[1][0]);
        }    
        int[][] dp = new int[A.length][A[0].length];
        dp[1][0] = Math.max(A[0][0],A[1][0]);
        for(int i = 1; i < A[0].length; i++){
            dp[0][i] = Math.max(dp[1][i-1],dp[0][i-1]);
            dp[1][i] = dp[0][i-1] + Math.max(A[0][i],A[1][i]);
        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        return Math.max(dp[0][n-1],dp[1][n-1]);
    }

}    
      

