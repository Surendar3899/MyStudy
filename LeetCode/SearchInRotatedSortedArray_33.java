package LeetCode;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};
        int target = 1;
        int result = search(nums,target);
        System.out.println("result is "+result);
    }
    public  static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;


        while(l<=r){
            
            int m = (l+r)/2;
            if(nums[m] == target){
                return m;
            }

            if(nums[l] <= nums[m]){
              if(nums[l] <= target && target < nums[m]){
                r = m-1;
              }else{
                l = m+1;
              }
            }else{
                if(nums[r] >= target && target > nums[m]){
                   l =m +1; 
                }else{
                    r = m-1;
                }
            }

            
        }
        return -1;
    }
}
