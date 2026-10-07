import java.util.Arrays;

public class MaximumElementAfterDecreasingAndReArranging_1846 {

    public static void main(String[] args) {
       int[] arr = {2,2,1,2,1};
       int result = maximumElementAfterDecrementingAndRearranging(arr);
       System.out.println("result is "+result); 
    }

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       Arrays.sort(arr);
       int ans = 1;

       if(arr[0] > 1){
        arr[0] = 1;
       }

       for(int i=1;i<arr.length;i++){
        if(arr[i]-1 > arr[i-1]){
            arr[i] = arr[i-1]+1;
        }
        ans = Math.max(ans, arr[i]);
       }
       
       return ans;
    }

}
