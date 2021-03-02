package BST;

public class BST {

    public Node createNewNode(int k) {
        Node node = new Node();
        node.data = k;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val >= node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }
}
