import java.util.*;

public class MissingInteger_2996 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,5};
        int result = missingInteger(nums);
        System.out.println("result is "+result);
    }

    public static int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i=1;i<nums.length;i++){
           if(nums[i] == nums[i-1]+1){
            sum = sum+nums[i];
           }else{
            break;
           }
        }

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        while(set.contains(sum)){
          sum++;
        }

        return sum;
    }

}
