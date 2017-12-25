public class BinarySearchTree {

    private BinaryTreeNode root = null;

    public BinarySearchTree(int[] array) {
        createTree(array);
    }

    void createTree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (root == null) {
                root = new BinaryTreeNode(value);
            } else {
                BinaryTreeNode currentNode = root;
                BinaryTreeNode newNode = new BinaryTreeNode(value);
                while (true) {
                    if (value < currentNode.value) {
                        if (currentNode.left == null) {
                            currentNode.left = newNode;
                            break;
                        } else {
                            currentNode = currentNode.left;
                        }
                    } else {
                        if (currentNode.right == null) {
                            currentNode.right = newNode;
                            break;
                        } else {
                            currentNode = currentNode.right;
                        }
                    }
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