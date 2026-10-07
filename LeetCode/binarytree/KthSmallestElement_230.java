public class KthSmallestElement_230 {

    static int count = 0;
    static int answer = 0;

    public static void main(String[] args) {
       TreeNode root = insert(null, 5);
       insert(root, 3);
       insert(root, 6);
       insert(root, 2);
       insert(root, 4);
       insert(root, null);
       insert(root, null);
       insert(root, 1);


    //    preorder(root);
    //    inorder(root);

    int result = kthSmallest(root,3);
    System.out.println("result is "+result);
        
    }

    public static int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return answer;
    }

    public static void inorder(TreeNode root,int k){
        System.out.println("inorder called");
        if(root == null){
            return;
        }
        
        inorder(root.left,k);
        count++;
        if(count == k){
            answer = root.val;
            return;
        }

        inorder(root.right,k);
    }

    public static TreeNode insert(TreeNode root,Integer val){
        if(root == null){
            return new TreeNode(val);
        }

        if(val == null){
            return root;
        }

        if (val == null || root.val > val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void preorder(TreeNode root){
        System.out.println("preorder called");
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    

}

class TreeNode{
    TreeNode left;
    TreeNode right;
    Integer val;

    public TreeNode(){

    }

    public TreeNode(Integer val){
        this.val = val;
    }

    public TreeNode(TreeNode left,TreeNode right,Integer val){
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
