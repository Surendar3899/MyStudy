import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices_2089 {

    public static void main(String[] args) {
       int[] nums = {1,2,5,2,3};
       int target = 2;
       List<Integer> result = targetIndices(nums, target);
       System.out.println("result is "+result); 
    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        return result;

    }

}
