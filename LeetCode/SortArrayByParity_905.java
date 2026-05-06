import java.util.Arrays;

public class SortArrayByParity_905 {

    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));


    }

    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = 0;
        while(end < nums.length){
          if(nums[end] %2 != 0){
            end++;
          }else{
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            end++;
            start++;
          }
        }
        return nums;
    }

}
