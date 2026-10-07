import java.util.Arrays;

public class FirstStableIndex_3903 {

    public static void main(String[] args) {
        int[] nums = {5,0,1,4};
        int k = 3;
        int result = firstStableIndex(nums, k);
        System.out.println("result is  "+result);
    }

    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minArr = new int[n];

        minArr[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--){
            minArr[i] = Math.min(minArr[i+1], nums[i]);
        }

        System.out.println(Arrays.toString(minArr));

        int max = 0;
        for(int i = 0;i < n;i++){
           max = Math.max(max, nums[i]);
           if(max - minArr[i] <= k){
            return i;
           }
        }

        return -1;
    }

}
