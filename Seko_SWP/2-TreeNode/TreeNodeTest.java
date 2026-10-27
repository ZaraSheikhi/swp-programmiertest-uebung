import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeNodeTest {
    
    /**
     * Testet den Beispielfall.
     */
    @Test
    public void theTest() {
        TreeNode root = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        n2.setLeftChild(new TreeNode(1));
        n2.setRightChild(new TreeNode(3));
        TreeNode n7 = new TreeNode(7);
        n7.setLeftChild(new TreeNode(6));
        n7.setRightChild(new TreeNode(9));
        root.setLeftChild(n2);
        root.setRightChild(n7);

        final int expected = 3;
        assertSame(expected, root.countInnerNodes());
    }

}
