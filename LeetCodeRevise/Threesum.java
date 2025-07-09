import java.util.Arrays;

public class Threesum {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] nums = {-1,2,1,-4,3};
        int target = 1;


        Arrays.sort(nums);

        // -4,-1,1,2
        int result = 0;
        boolean start = false;
        int previous = 0;

        for(int i=0;i+2<nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                
                int difference = nums[i]+nums[l]+nums[r];

                if(previous > Math.abs(target - (difference)) || (previous == 0 && !start)){
                   result = difference;
                   previous = Math.abs(target-Math.abs(difference));
                   start = true;
                }

                if(target >= result){
                    l++;
                }else if(target < result){
                    r--;
                }
            }
        }


        System.out.println(result);

        
        
    }
}
