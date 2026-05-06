import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static  void moveZeroes(int[] nums) {
        int i = 0;
        for(int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }

        for(;i<nums.length;i++){
            nums[i] = 0;
        }
    }

}
