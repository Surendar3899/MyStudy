
public class ValidateBinarySearchTree_98 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,new TreeNode(1),new TreeNode(6,new TreeNode(3),new TreeNode(5)));
        boolean result = isValidBST(root);
        System.out.println("result is "+result);

    }

    public static boolean isValidBST(TreeNode root) {
      if(root == null){
        return true;
      }

      if((root.left != null && root.val < root.left.val) || (root.right != null && root.val > root.right.val)){
        return false;
      }
      return isValidBST(root.left) && isValidBST(root.right);
    }

    public static boolean isValidBST2(TreeNode root) {
    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

    private static boolean validate(TreeNode node, long min, long max) {
    if (node == null) return true;

    if (node.val <= min || node.val >= max) return false;

    return validate(node.left, min, node.val) &&
           validate(node.right, node.val, max);
}

//     10
//    /  \
//   5    15
//       /  \
//      6    20

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
