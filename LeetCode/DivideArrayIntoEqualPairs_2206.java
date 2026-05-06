import java.util.HashMap;

public class DivideArrayIntoEqualPairs_2206 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean result = divideArray(nums);
        System.out.println("result is "+result);

    }

    public static boolean divideArray(int[] nums) {
        int needCount = nums.length/2;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }

        for(int a:map.values()){
            ans = ans + (a%2==0?a:a-1);
        }

        ans = ans/2;
        System.out.println(ans);
        return ans == needCount;
    }

}
