import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse zum Testen des Beispielfalles aus der Aufgabenstellung.
 */
public class TransformerTest {

    @Test
    public void testExample() {
        final int[] input = {1,2,3,4,5};
        final int[] expected = {0,1,0,1,0};        
        assertArrayEquals(expected, Transformer.toParityFlags(input));
    }

}
