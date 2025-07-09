package LeetCode.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates_442 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);
        System.out.println(result.toString());


    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (final int num : nums) {
            nums[Math.abs(num) - 1] *= -1;
            if (nums[Math.abs(num) - 1] > 0){
                ans.add(Math.abs(num));
            }
            
        }

        return ans;
  }

}
