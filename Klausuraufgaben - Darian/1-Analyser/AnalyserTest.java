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
        final int[] array = {3, 7, 2, 7, 1, 3, 1, 7, 0};
        
        assertSame(7, Analyser.getNumberClosestToTargetFrequency(array, 4));
    }

}
