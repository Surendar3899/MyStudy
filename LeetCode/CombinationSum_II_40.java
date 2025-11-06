package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_II_40 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(candidates,target);
        System.out.println("result is "+result);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>  ans = new ArrayList<>();
        dfs(candidates,0,target,new ArrayList<>(),ans);

        return ans;
    }

    private static void dfs(int[] candidates, int s, int target, List<Integer> path, List<List<Integer>> ans) {
        if (target < 0)
            return;
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = s; i < candidates.length; ++i) {
            if (i > s && candidates[i] == candidates[i - 1]){
                continue;
            }    
            path.add(candidates[i]);
            dfs(candidates, i + 1, target - candidates[i], path, ans);
            path.remove(path.size() - 1);
        }
    }

}
