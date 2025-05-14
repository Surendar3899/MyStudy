package DSA.BinaryTree;

public class BinaryTree {
    // Root node of the binary tree
    TreeNode root;

    // Constructor to initialize the binary tree
    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a node into the binary tree
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);  // If the tree is empty, create a new node
        }

        // Recursively insert the data
        if (data < root.data) {
            root.left = insert(root.left, data);  // Insert in the left subtree
        } else if (data > root.data) {
            root.right = insert(root.right, data);  // Insert in the right subtree
        }

        return root;  // Return the (unchanged) node pointer
    }

    // Pre-order traversal (root, left, right)
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");  // Print root
            preOrderTraversal(node.left);  // Visit left subtree
            preOrderTraversal(node.right);  // Visit right subtree
        }
    }

    // In-order traversal (left, root, right)
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);  // Visit left subtree
            System.out.print(node.data + " ");  // Print root
            inOrderTraversal(node.right);  // Visit right subtree
        }
    }

    // Post-order traversal (left, right, root)
    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);  // Visit left subtree
            postOrderTraversal(node.right);  // Visit right subtree
            System.out.print(node.data + " ");  // Print root
        }
    }
}
