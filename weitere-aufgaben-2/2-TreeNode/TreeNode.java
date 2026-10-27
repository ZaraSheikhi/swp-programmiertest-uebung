/*
 * Aufgabe 2 (10 Punkte):
 *
 * Implementiere die Methode sumOfLeaves() gemäß ihres Javadoc-Kommentars.
 *
 * Die Methode ermittelt die Summe der Werte aller Blattknoten im Baum.
 * 
 * Beispiel:
 * 
 * Gegeben der Baum
 *        4
 *     /     \
 *    2       7
 *   / \     / \
 *  1   3   6   9
 *
 * Wenn dann auf dem Wurzelknoten mit dem Wert 4 die Methode sumOfLeaves()
 * aufgerufen wird, lautet das erwartete Ergebnis 19, da die Blattknoten
 * die Werte 1, 3, 6 und 9 haben und ihre Summe 19 ergibt.
 * 
 * Hinweis: Blattknoten sind Knoten, die keine Nachfolger haben.
*/
/**
 * Realisiert einen Knoten in einem Binärbaum. Ein solcher Knoten hat einen
 * ganzzahligen Wert und einen linken und einen rechten Nachfolger. Die 
 * Nachfolger dürfen dabei auch leer ({@code null}) sein.
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
     * bekommen beide den Wert {@code null}.
     * 
     * @param theValue Der Wert für den neuen Knoten.
     */
    public TreeNode(final int theValue) {
        value = theValue;
    }

    /**
     * Setzt den linken Nachfolger auf den übergebenen Knoten. Eine ggf. 
     * vorhandene Nachfolger-Referenz wird dadurch überschrieben.
     * 
     * @param node Der Knoten, der der neue linke Nachfolger wird.
     */
    public void setLeftChild(final TreeNode node) {
        leftChild = node;
    }

    /**
     * Setzt den rechten Nachfolger auf den übergebenen Knoten. Eine ggf. 
     * vorhandene Nachfolger-Referenz wird dadurch überschrieben.
     * 
     * @param node Der Knoten, der der neue rechte Nachfolger wird.
     */
    public void setRightChild(final TreeNode node) {
        rightChild = node;
    }

    /**
     * Ermittelt die Summe der Werte aller Blattknoten im Baum mit mit diesem
     * Knoten als Wurzel und gibt sie zurück.
     *
     * @return Die Summe der Werte aller Blattknoten im Baum mit diesem 
     *         Knoten als Wurzel.
     */
    public int sumOfLeaves() {
    }

}
