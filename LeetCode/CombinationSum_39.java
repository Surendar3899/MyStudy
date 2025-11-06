package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 6;
        List<List<Integer>> result = combinationSum2(candidates,target);
        System.out.println("result is "+result);

    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();  
       dfs(candidates,0,target,new ArrayList<>(),ans);
       return ans;
    }

    private static void dfs(int[] candidates, int j, int target, ArrayList arrayList, List<List<Integer>> ans) {
        if(target<0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(arrayList));
            return;
        }
        for(int i=j;i<candidates.length;i++){
            arrayList.add(candidates[i]);
            dfs(candidates,i,target-candidates[i],arrayList,ans);
            arrayList.remove(arrayList.size()-1);     
        }
    }




    // public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Arrays.sort(candidates);
    //     dfs(candidates, 0, target, new ArrayList<>(), ans);
    //     return ans;
    // }

    // private static void dfs(int[] candidates, int s, int target, List<Integer> path,
    //                List<List<Integer>> ans) {
    //     if (target < 0){
    //         return;
    //     }
    //     if (target == 0) {
    //         ans.add(new ArrayList<>(path));
    //         return;
    //     }

    //     for (int i = s; i < candidates.length; i++) {
    //         path.add(candidates[i]);
    //         dfs(candidates, i, target - candidates[i], path, ans);
    //         path.remove(path.size() - 1);
    //     }
    // }

}
