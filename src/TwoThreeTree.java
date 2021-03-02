public class TwoThreeTree {

    Node currentNode;

    public static Node createNewNode(int k) {
        Node node = new Node();

        node.dataOne = k;
        node.dataTwo = 0;
        node.leftVal = null;
        node.midVal = null;
        node.rightVal = null;
        return node;
    }

    public static Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }

        if (node.dataTwo == 0) {
            if (val >= node.dataOne) {
                node.dataTwo = val;
            } else {
                node.dataTwo = node.dataOne;
                node.dataOne =  val;
            }
            return node;
        }


        if (val < node.dataOne) {
            node.leftVal = insert(node.leftVal, val);
        } else if (val >= node.dataTwo) {
            node.rightVal = insert(node.rightVal, val);
        } else if (val > node.dataOne && val < node.dataTwo) {
            node.midVal = insert(node.midVal, val);
        }

        return node;
    }

    public static void main(String[] args) {
        Node node = null;

        node = insert(node, 8);
        node = insert(node, 3);
        node = insert(node, 6);
        node = insert(node, 10);
        node = insert(node, 4);
        node = insert(node, 7);
        node = insert(node, 14);
        node = insert(node, 13);
    }
}


class Node {
    int dataOne;
    int dataTwo;
    Node parent;
    Node leftVal;
    Node midVal;
    Node rightVal;
}
