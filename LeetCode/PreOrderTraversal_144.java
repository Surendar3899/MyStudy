import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal_144 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(6),new TreeNode(7))),new TreeNode(3,null,new TreeNode(8,new TreeNode(9),null)));
        List<Integer> result = preorderTraversal(root);
        System.out.println("result is "+result);
        
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        process(root,ans);
        return ans;
    }

    public static void process(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }

        ans.add(root.val);

        process(root.left, ans);
        process(root.right, ans);
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
