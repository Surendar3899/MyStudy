import java.util.*;

public class FindTheMaximumNumberOfElementsInSubset_3020 {
    public static void main(String[] args) {
        int[] nums = {5,4,1,2,2};
        int result = maximumLength(nums);
        System.out.println("result is "+result);
    }

    public static int maximumLength(int[] nums) {
        int ans  = 0;

        Map<Integer,Integer> count = new HashMap<>();
        int max = 0;
        for(int num:nums){
          count.put(num,count.getOrDefault(num, 0)+1);
          max = Math.max(num, max);
        }


        if(count.containsKey(1)){
            ans = count.get(1) %2 == 0 ? count.get(1)-1: count.get(1);
        }

        
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){

            if(entry.getKey() == 1){
                continue;
            }
            int length = 0;
            int x = entry.getKey();
            while(x <= max && count.getOrDefault(x,0) >= 2){
              length = length + 2;
              x = x * x;
            }

            if(count.containsKey(x)){
                length = length+1;
            }else{
                length = length - 1;
            }

            ans = Math.max(ans, length);
        }

        return ans;
    }

}
