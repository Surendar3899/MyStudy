package LeetCode;

class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(){

  }
  TreeNode(int val){
    this.val = val;
  }
  TreeNode(int val,TreeNode left,TreeNode right){
    this.val = val;
    this.left = left;
    this.right = right;
  }

  void inorder(TreeNode root){
      if(root == null){
        return;
      }

      inorder(root.left);
      System.out.println(root.val);
      inorder(root.right);
  }
}

public class ConvertSortArrToBsTree_108 {

    public static void main(String[] args) {
       int[] nums = {-10,-3,0,5,9};
       TreeNode root = sortedArrayToBST(nums);
       root.inorder(root);





        
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
       return build(nums, 0, nums.length - 1,"start"); 
    }

    private static TreeNode build(int[] nums, int l, int r,String from) {
        if (l > r){
            return null;
        }
        final int m = (l + r) / 2;
        System.out.println("m is "+m);
        System.out.println("from is "+from);
        return new TreeNode(nums[m], build(nums, l, m - 1,"left"), build(nums, m + 1, r,"right"));
    }

}
