import java.util.Arrays;

public class MinMoves2_462 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int result = minMoves2(nums);
        System.out.println("result is "+result);
    }

    public static int minMoves2(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int target = nums[nums.length/2];
        


        for(int i=0;i<nums.length;i++){
            ans  = ans + Math.abs(nums[i] - target);
        }

        return ans;
    }

}
