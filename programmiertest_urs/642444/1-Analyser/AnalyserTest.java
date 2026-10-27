import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse zum Testen des Beispielfalles aus der Aufgabenstellung.
 */
public class AnalyserTest {
    
    @Test
    public void testExample() {
        final int[] input = {7, 3, 2, 7, 1, 3, 7, 1, 7, 0};
        final List<Integer> excluded = List.of(7,1);
        
        assertSame(3, Analyser.getMostFrequentExcluding(input, excluded));
    }

}
