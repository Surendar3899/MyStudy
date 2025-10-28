import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,1};
        int result = singleNumber(nums);
        System.out.println("result is "+result);

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> ma:map.entrySet()){
            if(ma.getValue() == 1){
                return ma.getKey();
            }
        }
        return 0;
    }

}
