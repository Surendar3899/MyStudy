public class MinimumDepthOfBinaryTree_111 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int result = minDepth(root);
        System.out.println("result is "+result);


    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        int leftLength = Integer.MAX_VALUE;

        if(root.left != null){
            leftLength = 1+minDepth(root.left);
        }

         int rightLength = Integer.MAX_VALUE;

        if(root.right != null){
            rightLength = 1+minDepth(root.right);
        }

        return Math.min(leftLength,rightLength);

    }

}
