public class MissingNumber_268 {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int result = missingNumber(nums);
        System.out.println("result is "+result);
    }

    public static int missingNumber(int[] nums) {
       int ans = 0;

       int[] count = new int[nums.length+1];

       for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
       }

       for(int i=0;i<count.length;i++){
        if(count[i] == 0){
            ans = i;
            break;
        }
       }
       
       return ans;
    }

}
