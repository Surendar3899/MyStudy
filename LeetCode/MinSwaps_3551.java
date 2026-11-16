import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSwaps_3551 {

    public static void main(String[] args) {
       int[] arr = {18,43,34,16};
       int result = minSwaps(arr);
       System.out.println("result is "+result);

    
       
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr,(a,b)->{
            int sumA = digitSum(a);
            int sumB = digitSum(b);
            if(sumA != sumB){
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a,b);
        });

        System.out.println(Arrays.toString(arr));


         // Map each number to its target index
        Map<Integer, Integer> targetIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            targetIndex.put(arr[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps  = 0 ;

         // Count permutation cycles
        for (int i = 0; i < n; i++) {
            if (visited[i] || targetIndex.get(nums[i]) == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = targetIndex.get(nums[j]);
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }
        return swaps;
    }

    public static int digitSum(int num){
      int sum = 0;
      while(num > 0){
         sum = sum + num % 10;
         num = num /10;
      }
      return sum;
    }

}
