import java.util.Arrays;

public class Converted1DArrayto2DArray_2022 {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m = 2, n = 2;
        int[][] result = construct2DArray(original,m,n);
        System.out.println("result is "+Arrays.deepToString(result));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int r = 0;
        int i = 0;

        if(original.length != (m*n)){
            return new int[0][0];
        }

        while(r < m){
            int c = 0;
            while(c < n){
                ans[r][c] = original[i];
                i++;
                c++;
            }
            r++;

        }


        return ans;
    }

}
