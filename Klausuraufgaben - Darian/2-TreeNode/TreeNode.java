/*
 * Aufgabe 2 (10 Punkte):
 *
 * Implementiere die Methode sumOfEven() gemäß ihres Javadoc-Kommentars.
 *
 * Die Methode berechnet die Summe aller geraden Knotenwerte im Baum mit
 * der entsprechenden Wurzel.
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
 * Wenn dann auf dem Wurzelknoten mit dem Wert 4 die Methode sumOfEven()
 * aufgerufen wird, lautet das erwartete Ergebnis 12, da die geraden 
 * Knotenwerte im Baum 4, 2 und 6 sind und deren Summe 12 ergibt.
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
     * Berechnet die Summe der geraden Werte im Baum mit diesem Knoten als
     * Wurzel.
     *
     * @return Die Summe der geraden Werte im Baum mit diesem Knoten als 
     *         Wurzel.
     */
    public int sumOfEven() {
        int result = 0;
        if(value % 2 == 0){
            result += value;
        }
        if(leftChild != null) result += leftChild.sumOfEven();
        if(rightChild != null) result += rightChild.sumOfEven();
        
        return result;
    }
    
    
}
