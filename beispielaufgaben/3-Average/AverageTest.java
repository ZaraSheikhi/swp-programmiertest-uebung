import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AverageTest {

    /**
     * Testet den Beispielfall:
     * 
     * Gegeben das Array {1, 3, 2, 7, 2, 0}
     * Der Durchschnitt der Array-Elemente ist 15/6 = 2.5
     */
    @Test
    public void standardTest() {
        final double epsilon = 0.0001; // erlaubte Abweichung
        final int[] input = {1, 3, 2, 7, 2, 0};
        assertEquals(2.5, Average.calcAverage(input), epsilon);
    }

}
