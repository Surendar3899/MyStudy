package MyTrys;

import java.util.ArrayList;
import java.util.List;

public class IntPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> permute(int[] nums) {
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
            bs[i] = true;
            path.add(nums[i]);
            dfs(nums,bs,path,ans);
            bs[i] = false;
            path.remove(path.size()-1);

        }
    }

}
