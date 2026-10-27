import java.util.*;

/**
 * Aufgabe 3: Transformer (10 Punkte)
 * 
 * Implementiere die Methode toParityFlags() gemäß ihres 
 * Javadoc-Kommentars.
 * 
 * Die Methode erzeugt ein neues Array und trägt dort ein, ob der Wert
 * im gegebenen Array am gleichen Index eine gerade Zahl war oder nicht.
 * Falls die Zahl am entsprechenden Index gerade ist, so wird eine 1
 * eingetragen, anderenfalls eine 0.
 * 
 * Beispiel:
 * Gegeben das Array: {1,2,3,4,5,6}.
 * 
 * Dann wird das neue Array: {0,1,0,1,0,1} zurückgegeben.
 * 
 * An Index 0 steht die ungerade Zahl 1, also wird im neuen Array an Index 0
 * eine 0 eingetragen.
 * 
 * An Index 1 steht die gerade Zahl 2, also wird im neuen Array am Index 1 
 * eine 1 eingetragen.
 * 
 * An Index 2 steht die ungerade Zahl 3, also wird im neuen Array an Index 2
 * eine 0 eingetragen.
 * 
 * An Index 3 steht die gerade Zahl 4, also wird im neuen Array am Index 3 
 * eine 1 eingetragen.
 * 
 * An Index 4 steht die ungerade Zahl 5, also wird im neuen Array an Index 4
 * eine 0 eingetragen.
 */
public class Transformer {

    /**
     * Erzeugt ein neues Array, in dem am entsprechenden Index eine 1
     * eingetragen wird, wenn das gegebene Array am gleichen Index eine
     * gerade Zahl enthält. Wenn im gegebenen Array am gleichen Index eine
     * ungerade Zahl steht, wird eine 0 in das neue Array eingetragen.
     * 
     * Wenn das gegebene Array leer ist, wird ein neues, leeres Array
     * zurückgegeben.
     *
     * @param input Das Eingabe-Array.
     * @return Ein neues Array mit den Werten 1 und 0, wobei 1 bedeutet, dass
     *         im gegebenen Array am gleichen Index eine gerade Zahl steht
     *         und 0, dass im gegebenen Array am gleichen Index eine
     *         ungerade Zahl steht.
     * @throws IllegalArgumentException Falls das gegebene Array {@code null}
     *                                  ist.
     */
    public static int[] toParityFlags(final int[] input) {
        
        int[] newArray = new int[input.length];
        
        for(int i = 0; i < input.length; i++){
            
        }
    }
        
}
