package LeetCode.arraystring;

public class JumpGameII_45 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int result = jump(nums);
        System.out.println("result is "+result);
    }

    public static int jump(int[] nums) {
        int maxJump = 0;
        int current = 0;
        int minJump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (i == current) {
                minJump++;
                current = maxJump;
            }
        }

        return minJump;
    }
}
