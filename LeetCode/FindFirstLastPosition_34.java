import java.util.Arrays;

public class FindFirstLastPosition_34 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] res = searchRange(nums, target);
        System.out.println("res "+Arrays.toString(res));
        
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int m = (s+e)/2;
            int sindex = 0;
            int eindex = 0;
            if(nums[m] == target){
                int previous = m;
                int next     = m;
                while(previous > 0 && nums[previous-1] == target){
                    previous--;
                }
                while(next < e && nums[next+1] == target){
                    next++;
                }
                result[0] = previous;
                result[1] = next;
                return result;
                
                
            }
            if(nums[m] > target){
                e = m-1;
            }
            if(nums[m] < target){
                s = m+1;
            }
        }

        return result;
    }

}
