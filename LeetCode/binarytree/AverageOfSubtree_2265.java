import javax.swing.tree.TreeNode;

public class AverageOfSubtree_2265 {
    static int count = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,new TreeNode(8,new TreeNode(0),new TreeNode(1)),new TreeNode(5,null,new TreeNode(6)));
        int result = averageOfSubtree(root);
        System.out.println("result is "+result);
    }

    public static int averageOfSubtree(TreeNode root) {
        int[] res = dfs(root);
        return count;   
    }


    public static int[] dfs(TreeNode root){
        if(root == null){
            return  new int[]{0,0};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int sum = left[0] + right[0] + root.val;
        int countNodes = left[1]+right[1]+1;

        if(sum/countNodes == root.val){
            count++;
        }

        return new int[]{sum,countNodes};
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
