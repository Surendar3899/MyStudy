package LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ValidSudoku_36 {
    public static void main(String[] args) {


        System.out.println(0/3);
        System.out.println(1/3);
        System.out.println(2/3);
        System.out.println(4/3);

        System.out.println(0%3);
        System.out.println(1%3);
        System.out.println(25%24);
        System.out.println(3%3);


        String[][]   board = 
                        {{"5","3",".",".","7",".",".",".","."}
                        ,{"6",".",".","1","9","5",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}};
        boolean result = isValidSudoku(board);
        System.out.println("result is "+result);                
                    
                    
    }



    public static boolean isValidSudoku(String[][] board) {
        Set<String> seen = new LinkedHashSet<>();

        for (int i = 0; i < 9; ++i){
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == "."){
                    continue;
                }
                final String c = board[i][j];
                if (!seen.add(c + "@row" + i) ||
                    !seen.add(c + "@col" + j) ||
                    !seen.add(c + "@box" + i / 3 + j / 3))
                return false;
            }
        }

        System.out.println(seen);

        return true;
    }


    public static boolean isValidSudoku2(String[][] board){

        Set<String> set = new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == "."){
                    continue;
                }
                String c = board[i][j];
                if(!set.add(c+"row"+i)){
                    return false;
                }
                if(!set.add(c+"column"+j)){
                    return false;
                }
                if(!set.add(c+"box"+i/3+j/3)){
                    return false;
                }
            }
        }
        return true;
    }

}
