/**
 * Aufgabe 1 (10 Punkte):
 *
 * Implementiere die Methode getNumberClosestToTargetFrequency().
 * 
 * Diese Methode sucht im gegebenen Array von Zahlen nach derjenigen Zahl,
 * die am ehesten so oft vorkommt wie vorgegeben.
 * 
 * Beispiel:
 * Gegeben das Array: {3, 7, 2, 7, 1, 3, 1, 7, 0}
 * und die gesuchte Häufigkeit 4.
 * 
 * Für die Häufigkeiten gilt dann:
 * 0: 1 mal
 * 1: 2 mal
 * 2: 1 mal
 * 3: 2 mal
 * 7: 3 mal
 * 
 * Es gibt also keine Zahl im Array, deren Häufigkeit der gegebenen 
 * Häufigkeit 4 entspricht.
 * Da die Zahl 7 dreimal im Array vorkommt, ist ihre Häufigkeit am nächsten
 * an der gegebenen Häufigkeit 4 und daher wird die Zahl 7 zurückgegeben.
 */
public class Analyser {

    /**
     * Gibt die Zahl zurück, deren Häufigkeit im Array am nächsten an 
     * {@code targetFrequency} liegt. Die Differenz wird absolut betrachtet
     * (|Häufigkeit − targetFrequency|).
     *
     * Sollte es mehrere Zahlen mit gleicher minimaler Distanz geben, wird 
     * eine beliebige davon zurückgegeben.
     *
     * @param input           Das Eingabe-Array.
     * @param targetFrequency Die Zielhäufigkeit.
     * @return Die Zahl, deren Häufigkeit am nächsten an 
     *         {@code targetFrequency} liegt.
     * @throws IllegalArgumentException Falls das Array {@code null} ist oder 
     *         die Zielhäufigkeit kleiner als 1 ist.
     */
    public static int getNumberClosestToTargetFrequency(final int[] array, final int targetFrequency) {
    }

}
