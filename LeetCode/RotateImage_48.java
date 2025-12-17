package LeetCode;

import java.util.Arrays;

public class RotateImage_48 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void rotate(int[][] matrix) {
       int i =0;
       int j = matrix.length-1;

       while(i<j){
        int[] temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
        i++;
        j--;
       }


       for(int k=0;k<matrix.length;k++){
         for(int l=k+1;l<matrix.length;l++){
            int temp = matrix[k][l];
            matrix[k][l] = matrix[l][k];
            matrix[l][k] = temp;
         }
       }


    }

}
