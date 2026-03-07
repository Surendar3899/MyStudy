package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
       int[] nums = {0,1,2,4,5,7};
       List<String> result = summaryRanges(nums); 
       System.out.println("result is "+result);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int begin = 0;
        int end = 0;
        
        for(int i=0;i<nums.length;i++){


           begin = nums[i];

           while(i+1<nums.length && nums[i] == nums[i+1]-1){
            i++;
           }
           end = nums[i];

           if(begin==end){
            ans.add(""+begin);
           }else{
            ans.add(begin+"->"+end);
           }

        }

        return ans;
    }

}
