package MyTrys;

public class MinimumSize_209 {
    public static void main(String[] args) {
        int target = 10;
        int[] nums = {2,3,1,2,4,3};
        int result = minSubArrayLen(target,nums);
        System.out.println("result is "+result);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j =0;
        int n = nums.length;

        int sum = 0;

        int count = Integer.MAX_VALUE;

        while(j<n){
            sum = sum+nums[j];
            while(sum>=target){
               if((j-i)+1<count){
                 count=(j-i)+1;
               }
               sum = sum-nums[i];
               i++;
            }
            j++;

        }
        return count;
    }

}
