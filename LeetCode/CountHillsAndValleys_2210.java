public class CountHillsAndValleys_2210 {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};
        int ans = countHillValley(nums);
        System.out.println("ans is "+ans);
    }

    public static int countHillValley(int[] nums) {
        int ans = 0 ;
        int left = nums[0];

        for (int i = 1; i + 1 < nums.length; ++i){
            if (left < nums[i] && nums[i] > nums[i + 1] || // the hill
                left > nums[i] && nums[i] < nums[i + 1]) { // the valley
                ++ans;
                System.out.println(nums[i]);
                left = nums[i];
            }
        }

        return ans;
        
    }

}
