import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal_94 {

    public static void main(String[] args) {
       TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5,new TreeNode(6),new TreeNode(7))),new TreeNode(3,null,new TreeNode(8,new TreeNode(9),null)));
       List<Integer> result = inorderTraversal(root);
       System.out.println("result  "+result);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        addList(result,root);
        return result;
    }

    public static void addList(List<Integer> result,TreeNode root){
       if(root == null){
        return;
       }

       addList(result,root.left);
       result.add(root.val);
       addList(result,root.right);
    }

}

// class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
// }
  
