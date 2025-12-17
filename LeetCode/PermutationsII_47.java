package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII_47 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

     private static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums,new boolean[nums.length],new ArrayList<>(),ans);
        return ans;
    }

    private static void dfs(int[] nums, boolean[] bs, List<Integer> path, List<List<Integer>> ans) {
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }



        for(int i=0;i<nums.length;i++){
                       
            if(bs[i]){
                continue;
            }

            if(i>0 && nums[i] == nums[i-1] && !bs[i-1]){
                continue;
            }
            bs[i] = true;
            path.add(nums[i]);
            dfs(nums,bs,path,ans);
            bs[i] = false;
            path.remove(path.size()-1);
            

        }
    }


}
