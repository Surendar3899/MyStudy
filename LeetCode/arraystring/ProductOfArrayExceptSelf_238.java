package LeetCode.arraystring;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelfMyry(nums);
        System.out.println("result -- "+Arrays.toString(result));
    }

    public static int[] productExceptSelfMyry(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        Arrays.fill(prefix,1);
        int[] suffix = new int[n];
        Arrays.fill(suffix,1);


        for(int i =1;i<n;i++){
          prefix[i] = prefix[i-1]*nums[i-1];
        }

        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }

        return ans;
    } 


    public static int[] productExceptSelf(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];    // Can also use `nums` as the ans array.
        int[] prefix = new int[n]; // prefix product
        int[] suffix = new int[n]; // suffix product

        prefix[0] = 1;
        for (int i = 1; i < n; i++){
            System.out.println("i value is "+i);
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        System.out.println(Arrays.toString(prefix));

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        System.out.println(Arrays.toString(suffix));


        for (int i = 0; i < n; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }


}
