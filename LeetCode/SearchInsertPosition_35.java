package LeetCode;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = searchInsert(nums, target);
        System.out.println("result is "+result);


    }

    public static int searchInsert(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int m = (s+e)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                s = m+1;
            }else if(nums[m] > target){
                e = m-1;
            }
        }
       
        return s;

    }

}
