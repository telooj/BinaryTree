
public class Main {

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();

        theTree.insert(8);
        theTree.insert(3);
        theTree.insert(12);
        theTree.insert(11);
        theTree.insert(5);
        theTree.insert(7);
        theTree.insert(15);
        theTree.insert(16);
        theTree.insert(1);
        theTree.insert(10);

        System.out.println("I found " + theTree.find(theTree.root,16));
        System.out.println("The minimum value is " + theTree.findMin(theTree.root));
        System.out.println("The maximum value is " + theTree.findMax(theTree.root));
    }
}