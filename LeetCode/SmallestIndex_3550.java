public class SmallestIndex_3550 {

    public static void main(String[] args) {
        int[]  nums = {1,10,11};
        int result = smallestIndex(nums);
        System.out.println("result is "+result);
    }

    public static int smallestIndex(int[] nums) {
        int ans  = -1;

        for(int i=0;i<nums.length;i++){
            String num = String.valueOf(nums[i]);
            int n = 0;
            for(int j=0;j<num.length();j++){
               n = n + (num.charAt(j)-'0');
            }
            if(n == i){
                ans = i;
                break;
            }
        }

        return  ans;

    }

}
