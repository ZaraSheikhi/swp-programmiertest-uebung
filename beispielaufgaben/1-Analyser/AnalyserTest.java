import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class AnalyserTest {

    /**
     * Test der Methode calcFrequencies für den Beispielfall:
     * <p>
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
    @Test
    public void standardTest() {
        final int[] input ={1,4,5,9,6,2,9,2,1,9};
        final Map<Integer, Integer> expected = Map.of(1,2,2,2,4,1,5,1,6,1,9,3);
        final Map<Integer, Integer> result = Analyser.calcFrequencies(input);
        assertEquals(expected, result);
    }
    
}
