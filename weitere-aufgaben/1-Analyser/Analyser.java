import java.util.*;

/**
 * Aufgabe 1: Analyser (10 Punkte)
 * 
 * Implementiere die Methode getNumberWithExactFrequency() gemäß ihres
 * Javadoc-Kommentars.
 * 
 * Die Methode ermittelt die Zahl in der Liste, deren Häufigkeit dem gegebenen
 * Wert entspricht.
 * 
 * Beispiel:
 * Gegeben die Liste: 15, 21, 3, 1, 1, 4, 2, 4, 6, 8, 12, 1, 10
 * und die gesuchte Häufigkeit 3.
 * Dann wird die Zahl 1 zurückgegeben, da sie genau dreimal in der Liste 
 * vorkommt. 
 */
public class Analyser {

    /**
     * Gibt die Zahl zurück, deren Häufigkeit in der Liste genau 
     * {@code exactFrequency} beträgt. 
     * Sollte es mehrere solche Zahlen geben, wird eine beliebige davon
     * zurückgegeben.
     *
     * Falls keine Zahl diese Häufigkeit hat, wird -1 zurückgegeben.
     *
     * @param list            Die Eingabe-Liste.
     * @param exactFrequency  Die gesuchte Häufigkeit.
     * @return Eine Zahl, die genau {@code exactFrequency}-mal in der Liste
     *         vorkommt, oder -1, falls keine solche Zahl existiert.
     * @throws IllegalArgumentException Falls die gegebene Liste {@code null}
     *                                  ist oder die gesuchte Häufigkeit 
     *                                  kleiner als 1 ist.
     */
    public static int getNumberWithExactFrequency(final List<Integer> list, final int exactFrequency) {
    }

}
