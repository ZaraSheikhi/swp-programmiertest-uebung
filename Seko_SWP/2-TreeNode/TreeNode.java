/*
 * Aufgabe 2 (10 Punkte):
 *
 * Implementiere die Methode countInnerNodes() gemäß ihres Javadoc-Kommentars.
 *
 * Die Methode ermittelt die Anzahl aller inneren Knoten im Baum und gibt sie
 * zurück.
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
 * Wenn dann auf dem Wurzelknoten mit dem Wert 4 die Methode countInnerNodes()
 * aufgerufen wird, lautet das erwartete Ergebnis 3, da der Baum die inneren
 * Knoten 4, 2 und 7 hat.
 *
 * Hinweis: Ein innerer Knoten ist ein Knoten, der mindestens einen Nachfolger
 *          hat.
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
     * Ermittelt die Anzahl der inneren Knoten im Baum mit diesem Knoten als
     * Wurzel und gibt diese Anzahl zurück.
     *
     * @return Die Anzahl der inneren Knoten im Baum mit diesem Knoten als 
     *         Wurzel.
     */
    public int countInnerNodes() {
        
        int count = 0;
        if(leftChild != null){
            count++;
        }
        if(rightChild != null){
            count++;
        }
        return 1 + leftChild.countInnerNodes() + rightChild.countInnerNodes();
        
    }
    

}
