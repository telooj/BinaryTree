public class Node {
    int value;

    Node leftChild;
    Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
