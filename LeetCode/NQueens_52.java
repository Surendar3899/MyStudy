package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens_52 {

    private static int ans = 0;

    public static void main(String[] args) {
        int n = 4;
        int result = solveNQueens(n);
        System.out.println("result is "+result); 
    }

    public static int solveNQueens(int n) {
        ans  = 0;
        int[] arr = new int[n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rdiag = new HashSet<>();
        Set<Integer> ldiag = new HashSet<>();

        backtrack(n,0,arr,cols,rdiag,ldiag);
        return ans;
        
    }


     private static void backtrack(int n, int row, int[] arr, Set<Integer> cols, Set<Integer> rdiag, Set<Integer> ldiag) {
            
            if(row==n){
               ans++;
               return;
            }
            
            for(int col=0;col<arr.length;col++){
                if(cols.contains(col) || rdiag.contains(row-col) || ldiag.contains(row+col)){
                    continue;
                }

                arr[row] = col;

                cols.add(col);
                rdiag.add(row-col);
                ldiag.add(row+col);

                backtrack(n,row+1,arr,cols,rdiag,ldiag);
                cols.remove(col);
                rdiag.remove(row - col);
                ldiag.remove(row + col);

                


            }
    }


}
