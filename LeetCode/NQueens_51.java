package LeetCode;

import java.util.*;

public class NQueens_51 {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        System.out.println("result is "+result);

    }


    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[] arr = new int[n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rdiag = new HashSet<>();
        Set<Integer> ldiag = new HashSet<>();

        backtrack(n,0,arr,cols,rdiag,ldiag,ans);
        return ans;
        
    }


    private static void backtrack(int n, int row, int[] arr, Set<Integer> cols, Set<Integer> rdiag, Set<Integer> ldiag,
            List<List<String>> ans) {
            if(row==n){
               List<String> board = new ArrayList<>();
                for (int r = 0; r < n; r++) {
                    char[] rowArr = new char[n];
                    Arrays.fill(rowArr, '.');
                    rowArr[arr[r]] = 'Q';
                    board.add(new String(rowArr));
                }
                ans.add(board);
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

                backtrack(n,row+1,arr,cols,rdiag,ldiag,ans);
                cols.remove(col);
                rdiag.remove(row - col);
                ldiag.remove(row + col);

                


            }
    }

}
