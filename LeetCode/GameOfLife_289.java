package LeetCode;

import java.util.Arrays;

public class GameOfLife_289 {
  public static void main(String[] args) {
    int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
    gameOfLife(board);
    System.out.println(Arrays.deepToString(board));
    //[[0,0,0],[1,0,1],[0,1,1],[0,1,0]]

  }

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1}; 

        for(int i = 0;i < m; i++){
            for(int j=0; j<n; j++){
                int liveneighbours = 0;
               for(int k=0;k<8;k++){
                int ni = i+dx[k];
                int nj = j+dy[k];
                if(ni>=0 && ni<m && nj >= 0 && nj < n){
                    if(board[ni][nj] == 1 || board[ni][nj] == -1){
                      liveneighbours++;
                    }
                }
               
               }
                if(board[i][j] == 1 && (liveneighbours < 2 || liveneighbours > 3)){
                    board[i][j] = -1;
                }
                if(board[i][j] == 0 && liveneighbours == 3){
                    board[i][j] = 2;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] > 0){
                    board[i][j] = 1;
                }else{
                    board[i][j] = 0;
                }
            }
        }
        
    }
}
