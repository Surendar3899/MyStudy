package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PermutationsII_47 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> algoTamilaMethod(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int c = map.getOrDefault(num,0);
            map.put(num,c+1);
        }

        myTry(nums,result,new ArrayList(),map);


        return result;
    }

    private static void myTry(int[] nums, List<List<Integer>> result,List<Integer> curr, HashMap<Integer, Integer> map) {
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
        }

        for(int a:map.keySet()){
            if(map.get(a) > 0){
                curr.add(a);
                map.put(a,map.get(a)-1);
                myTry(nums,result,curr,map);
                curr.remove(curr.size()-1);
                map.put(a,map.get(a)+1);
            }
        }
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
             System.out.println("i value "+i);          
            if(bs[i]){
                continue;
            }

            if(i>0 && nums[i] == nums[i-1] && !bs[i-1]){
                System.out.println(i);
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
