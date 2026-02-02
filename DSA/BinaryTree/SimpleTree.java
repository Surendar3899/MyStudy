package DSA.BinaryTree;

public class SimpleTree {

    void inorder(TreeNode root) {
        if (root == null){
          return;
        } 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void preorder(TreeNode root){
      if(root == null){
        return;
      }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);

    }


    void postorder(TreeNode root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public int countTotalNodes(TreeNode tree){
        if(tree == null){
            return 0;
        }
        return (countTotalNodes(tree.left))+(countTotalNodes(tree.right))+1;
    }

    public int findTreeLength(TreeNode tree){
        if(tree == null){
            return 0;
        }

        return Math.max(findTreeLength(tree.left),findTreeLength(tree.right))+1;
    }

    public boolean searchElement(TreeNode tree,int val){

        if(tree == null){
            return false;
        }

        if(tree.data == val){
            return true;
        }

        if(tree.data > val){
            return searchElement(tree.left,val);
        }else{
            return searchElement(tree.right,val);
        }

    }

    public int countLeafNodes(TreeNode tree){
        if(tree == null){
            return 0;
        }
        if(tree.right == null && tree.left == null){
            return 1;
        }

        return countLeafNodes(tree.left)+countLeafNodes(tree.right);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.left.left.left = new TreeNode(6);
        tree.left.left.right = new TreeNode(7);


        //Traversals

        // 🔹 1. Inorder (Left → Root → Right)

        SimpleTree st = new SimpleTree();
        st.inorder(tree);
        System.out.println();

        // 🔹 2. Preorder (Root → Left → Right)
        st.preorder(tree);
        System.out.println();


        // 🔹 3. Postorder (Left → Right → Root)
        st.postorder(tree);
        System.out.println();



        TreeNode tree1 = new TreeNode(8);
        st.insert(tree1,6);
        st.insert(tree1,7);
        st.insert(tree1,10);
        st.insert(tree1,5);
        st.insert(tree1,4);
        st.insert(tree1,4);
        st.insert(tree1,12);

        st.inorder(tree1);
        System.out.println();


        int totalNodes = st.countTotalNodes(tree1);
        System.out.println("totalNodes is "+totalNodes);

        int treeLength = st.findTreeLength(tree1);
        System.out.println("treelength is "+treeLength);

        boolean search = st.searchElement(tree1,4);
        System.out.println("search "+search);

        System.out.println();

        st.inordermytry(tree1);
        System.out.println();

        int leafCount = st.countLeafNodes(tree1);
        System.out.println("leafCount is "+leafCount);














    }


    void inordermytry(TreeNode tree){
       if(tree == null){
        return;
       }


       inordermytry(tree.left);
       System.out.print(tree.data+" ");
       inordermytry(tree.right);

    }

}
