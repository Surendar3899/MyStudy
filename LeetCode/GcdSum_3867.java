import java.util.Arrays;

public class GcdSum_3867 {

    public static void main(String[] args) {
        int[] nums = {3,6,2,8};
        long ans = gcdSum(nums);
        System.out.println("ans is "+ans);
    }

    public static long gcdSum(int[] nums) {
        long ans = 0l;
        int n = nums.length;
        int[] gcdPrefix = new int[nums.length];
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
            gcdPrefix[i] = gcd(nums[i],max);
        }

        Arrays.sort(gcdPrefix);
         for (int i = 0; i < n / 2; i++) {
            ans += gcd(gcdPrefix[i], gcdPrefix[n - 1 - i]);
        }

        return ans;
    }

    public static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
