import java.util.*;

/**
 * Aufgabe 3: Transformer (10 Punkte)
 * 
 * Implementiere die Methode toCumulativeSums() gemäß ihres 
 * Javadoc-Kommentars.
 * 
 * Die Methode erstellt ein neues Array und trägt darin die kumulative Summe
 * der Elemente des gegebenen Arrays ein. Die kumulative Summe ist die
 * Summe aus dem Wert des aktuellen Elementes und aller seiner Vorgänger
 * (d. h. von Werten mit kleineren Indizes).
 * 
 * Beispiel:
 * Gegeben das Array: {1,2,3,4}.
 * 
 * Dann lautet das neue Array: {1,3,6,10}.
 * 
 * An Index 0 gibt es keine Vorgänger, d. h. der Wert kann direkt in das neue
 * Array übernommen werden.
 * 
 * An Index 1 ist der Wert 2 und der Wert des Vorgängers (an Index 0) ist 1.
 * Damit ergibt sich der Wert 1+2=3 für das neue Array.
 * 
 * An Index 2 ist der Wert 3 und die Werte der Vorgänger (an Index 0 und
 * Index 1) sind 1 und 2. Damit ergibt sich der Wert 1+2+3=6 für das neue
 * Array.
 * 
 * An Index 3 ist der Wert 4 und die Werte der Vorgänger (an Index 0, 
 * Index 1 und Index 2) sind 1, 2 und 3. Damit ergibt sich der 
 * Wert 1+2+3+4=10 für das neue Array.
 */
public class Transformer {

    /**
     * Erstellt ein neues Array mit der kumulativen Summe der Werte im
     * gegebenen Array und gibt das neue Array zurück.
     * 
     * @param input Das Eingabe-Array.
     * @return Ein neues Array mit den kumulativen Summen der Elemente des
     *         gegebenen Arrays.
     * @throws IllegalArgumentException Falls das gegebene Array {@code null}
     *                                  oder leer ist.
     */
    public static int[] toCumulativeSums(final int[] input) {
        if(input == null || input.length == 0) throw new IllegalArgumentException();
        
        int[] result = new int[input.length];
        int sum = 0;
        result[0] = input[0];
        
        for(int i = 1; i < result.length; i++){
            for(int j = 0; j <= i; j++){
                result[i] += input[j];
            }
            sum = 0;
        }
        
        return result;
    }
        
}
