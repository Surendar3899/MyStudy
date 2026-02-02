package LeetCode;

public class Search2DMatrix_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean result = searchMatrix(matrix,target);
        System.out.println("result is "+result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m*n;

        while(l<r){
            int mid = (l+r)/2;
            int i = mid/n;
            int j = mid%n;

            if(matrix[i][j] == target){
                return true;
            }

            if(matrix[i][j] > target){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return false;
    }

}
