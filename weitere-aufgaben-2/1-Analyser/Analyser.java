import java.util.*; 

/**
 * Aufgabe 2 (10 Punkte):
 *
 * Implementiere die Methode getRarestNumberTieBreakLargest().
 * Die Methode ermittelt die Zahl, die vom gegebenen Iterator am seltensten
 * aufgezählt wird. Sollte es mehrere Zahlen mit derselben niedrigsten
 * Häufigkeit geben, so wird die größte dieser Zahlen zurückgegeben.
 * 
 * Beispiel:
 * Gegeben ein Iterator, der die folgenden Zahlen aufzählt:
 * 8, 7, 6, 4, 6, 7, 8, 9, 6
 * Die Zahlen 4 und 9 kommen jeweils einmal vor, alle anderen Zahlen häufiger.
 * Dann lautet die Rückgabe 9, da 9 größer als 4 ist.
 */
public class Analyser {

    /**
     * Gibt die Zahl zurück, die vom gegebenen Iterator am seltensten 
     * aufgezählt wird.
     * 
     * Sollte es mehrere Zahlen mit derselben niedrigsten Häufigkeit geben,
     * wird die größte dieser Zahlen zurückgegeben.
     *
     * @param it Der Iterator, der die Zahlen aufzählt.
     * @return Die am seltensten vorkommende Zahl (bei Gleichstand: die 
     *         größte).
     * @throws IllegalArgumentException Falls {@code it} null ist oder keine
     *                                  Werte aufzählt.
     */
    public static int getRarestNumberTieBreakLargest(final Iterator<Integer> it) {
    }

}
