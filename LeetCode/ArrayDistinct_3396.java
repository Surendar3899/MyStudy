package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ArrayDistinct_3396 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int result = minimumOperations(nums);
        System.out.println("result is "+result);
        
    }

    public static int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; --i)
        if (!seen.add(nums[i]))
            return (i + 1 + 2) / 3; // ceil((i + 1) / 3)
        return 0;
    }

}
