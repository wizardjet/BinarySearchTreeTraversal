public class BinarySearchTree {

    private BinaryTreeNode root = null;

    public BinarySearchTree(int[] array) {
        createTree(array);
    }

    void createTree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            BinaryTreeNode node = new BinaryTreeNode(value);
            if (root == null) {
                root = node;
            } else {
                add(node);
            }
        }
    }

    boolean contains(int n) {
        BinaryTreeNode currentNode = root;
        while (true) {
            if (n == currentNode.value) {
                return true;
            } else if (n < currentNode.value) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else return false;
            } else if (n > currentNode.value) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else return false;
            } else return false;
        }
    }

    void add(BinaryTreeNode node) {
        BinaryTreeNode currentNode = root;
        while (true) {
            if (node.value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }

    void traverse() {
        traverse(root);
    }

    private void traverse(BinaryTreeNode node) {
        if (node.left != null) traverse(node.left);
        System.out.print(node.value);
        if (node.right != null) traverse(node.right);
    }

    BinaryTreeNode getRoot() {
        return root;
    }

}
