import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal_145 {

    public static void main(String[] args) {
       TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(6),new TreeNode(7))),new TreeNode(3,null,new TreeNode(8,new TreeNode(9),null))); 
       List<Integer> result = postorderTraversal(root);
       System.out.println("result is "+result);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root,ans);
        return ans;
    }

    public static void postOrder(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
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
