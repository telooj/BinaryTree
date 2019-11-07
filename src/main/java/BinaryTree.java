public class BinaryTree {

    public Node root;

    public void insert(int value) {
        //Inserts a new node into the tree.
        Node newNode = new Node(value);

        if(root == null) {
            root = newNode;

        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;

                if(value < focusNode.value) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }

                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(Node focusNode, int value) {
        // Finds and returns the value.
        // Returns null if value does not exist in the tree.
        if (focusNode == null) return null;

        if (focusNode.value == value) {
            return focusNode;

        } else {
            Node left = find(focusNode.leftChild, value);
            Node right = find(focusNode.rightChild, value);

            if (left != null) {
                return left;

            }else {
                return right;
            }
        }
    }

    public Node findMin(Node focusNode) {
        // Finds and returns the minimum value in the tree.
        // Returns null when the tree contains no values.
        if (focusNode == null) return null;
        if (focusNode.leftChild == null) {
            return focusNode;
        } else {
            focusNode = focusNode.leftChild;
            return findMin(focusNode);
        }
    }

    public Node findMax(Node focusNode) {
        // Finds and returns the maximum value in the tree.
        // Returns null when the tree contains no values.
        if (focusNode == null) return null;
        if (focusNode.rightChild == null) {
            return focusNode;
        } else {
            focusNode = focusNode.rightChild;
            return findMax(focusNode);
        }
    }
}