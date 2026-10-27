import java.util.Map;

/**
 * Aufgabe 1: Analyser (10 Punkte)
 * 
 * Implementiere die Methode calcFrequencies() gemäß ihres Javadoc-Kommentars.
 * 
 * Diese Methode ermittelt, wie häufig eine Zahl in dem Eingabe-Array vorkommt
 * und gibt eine {@code Map} zurück, die jeder vorkommenden Zahl ihre Anzahl
 * zuordnet.
 * 
 * Beispiel:
 * Gegeben das Array {1,4,5,9,6,2,9,2,1,9}
 * Die Zahl 1 kommt darin zweimal vor.
 * Die Zahl 2 kommt darin zweimal vor.
 * Die Zahl 4 kommt darin einmal vor.
 * Die Zahl 5 kommt darin einmal vor.
 * Die Zahl 6 kommt darin einmal vor.
 * Die Zahl 9 kommt darin dreimal vor.
 * Erwartet wird also eine Map mit den Häufigkeiten:
 * 1 -> 2
 * 2 -> 2
 * 4 -> 1
 * 5 -> 1
 * 6 -> 1
 * 9 -> 3
 */
public class Analyser {

    /**
     * Berechnet, wie häufig eine Zahl im gegebenen Array vorkommt
     *
     * @param input Das Eingabe-Array.
     * @return Eine {@code Map}, die jeder im Array vorkommenden Zahl
     *         ihre Anzahl zuordnet.
     * @throws IllegalArgumentException Falls das gegebene Array {@code null}
     *                                  oder leer ist.
     */
    public static Map<Integer, Integer> calcFrequencies(final int[] input) {
    }

}
