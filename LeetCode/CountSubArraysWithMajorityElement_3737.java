public class CountSubArraysWithMajorityElement_3737 {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        int result = countMajoritySubarrays(nums, target);
        System.out.println("result is "+result);
    }

    public static int countMajoritySubarrays(int[] nums, int target) {
        int ans  = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int targetCount = 0;
            for(int j=i;j<n;j++){
               if(nums[j] == target){
                targetCount++;
               }
               int length = j-i+1;
               if(targetCount > length/2){
                ans++;
               }
            }
        }


        return ans;
    }

}
