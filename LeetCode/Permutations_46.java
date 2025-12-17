package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    static int a = 0;
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for(int n:nums){
            li.add(n);
        }
        
        permute1(li,new ArrayList<>(),ans);
        return ans;
    }

    private static void permute1(List<Integer> input, ArrayList output, List<List<Integer>> ans) {

        System.out.println("permute 1 called"+ a++);
        if(input.size() == 0){
            ans.add(new ArrayList<>(output));
            return;
        }

        for(int i=0;i<input.size();i++){
            int f = input.get(i);
            List<Integer> rem = new ArrayList<>();
            rem.addAll(input.subList(0, i));
            rem.addAll(input.subList(i+1, input.size()));
 
            List<Integer> out = new ArrayList<>();
            out.addAll(output);
            out.add(f);

            permute1(new ArrayList<>(rem),new ArrayList<>(out),ans);
        }
    }

    // another method
    /*
     * class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    dfs(nums, new boolean[nums.length], new ArrayList<>(), ans);
    return ans;
  }

  private void dfs(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> ans) {
    if (path.size() == nums.length) {
      ans.add(new ArrayList<>(path));
      return;
    }

    for (int i = 0; i < nums.length; ++i) {
      if (used[i])
        continue;
      used[i] = true;
      path.add(nums[i]);
      dfs(nums, used, path, ans);
      path.remove(path.size() - 1);
      used[i] = false;
    }
  }
}
     */

}
