public class MinMoves_3736 {
   public static void main(String[] args) {
    int[] nums = {2,1,3};
    int result = minMoves(nums);
    System.out.println("result is  "+ result);

   }

   public static int minMoves(int[] nums) {
        int ans = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
          max = Math.max(max, nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            ans = ans + Math.abs(max-nums[i]);
        }
        return ans;
    }
}
