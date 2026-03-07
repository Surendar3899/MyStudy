package LeetCode;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

        
    }
   //Dutch National Flag Algorithm was proposed by Edsger W. Dijkstra.
    public static void sortColors(int[] nums) {

        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        for(int i =0;i<nums.length;i++){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        
    }

}
