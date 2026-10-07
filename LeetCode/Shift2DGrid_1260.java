import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid_1260 {

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        List<List<Integer>> result = shiftGrid(grid, k);
        System.out.println(result);

    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;
        k = k % total;
        int[][] result = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int currentIndex = i * cols + j;
                int newIndex = (currentIndex+k)%total;
                int row = newIndex/cols;
                int column = newIndex % cols;
                result[row][column] = grid[i][j];
            }
        }



        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<rows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<cols;j++){
                list.add(result[i][j]);
            }
            ans.add(list);
        }

        return ans;
    }

}
