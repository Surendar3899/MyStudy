import java.util.HashSet;
import java.util.Set;

public class MissingMultiple_3718 {

    public static void main(String[] args) {
        int[] nums = {8,2,3,4,6};
        int k = 2;
        int result = missingMultiple(nums, k);
        System.out.println("result is  "+result);
    }

    public static int missingMultiple(int[] nums, int k) {
        int ans  = 0 ;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int i = 1;
        while(true){
            int num = k * i;
            if(!set.contains(num)){
                ans = num;
                break;
            }
            i++; 
        }

        return ans;
    }

}
