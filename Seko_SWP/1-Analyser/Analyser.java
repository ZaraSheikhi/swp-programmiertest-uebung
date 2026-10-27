import java.util.*;

/**
 * Aufgabe 1 (10 Punkte):
 * 
 * Implementiere die Methode getMostFrequentExcluding().
 * 
 * Die Methode ermittelt die häufigste Zahl im gegebenen Array, die nicht
 * durch die gegebene Liste ausgeschlossen wird.
 * 
 * Beispiel:
 * Gegeben das Array: {7, 3, 2, 7, 1, 3, 7, 1, 7, 0} und
 * die Liste: 7, 1
 * 
 * Für die Häufigkeiten im Array gilt:
 * 0: 1
 * 1: 2
 * 2: 1
 * 3: 2
 * 7: 4
 * 7 ist die häufigste Zahl, aber ausgeschlossen. 1 und 3 sind die beiden
 * Zahlen mit der nächsten Häufigkeit, aber 1 ist ebenfalls ausgeschlossen.
 * Damit lautet die Rückgabe in diesem Fall 3.
 */
public class Analyser {

    /**
     * Gibt die Zahl zurück, die im Eingabe-Array am häufigsten vorkommt,
     * und nicht in der Liste {@code excluded} enthalten ist.
     * 
     * Sollte es mehrere Zahlen mit derselben höchsten Häufigkeit geben,
     * wird eine beliebige davon zurückgegeben.
     * 
     * Falls alle Zahlen im Array in {@code excluded} stehen (oder das Array
     * leer ist), wird -1 zurückgegeben.
     *
     * @param input     Das Eingabe-Array.
     * @param excluded  Liste von Zahlen, die aus der Betrachtung 
     *                  ausgeschlossen werden sollen.
     * @return Die am häufigsten vorkommende Zahl, die nicht in 
     *         {@code excluded} ist, oder -1, falls keine solche Zahl 
     *         existiert.
     * @throws IllegalArgumentException Falls {@code input == null} oder
     *                                  {@code excluded == null}.
     */
    public static int getMostFrequentExcluding(final int[] input, final List<Integer> excluded) {
        
        if(input == null || excluded == null){
            throw new IllegalArgumentException();
        }
        
        HashMap<Integer, Integer> anzahl = new HashMap();
        
        for(int i = 0; i < input.length; i++){
            if(anzahl.containsKey(input[i])){
                int bisher = anzahl.get(input[i]);
                bisher++;
                anzahl.put(input[i], bisher);
            } else {
                anzahl.put(input[i], 1);
            }
        }
        int max = input[0];
        int häufig = anzahl.get(input[0]);
        
        for(anzahl x : ){
            
            
        }
        
        
        
        
        
            
        
            
    }
        
}
                
                
            
                
                
            
        
    


