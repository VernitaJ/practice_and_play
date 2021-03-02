package BST;

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;

        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 10);
        root = bst.insert(root, 4);
        root = bst.insert(root, 7);
        root = bst.insert(root, 14);
        root = bst.insert(root, 13);
    }
}