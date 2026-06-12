import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicate(nums);
        System.out.println("result is   "+result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }

}
