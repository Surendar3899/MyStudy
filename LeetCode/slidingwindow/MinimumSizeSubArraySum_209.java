package LeetCode.slidingwindow;

public class MinimumSizeSubArraySum_209 {

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = minSubArrayLen(target,nums);
        System.out.println("result is "+result);
        
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;

        int sum=0;
        int count =Integer.MAX_VALUE;
        while(j<nums.length){
            System.out.println("while "+j);
            sum += nums[j];
            
            while(sum>=target){

              //if(sum >= target){
                 System.out.println("if matched "+i+"  "+j+"  ");
                if((j-i+1)<count){
                 count = j-i+1;
                }
              //}  
              sum -= nums[i];
              i++;
              

            }
           
            j++;
        }

        if(count == Integer.MAX_VALUE){
            return 0;
        }
        return count;
    }

}
