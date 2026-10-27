/**
 * Realisiert einen Knoten in einem Binärbaum. 
 * Ein solcher Knoten hat einen ganzzahligen Wert und einen linken und einen
 * rechten Nachfolger. Die Nachfolger dürfen dabei auch leer ({@code null})
 * sein.
 */
public class TreeNode {

    /**
     * Der Wert dieses Knotens.
     */
    private final int value;

    /**
     * Der linke Nachfolger dieses Knotens.
     */
    private TreeNode leftChild;

    /**
     * Der rechte Nachfolger dieses Knotens.
     */
    private TreeNode rightChild;

    /**
     * Erzeugt einen neuen Knoten mit dem gegebenen Wert. Die Nachfolger 
     * erhalten beide den Wert {@code null}.
     * 
     * @param theValue Der Wert für den neuen Knoten.
     */
    public TreeNode(final int theValue) {
        value = theValue;
    }

    /**
     * Setzt den linken Nachfolger auf den übergebenen Knoten. 
     * Eine ggf. vorhandene Nachfolger-Referenz wird dadurch überschrieben.
     * 
     * @param node Der Knoten, der der neue linke Nachfolger wird.
     */
    public void setLeftChild(final TreeNode node) {
        leftChild = node;
    }

    /**
     * Setzt den rechten Nachfolger auf den übergebenen Knoten.
     * Eine ggf. vorhandene Nachfolger-Referenz wird dadurch überschrieben.
     * 
     * @param node Der Knoten, der der neue rechte Nachfolger wird.
     */
    public void setRightChild(final TreeNode node) {
        rightChild = node;
    }

    /**
     * Traversiert den Binärbaum mit diesem Knoten als Wurzel in der 
     * Reihenfolge Postorder und gibt die Werte der Knoten in der
     * Besuchsreihenfolge in Form einer Zeichenkette zurück. In dieser
     * Zeichenkette werden die einzelnen Knotenwerte durch ein Komma getrennt.
     * In der Zeichenkette dürfen nur ganze Zahlen und Kommata vorkommen
     * (keine Leerzeichen o. ä.)
     * 
     * Postorder-Traversierung bedeutet, dass zunächst der linke Teilbaum 
     * unterhalb dieses Knotens besucht wird, dann der rechte Teilbaum und
     * zuletzt dieser Knoten selbst.
     * 
     * Beispiel:
     * Gegeben der Baum
     * 
     *        5
     *     /     \
     *    2       7
     *   / \     / \
     *  1   3   6   9
     *
     * Das erwartete Ergebnis lautet hier: "1,3,2,6,9,7,5".
     *
     * @return die Zeichenkette mit den Knotenwerten in der 
     *         Besuchsreihenfolge Postorder
     */
    public String traversePostOrder() {
    }

}
