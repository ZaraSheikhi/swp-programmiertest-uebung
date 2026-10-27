import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TreeNodeTest {

    /**
     * Testet den Beispielfall.
     * 
     * Gegeben der Baum
     *        5
     *     /     \
     *    2       7
     *   / \     / \
     *  1   3   6   9
     *
     * Das erwartete Ergebnis lautet hier: "1,3,2,6,9,7,5".
     */
    @Test
    public void theTest() {
        TreeNode root = new TreeNode(5);
        TreeNode n2 = new TreeNode(2);
        n2.setLeftChild(new TreeNode(1));
        n2.setRightChild(new TreeNode(3));
        TreeNode n7 = new TreeNode(7);
        n7.setLeftChild(new TreeNode(6));
        n7.setRightChild(new TreeNode(9));
        root.setLeftChild(n2);
        root.setRightChild(n7);

        final String expected = "1,3,2,6,9,7,5";
        final String result = root.traversePostOrder();
        assertEquals(expected, result);
    }

}
