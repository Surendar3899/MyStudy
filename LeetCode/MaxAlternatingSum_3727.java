import java.util.Arrays;

public class MaxAlternatingSum_3727 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        long result = maxAlternatingSum(nums);
        System.out.println("result is "+result);
    }

    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long result = 0 ;
        int[] squares = new int[n];
        for(int i=0;i<n;i++){
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);
        int mid = n/2;

        for(int i=0;i<mid;i++){
            result = result - squares[i];
        }

        for(int i=mid;i<n;i++){
            result = result + squares[i];
        }



        return  result;

    }

}
