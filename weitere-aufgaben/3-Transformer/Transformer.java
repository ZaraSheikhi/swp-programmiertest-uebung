/**
 * Aufgabe 3: Transformer (10 Punkte)
 * 
 * Implementiere die Methode reverseAndShift() gemäß ihres 
 * Javadoc-Kommentars.
 * 
 * Die Methode nimmt das gegebene Array und dreht zunächst die Reihenfolge
 * der Elemente um. Dann verschiebt sie die Elemente um den gegebenen Wert
 * zyklisch nach rechts und gibt das Ergebnis als neues Array zurück.
 * 
 * Beispiel:
 * Gegeben das Array: {1,2,3,4} mit Verschiebung 2.
 * 
 * Dann wird die Reihenfolge der Elemente zunächst umgedreht:
 * {1,2,3,4} -> {4,3,2,1}
 * Dann werden die Elemente zyklisch um 2 Positionen nach rechts
 * verschoben:
 * {4,3,2,1} --shift(2)--> {2,1,3,4}
 * Zurückgegeben wird also das neue Array {2,1,4,3}.
 *
 * Hinweis: Zyklische Verschiebung bedeutet, dass Elemente, die über den
 * rechten Rand hinaus verschoben würden, links wieder eingeschoben werden.
 */

public class Transformer {

    /**
     * Dreht die Reihenfolge der Elemente des gegebenen Arrays um
     * und gibt dann ein neues Array zurück, in dem diese Elemente
     * zyklisch nach rechts um den gegebenen Wert verschoben sind.
     * 
     * Ist das gegebene Array leer, wird ein neues, leeres Array
     * zurückgegeben.
     *
     * @param input Das Eingabe-Array.
     * @param shift Der Wert für die Verschiebung.
     * @return Ein neues Array mit Elementen in umgekehrter Reihenfolge mit
     *         entsprechender Verschiebung.
     * @throws IllegalArgumentException Falls das gegebene Array {@code null}
     *                                  oder {@code shift} kleiner als 1 ist.
     */
    public static int[] reverseAndShift(final int[] input, int shift) {
    }
        
}
