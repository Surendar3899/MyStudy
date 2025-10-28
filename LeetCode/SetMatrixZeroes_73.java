import java.util.Arrays;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
      int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
      setZeroes(matrix); 
    }

    public static void setZeroes(int[][] matrix) {
        boolean[] a = new boolean[matrix.length];
        boolean[] b = new boolean[matrix[0].length];


        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    a[i] = true;
                    b[j] = true;
                }
            }
        }

       


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(a[i] || b[j]){
                    matrix[i][j] = 0;
                }

            }
        }

    }

}
