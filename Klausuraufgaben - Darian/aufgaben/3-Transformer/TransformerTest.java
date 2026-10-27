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
        final int[] input = {1,2,3,4};
        final int[] expected = {1,3,6,10};        
        assertArrayEquals(expected, Transformer.toCumulativeSums(input));
    }

}
