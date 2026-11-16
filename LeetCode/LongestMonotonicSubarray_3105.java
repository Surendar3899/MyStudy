public class LongestMonotonicSubarray_3105 {

    public static void main(String[] args) {
        int[] nums = {1,4,3,3,2};
        int result = longestMonotonicSubarray(nums);
        System.out.println("result is "+result);
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int globalDec = 1;
        int globalInc =1;
        int inc = 1;
        int dec = 1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec = 1;
            }else if(nums[i] < nums[i-1]){
                dec++;
                inc = 1;
            }else{
                inc = 1;
                dec = 1;
            }
            globalDec = Math.max(globalDec, dec);
            globalInc = Math.max(globalInc, inc);    
        }


        return Math.max(globalInc, globalDec);
    }

}
