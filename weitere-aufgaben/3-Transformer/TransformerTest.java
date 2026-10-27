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
        final int[] input = {1,2,3,4}; // => {4,3,2,1}
        final int shift = 2;
        final int[] expected = {2,1,4,3};        
        assertArrayEquals(expected, Transformer.reverseAndShift(input, shift));
    }

}
