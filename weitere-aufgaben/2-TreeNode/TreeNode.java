/*
 * Aufgabe 2 (10 Punkte):
 *
 * Implementiere die Methode calcSum() gemäß ihres Javadoc-Kommentars.
 * 
 * Die Methode berechnet die Summe aller Knotenwerte im Baum, ausgehend vom
 * gewählten Knoten als Wurzel.
 * 
 * Beispiel:
 * 
 * Gegeben der Baum
 *        5
 *     /     \
 *    2       7
 *   / \     / \
 *  1   3   6   9
 *
 * Wird die Methode calcSum() auf dem Knoten mit dem Wert 5 als Wurzel
 * aufgerufen, dann lautet das Ergebnis 5+2+1+3+7+6+9 = 33, da die Summe
 * der Werte in allen Knoten in dem Baum mit 5 als Wurzel 33 ergibt.
 */ 
/**
 * Realisiert einen Knoten in einem Binärbaum. Ein solcher Knoten hat einen
 * ganzzahligen Wert und einen linken und einen rechten Nachfolger.
 * Die Nachfolger dürfen dabei auch leer ({@code null}) sein.
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
     * Berechnet die Summe aller Knotenwerte im Teilbaum mit diesem Knoten
     * als Wurzel.
     *
     * @return Die Summe aller Knotenwerte
     */
    public int calcSum() {
    }

}
