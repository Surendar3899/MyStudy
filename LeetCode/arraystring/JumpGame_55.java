package LeetCode.arraystring;

public class JumpGame_55 {
    public static void main(String[] args) {
        int[] nums =  {2,2,1,0,1,4};
        boolean result = canJump3(nums);
        System.out.println("result is "+result);
    }

    public static boolean canJump3(int[] nums) {
        int maxJump = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > maxJump) {
                return false;
            }
            if (maxJump < i + nums[i]) {
                maxJump = i + nums[i];
            }
        }
        return true;
    }

    public static boolean canJump(int[] nums) {
       boolean result = canJump2(nums,0);
       return result;


    }

    public static boolean canJump2(int[] nums,int j) {
        if (j >= nums.length - 1) {
            return true;
        }

        int maxJump = j + nums[j];
        for (int next = j + 1; next <= maxJump && next < nums.length; next++) {
            if (canJump2(nums, next)) {
                return true;
            }
        }

        return false;
    }
}
