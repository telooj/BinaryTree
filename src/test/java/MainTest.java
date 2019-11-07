import static org.junit.Assert.*;

class MainTest {
    public static void main(String[] args) {
        BinaryTree testTree = new BinaryTree();

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

        //Test 1: Als je de node met waarde 16 zoekt, krijg je 16 terug.
        assertEquals(testTree.find(testTree.root, 16).toString(), "16");
        //Test 2: Als je de node met waarde 16 zoekt, krijg je niet de node met een andere waarde terug.
        assertNotEquals(testTree.find(testTree.root, 16).toString(), "15");
        //Test 3: Als je de node met de hoogste waarde zoekt, krijg je de hoogste waarde terug.
        assertEquals(testTree.findMax(testTree.root).toString(), "16");
        //Test 4: Als je de node met de hoogste waarde zoekt, krijg je niet een node met een lagere waarde terug.
        assertNotEquals(testTree.findMax(testTree.root).toString(), "7");
        //Test 5: Als je de node met de laagste waarde zoekt, krijg je de laagste waarde terug.
        assertEquals(testTree.findMin(testTree.root).toString(), "1");
        //Test 6: Als je de node met de laagste waarde zoekt, krijg je niet een node met een hogere waarde terug.
        assertNotEquals(testTree.findMin(testTree.root).toString(), "5");

        testTree.insert(-5);
        //Test 7: Na de operatie insert van een node met een lagere waarde dan de laagste waarde, krijg je de nieuwe laagste waarde terug.
        assertEquals(testTree.findMin(testTree.root).toString(), "-5");
        //Test 8: Na de operatie insert van een node met een lagere waarde dan de laagste waarde, krijg je de oude laagste waarde terug.
        assertNotEquals(testTree.findMin(testTree.root).toString(), "1");
        //Test 9: Het zoeken naar een node met een waarde die niet voorkomt, geeft null terug.
        assertNull(testTree.find(testTree.root, 1000));

    }
}