package DSA.BinaryTree;

public class Main {
    public static void main(String[] args) {
        // Create an instance of BinaryTree
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Perform tree traversals
        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);  // Output: 50 30 20 40 70 60 80

        System.out.println("\nIn-order traversal:");
        tree.inOrderTraversal(tree.root);  // Output: 20 30 40 50 60 70 80

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal(tree.root);  // Output: 20 40 30 60 80 70 50
        System.out.println();
    }
}
