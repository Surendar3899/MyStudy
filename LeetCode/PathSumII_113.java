import java.util.ArrayList;
import java.util.List;

public class PathSumII_113 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),new TreeNode(8,new TreeNode(13),new TreeNode(4,new TreeNode(5),new TreeNode(1))));
        int targetSum = 22;
        List<List<Integer>> result = pathSum(root,targetSum);
        System.out.println("result is "+result);

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,targetSum,0,ans,new ArrayList<>());
        return ans;
    }

    private static void dfs(TreeNode root, int targetSum, int currentSum, List<List<Integer>> ans, ArrayList<Integer> path) {
        System.out.println("currentsum is "+currentSum);
        if(root == null){
            System.out.println("ifffff");
            return;
        }

        currentSum += root.val;
        path.add(root.val);
        
        if(root.left == null && root.right == null && currentSum == targetSum){
            System.out.println("if passed");
            ans.add(new ArrayList<>(path));
            
        }

       

        

        
        dfs(root.left,targetSum,currentSum,ans,path);
        dfs(root.right,targetSum,currentSum,ans,path);
        path.remove(path.size()-1);

    }

   

}


class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
