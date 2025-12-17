public class JumpGame {
    public static void main(String[] args) {
//         nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [3,2,1,0,4]
      int[] nums = {3,2,1,1,4};
      boolean result = canJump(nums);
      System.out.println("result is "+result);
    
    }

    public static boolean canJump(int[] nums) {
        int maxjump = nums[0];
        for(int i=1;i<nums.length;i++){
            System.out.println("maxjump is "+maxjump);
            if(maxjump < i){
              return false;
            }

            if(maxjump < i+nums[i]){
                maxjump = i+nums[i];
            }
        }
       return true;
    }

}
