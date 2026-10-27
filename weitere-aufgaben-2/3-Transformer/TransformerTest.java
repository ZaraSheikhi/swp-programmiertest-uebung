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
        final int[] input = {1,2,3,4,5,6,7,8};
        final int[] expected = {2,4,6,8};
        assertArrayEquals(expected, Transformer.unzip(input));
    }

}
