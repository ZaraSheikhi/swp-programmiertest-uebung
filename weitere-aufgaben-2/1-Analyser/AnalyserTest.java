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
        final Iterator<Integer> it = List.of(8, 7, 6, 4, 6, 7, 8, 9, 6).iterator();
        
        assertSame(9, Analyser.getRarestNumberTieBreakLargest(it));
    }

}
