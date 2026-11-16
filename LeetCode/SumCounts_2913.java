import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumCounts_2913 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,1);
        int result = sumCounts(nums);
        System.out.println("result is "+result);
    }

    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int result = 0 ;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums.get(j));
                int distinctCount = set.size();
                result = result + (distinctCount*distinctCount);
            }
        }

        return result;
    }

}
