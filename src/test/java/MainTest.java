import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    public BinaryTree testTree = new BinaryTree();

    public void test() {
        //fill testTree
        testTree.insert(8);
        testTree.insert(3);
        testTree.insert(12);
        testTree.insert(11);
        testTree.insert(5);
        testTree.insert(7);
        testTree.insert(15);
        testTree.insert(16);
        testTree.insert(1);
        testTree.insert(10);
    }

    @Test
    public void testMethodFindNode() {
        //Als je de node met waarde 16 zoekt, krijg je 16 terug.
        this.test();
        assertEquals("16", testTree.find(testTree.root, 16).toString());
    }

    @Test
    public void testMethodFindMin() {
        //Als je de node met de laagste waarde zoekt, krijg je de laagste waarde terug.
        this.test();
        assertEquals("1", testTree.findMin(testTree.root).toString());
    }

    @Test
    public void testMethodFindMax() {
        //Als je de node met de hoogste waarde zoekt, krijg je de hoogste waarde terug.
        this.test();
        assertEquals("16", testTree.findMax(testTree.root).toString());
    }

    @Test
    public void testSearchingForNotExistingNode() {
        //Het zoeken naar een node met een waarde die niet voorkomt, geeft null terug.
        this.test();
        assertNull(testTree.find(testTree.root, 1000));
    }

    @Test
    public void testFindNewMin() {
        //Na de operatie insert van een node met een lagere waarde dan de laagste waarde, krijg je de nieuwe laagste waarde terug.
        this.test();
        testTree.insert(-5);
        assertEquals("-5", testTree.findMin(testTree.root).toString());
    }

    @Test
    public void testFindNewMax() {
        //Na de operatie insert van een node met een hogere waarde dan de hoogste waarde, krijg je de nieuwe hoogste waarde terug.
        this.test();
        testTree.insert(50);
        assertEquals("50", testTree.findMax(testTree.root).toString());
    }
}